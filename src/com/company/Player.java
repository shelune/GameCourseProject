package com.company;

import java.util.*;

public class Player {

    private Random rand = new Random();
    public static Scanner input = new Scanner(System.in);
    private Events events = new Events();                       // Initiate events
    private Dialogue dialogue = new Dialogue();                 // Initiate dialogues
    private Map map = new Map();                                // Initiate map
    private Inventory inventory = new Inventory();    // Initiate inventory

    private String playerName;
    private String playerDescription;
    private int playerStamina;                                  // STAMINA (literally health)
    private int playerCrg = 10;                                 // COURAGE
    private int playerUnd = 10;                                 // UNDERSTANDING
    private int playerAbn = 10;                                 // ABNORMALITY
    private int playerPos = 0;

    private int staminaPerMove = 8 + rand.nextInt(12);          // stamina cost when moving around the map

    private int dayCount = 1;                                   // DAY COUNT!!!!

    public Player(String name, String description, int stamina) {
        this.playerName = name;
        this.playerDescription = description;
        this.playerStamina = stamina;
        Collections.addAll(events.getEventList(), "HM", "CA");  // give player access to Home and ClassA
    }

    public void start() {
        getPlayer();                                            // Create a player @l.214
        boolean gameRun = true;

        GAME:                                                   // main loop
        while (gameRun) {
            while (dayCount < 21 && playerStamina > 25) {
                if (events.isTriggered("GAMEOVER")) {
                    printGameOver();
                }
                switch (dayCount) {                             // this switch is for night events
                    case 1:
                        events.getEventFirstNight(this);
                        break;
                    case 7:
                        if (!events.isTriggered("MT")) {
                            say("You are unable to solve the mystery of Janitor's death.");
                            events.setEventTrigger("GAMEOVER");
                        }
                        break;
                    case 11:
                        if (!events.isTriggered("10A")) {
                            say("You are unable to solve the mystery of the Tattooist's death.");
                            events.setEventTrigger("GAMEOVER");
                        }
                }
                printGameOver();
                say("\t \t \t \t \t \t \t \t \t \t [DAY : " + dayCount + "]");
                System.out.println(events.getEventList());
                printPlayerStamina();
                printAllStats();
                map.printPlace(playerPos);
                notice();
                actions();                                      // all actions available
            }
            rest();
        }
    }

    public void notice() {
        switch (dayCount) {
            case 4:
                if (!events.isTriggered("MT")) {
                    say("Probably you want to visit the Janitor's house today after class.");
                }
                break;
        }
    }

    public void actions() {
        say(dialogue.getGeneralOpts());
        int choice = events.takeInput(6);
        switch (choice) {
            case 1:                                                     // Go to places
                events.getEventFirstSeeNumbers(this);                   // event 1A
                if (dayCount == 7) {
                    events.getEvent7A(this);
                    events.getEvent7B(this);
                    events.getEvent7C(this);
                    return;
                }
                if (dayCount == 14) {
                    events.getHangOut(this);
                    events.getSeeWomanNumber(this, inventory);
                    return;
                }
                move();
                Events.next();
                break;
            case 2:                                                     // Check area
                explore();
                Events.next();
                //
                break;
            case 3:                                                     // Recover Stamina (if have food)
                eat();
                Events.next();
                break;
            case 4:                                                     // Study
                study();
                Events.next();
                break;
            case 5:                                                      // Get inventory
                showInventory();
                Events.next();
                break;
            case 6:                                                      // Rest
                rest();
                break;
            case 0:
                Collections.addAll(events.getEventList(), "1A", "1B", "CB", "2A", "2B", "2C", "3A", "JN", "3B", "5A", "MT", "7A", "TT", "7B", "7C","TC");
                setDayCount(8);
                break;
        }
    }
    public void move() {                                        // press 1
        if (playerPos == 1 && dayCount == 1 && events.isTriggered("TC")) {
            events.getEventAfterClass1st(this, inventory);
        }
        if (dayCount == 20) {
            events.getFinalMorning(this);
            events.getFinalToSchool(this);

        }
        say(dialogue.goSomewhere(playerPos, events));
        map.move(playerPos, events, this);
        loadEventsAfterMoved();
    }

