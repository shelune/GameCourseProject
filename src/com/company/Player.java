package com.company;

import java.util.*;

public class Player {

    private Random rand = new Random();
    private Scanner input = new Scanner(System.in);
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
    private int playerPosTemp = 0;
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
            while (dayCount < 22 && playerStamina > 0) {
                switch (dayCount) {                             // this switch is for night events
                    case 1:
                        int[] statsChanged = events.getEventFirstNight(events.getEventList());
                        setAllStats(statsChanged);
                        break;
                }
                say("\t \t \t \t \t \t \t \t \t \t [DAY : " + dayCount + "]");
                System.out.println(events.getEventList());
                printPlayerStamina();
                printAllStats();
                map.printPlace(playerPos);
                input.nextLine();                               // print all player's info
                actions();                                      // all actions available
            }
            say("GAME OVER!");
            System.exit(0);
        }
    }

    public void actions() {
        int choice = 0;
        while (choice > 6 || choice < 1) {
            try {
                say(dialogue.getGeneralOpts());
                choice = input.nextInt();
            }
            catch (InputMismatchException e) {
                events.next();
            }
            switch (choice) {
                case 1:                                                     // Go to places
                    move();
                    events.next();
                    break;
                case 2:                                                     // Check area
                    explore();
                    events.next();
                    //
                    break;
                case 3:                                                     // Recover Stamina (if have food)
                    eat();
                    events.next();
                    break;
                case 4:                                                     // Study
                    study();
                    events.next();
                    break;
                case 5:                                                      // Get inventory
                    showInventory();
                    events.next();
                    break;
                case 6:                                                      // Rest
                    rest();
                    break;
            }
        }
    }
    public void move() {
        say(dialogue.goSomewhere(playerPos, events.getEventList()));       // *initially from home... (will fix)
        playerPosTemp = map.move(playerPos, events.getEventList());
        if (playerPosTemp != playerPos) {
            setPlayerStamina(staminaPerMove);                   // check if go or stay, then cost stamina
            playerPos = playerPosTemp;
        }
    }

    public void explore() {
        say("Items in this area: ");
        ArrayList<Item> itemList = map.getPlace(playerPos).getItemList();
        if (itemList.size() < 1) {
            say("EMPTY AREA!");
        } else {
            for (int i = 0; i < itemList.size(); i++) {
                say("(" + i + ") " + itemList.get(i).getItemName() + "\t| " + itemList.get(i).getItemDescription());
            }
            say(dialogue.getExploreItems());
            int take = -1;
            while (take >= itemList.size() || take < 0) {
                try {
                    take = input.nextInt();
                    say("[Only choose the item numbers available]");
                } catch (InputMismatchException e) {
                    say("No item taken]");
                    return;
                }
            }
            ArrayList toRemove = new ArrayList();
            for (Item item : itemList) {
                if (item == itemList.get(take)) {
                    if (item.isFood() || !inventory.hasItem(item)) {
                        say(item.getItemName() + " taken.");
                        toRemove.add(item);
                        inventory.addItem(item);
                    } else {
                        say("Should not get too many of this.");
                    }
                }
            }
            itemList.removeAll(toRemove);
        }
    }

    public void eat() {
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
            if (!events.isTriggered("1B")) {
                say("School is waiting right now! No time for studying!");
            } else {
                if (rand.nextInt(2) == 1) {
                    say("You review your stuff.\n\t# Understanding went up by 2 #");
                } else {
                    say("You sit down and study hard.\n\t# Understanding went up by 2 #");
                }
                setPlayerStamina((playerStamina / 2));
                setPlayerInt(2);
            }
        } else {
            say("DAY OFF! NO STUDY!");
        }
    }

    public void showInventory() {
        inventory.printInventory();
    }

    public void rest() {
        playerPos = 0;
        setPlayerStamina(-1);
        say(dialogue.getEndDay());
        dayCount++;
        events.clearEventTrigger("1B");
        events.next();
    }

    public void setPlayerStamina(int stamina) {
        if (stamina == -1 || playerStamina - stamina > 100) {
            playerStamina = 100;
        } else {
            playerStamina -= stamina;
        }
    }

    public void setPlayerCrg(int courage) {
        this.playerCrg += courage;
    }

    public void setPlayerInt(int intel) {
        this.playerUnd += intel;
    }

    public void setPlayerAbn(int abn) {
        this.playerCrg += abn;
    }

    public void setAllStats(int[] statsChanged) {
        this.playerCrg += statsChanged[0];
        this.playerUnd += statsChanged[1];
        this.playerAbn += statsChanged[2];
        this.playerStamina += statsChanged[3];
    }

    public void printAllStats() {                                           // keep track of stats, will be removed
        say("CRG: " + this.playerCrg + "\tUND: " + this.playerUnd + "\tABN: " + this.playerAbn);
    }

    public void printPlayerStamina() {
        System.out.println("Your Stamina now is : " + this.playerStamina);
    }

    public Player getPlayer() {
        say("What do you want your name to be__?");
        String name = input.nextLine();
        say("What is your title__? (e.g The Great Dictator or smt)");
        String description = input.nextLine();
        Player player = new Player(name, description, 100);
        return player;
    }

    public void setPlayerPos(int destination) {
        this.playerPos = destination;
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