    public void loadEventsAfterMoved() {
        if (playerPos == 1 && !events.isTriggered("TC")) {
            events.setEventTrigger("TC");
            setPlayerUnd(2);
            say(dialogue.getAtSchool());
            say("\t...\n");
        }
        if (playerPos == 1 && dayCount == 2) {
            events.getEventGetBullied(this, playerUnd, inventory);
            events.getEventMetJanitor(this);
            events.getEventSeeJanitorNumber(this, inventory);
        }
        if (playerPos == 1 && dayCount == 3) {
            events.getEventFirstDeath(this);
        }
        if (playerPos == 4 && events.isTriggered("3A")) {
            events.getEventFirstAtJanitors(this);
        }
        if (playerPos == 4 && inventory.hasItem("Old Key") != null) {
            events.getEventFirstInJanitor(inventory, this);
        }
        if (playerPos == 1 && dayCount == 8) {
            events.getEvent8A(this);
        }
        if (playerPos == 5 && dayCount == 8) {
            events.getEvent8B(this);
        }
        if (playerPos == 5 && events.isTriggered("8B")) {
            events.getFrontOfTattoo();
            events.getFrontOfTattooPuzzle(inventory);
        }
        if (playerPos == 5 && events.isTriggered("9B")) {
            events.getInsideTattoo(inventory, this);
        }
        if (playerPos == 6) {
            events.getFrontOfLab(inventory, this);
        }
        if (dayCount == 15 && playerPos == 7) {
            events.getEvent15A(this);
            events.getEvent15B(this);
            events.getEvent15C(this);
            events.getEvent15D(this);
            if (!events.isTriggered("GAMEOVER")) {
                events.getGivePotion();
            }
        }
        if (dayCount == 16) {
            events.getEvent16A(this, inventory);
        }
        if (dayCount == 17) {
            events.getInJail(this, inventory);
        }
        if (dayCount == 18) {
            events.getEvent18A(this, inventory);
        }
        if (dayCount == 19) {
            if (events.isTriggered("ARRESTED")) {
                say("The police suddenly shows up and drags you back to the jail... Seems like you haven't erased your trace.");
                setPlayerPos(8);
                events.setEventTrigger("GAMEOVER");
            } else {
                events.getFinalLab(this, inventory);
            }
        }
        if (dayCount == 20) {
            events.getFinalClues(this);
        }
        if (playerPos == 7 && dayCount == 20) {
            events.getFinalAtCherr(this, inventory);
            events.getFinalShowdown(this);
        }
        if (playerPos == 9 && events.isTriggered("20E")) {
            events.getFinalEvent();
        }
    }

    public void explore() {                                         // press 2
        ArrayList<Item> itemList = map.showItems(playerPos);
        if (itemList.size() > 0) {
            takeItems(itemList);
        }
    }

    public void eat() {                                             // press 3
        int foodIndex = inventory.searchFood();
        if (foodIndex != -1) {
            if (playerStamina == 100) {
                say(dialogue.getStillFull());
            } else {
                Item consumed = inventory.getItem(foodIndex);
                inventory.use(consumed);
                setPlayerStamina(consumed.getStaminaRec());
                say(consumed.getItemName() + " eaten. Stamina recovered to " + playerStamina + ".");
            }
        } else {
            say("Inventory has no food!");
        }
    }

    public void study() {
        if (dayCount % 7 != 0) {
            if (!events.isTriggered("TC")) {
                say("School is waiting right now!");
            } else {
                if (rand.nextInt(2) == 1) {
                    say("You review your stuff.\n\t# Understanding went up by 2 #");
                } else {
                    say("You sit down and study hard.\n\t# Understanding went up by 2 #");
                }
                setPlayerStamina((playerStamina / 2));
                setPlayerUnd(2);
            }
        } else {
            say("DAY OFF! NO STUDY!");
        }
    }

    public void showInventory() {
        inventory.delInvalidItem();
        inventory.printInventory();
        Item keyItem = inventory.searchKeyItem();
        if (keyItem != null) {
            say("\n" + dialogue.getCheckClue() + keyItem.getItemName() + " ?\n\t(0) Yes\n\t(1) No");
            int i = events.takeInput(1);
            switch (i) {
                    case 0:
                        keyItem.puzzle(events, this, inventory);
                        break;
                    case 1:
                        break;
            }
        }
    }

    public void rest() {
        if (dayCount % 7 != 0) {
            if (!events.isTriggered("TC")) {
                say("You are not a sloth, right?!");
                Events.next();
                return;
            }
        }
        if (!events.isTriggered("ARRESTED")) {
            playerPos = 0;
        }
        setPlayerStamina(-1);
        events.clearEventTrigger("TC");
        say(dialogue.getEndDay());
        dayCount++;
        Events.next();
    }

    public void setPlayerStamina(int stamina) {
        if (stamina == -1 || playerStamina - stamina > 100) {
            playerStamina = 100;
        } else {
            playerStamina -= stamina;
        }
    }

    public void takeItems(ArrayList<Item> itemList) {
        say(dialogue.getExploreItems());
        String strChoice = input.nextLine();
        int take;
        try {
            take = Integer.parseInt(strChoice);
            say("[Only choose the item numbers available]");
        } catch (NumberFormatException e) {
            say("[No item taken]");
            return;
        }
        ArrayList toRemove = new ArrayList();
        for (Item item : itemList) {
            if (item == itemList.get(take)) {
                say(item.getItemName() + " taken.");
                if (!item.getItemName().equalsIgnoreCase("bones")) {
                    toRemove.add(item);
                }
                if (item.getItemName().equalsIgnoreCase(("statue"))) {
                    events.getEvent5A(this);
                }
                inventory.addItem(item);
            }
        }
        itemList.removeAll(toRemove);
    }

    public void setDayCount(int day) {
        dayCount = day;
    }

    public void setPlayerUnd(int und) {
        this.playerUnd += und;
    }

    public void setPlayerPos(int pos) {
        this.playerPos = pos;
    }

    public void setAllStats(int[] statsChanged) {
        this.playerCrg += statsChanged[0];
        this.playerUnd += statsChanged[1];
        this.playerAbn += statsChanged[2];
        setPlayerStamina(statsChanged[3]);
    }

    public void printAllStats() {                                           // keep track of stats, will be removed
        say("CRG: " + this.playerCrg + "\tUND: " + this.playerUnd + "\tABN: " + this.playerAbn + "\t | SCORE : " + getScore());
    }

    public void printPlayerStamina() {
        System.out.println("CURRENT STAMINA : " + this.playerStamina);
    }

    public Player getPlayer() {
        say("What do you want your name to be__?");
        String name = input.nextLine();
        return new Player(name, "", 100);
    }

    public int getPlayerUnd() {
        return this.playerUnd;
    }

    public int getPlayerCrg() {
        return this.playerCrg;
    }

    public int getPlayerAbn() {
        return this.playerAbn;
    }

    public int getDayCount() {
        return this.dayCount;
    }

    public int getStaminaLost() {
        return this.staminaPerMove;
    }

    public void printAchievements() {
        say("ACHIEVEMENTS: ");
        for (String e : events.getEventList()) {
            if (e.length() > 4) {
                System.out.println(" | " + e);
            }
        }
    }

    public void printGameOver() {
        if (events.isTriggered("GAMEOVER")) {
            say("GAME OVER!");
            if (events.isTriggered("21A")) {
                say("CONGRATULATIONS ON FINISHING THE GAME!");
            }
            printAchievements();
            System.exit(0);
        }
    }

    public int getScore() {
        int score = (playerCrg * 2 + playerUnd) * playerAbn / 10;
        return score;
    }

    public static void say(String text) {
        System.out.println(text);
    }

    public static void wait(int duration) {                                 // create delays
        try {
            Thread.sleep(duration);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}