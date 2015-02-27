package com.company;

public class ChoiceAction {
    private Dialogue dialogue = new Dialogue();
    private int[] statsChanged = new int[] {0, 0, 0, 0}; // COU - UND - ABN - STAMINA

    public ChoiceAction() {

    }

    public int[] statsFirstNight(int choice) {
        switch (choice) {
            case 0:
                statsChanged[0] = 2;
                Player.say("\t# Courage went up by 2 #");
                break;
            case 1:
                statsChanged[1] = 2;
                Player.say("\t# Understanding went up by 2 #");
                break;
            case 2:
                break;
        }
        return statsChanged;
    }

    public int[] statsFirstDeath(int choice) {
        switch (choice) {
            case 0:
                statsChanged[0] = 2;
                statsChanged[1] = 1;
                Player.say("\t# Courage went up by 2 #\t# Understanding went up by 1 #");
                break;
            case 1:
                statsChanged[0] = -1;
                statsChanged[1] = -1;
                Player.say("\t# Courage went down by 1 #\t# Understanding went down by 1 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsFirstSeeNum_p1(int choice) {
        switch (choice) {
            case 0:
                statsChanged[2] = 2;
                Player.say("\t# Abnormality went up by 2 #");
                break;
            case 1:
                break;
        }
        return statsChanged;
    }

    public int[] statsFirstSeeNum_p2(int choice) {
        switch (choice) {
            case 0:
                statsChanged[2] = 1;
                Player.say("\t# Abnormality went up by 1 #");
                break;
            case 1:
                statsChanged[2] = -1;
                statsChanged[3] = 30;
                Player.say("\t# Abnormality went down by 1 #\t# Stamina went down by 30 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent1(int choice) {
        switch (choice) {
            case 0:
                statsChanged[0] = -2;
                statsChanged[2] = 2;
                Player.say("\t# Courage went down by 2 #\t# Abnormality went up by 2 #");
                break;
            case 1:
                statsChanged[0] = 1;
                statsChanged[2] = 1;
                Player.say("\t# Courage went up by 1 #\t# Abnormality went up by 1 #");
                break;
            case 2:
                statsChanged[0] = 2;
                statsChanged[1] = -1;
                Player.say("\t# Courage went up by 2 #\t# Understanding went down by 1 #");
                break;
            case 3:
                statsChanged[0] = -3;
                Player.say("\t# Courage went down by 3 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent2(int choice) {
        switch (choice) {
            case 0:
                statsChanged[1] = 1;
                Player.say("\t# Understanding went up by 1 #");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                statsChanged[0] = 1;
                statsChanged[1] = -3;
                Player.say("\t# Courage went up by 1 #\t# Understanding went down by 3 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent3(int choice, Inventory inventory) {
        switch (choice)	{
            case 0:
                statsChanged[1] = -4;
                Player.say("\t# Understanding went down by 4 #");
                break;
            case 1:
                statsChanged[0] = 2;
                inventory.addItem(new Item("Bike", "Make it easier for you to go around"));
                Player.say("\t# Courage went up by 2 #");
                break;
            case 2:
                statsChanged[1] = -4;
                Player.say("\t# Understanding went down by 4 #");
                break;
            case 3:
                statsChanged[4] = 50;
                Player.say("\t# Stamina went down by 50 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsGetBullied(int choice, int und, Inventory inventory) {
        switch (choice)	{
            case 0:
                statsChanged[0] = -1;
                statsChanged[2] = 1;
                Player.say("\t# Courage went down by 1 #\t# Abnormality went up by 1 #");
                break;
            case 1:
                statsChanged[0] = 1;
                statsChanged[1] = -4;
                statsChanged[3] = 35;
                Player.say("\t# Courage went up by 1 #\t# Understanding went down by 4 #\t# Stamina went down by 35 #");
                break;
            case 2:
                if (und > 14) {
                    statsChanged[0] = 2;
                    Player.say("... In the end it's not that bad. They listen to your reasons!");
                    Player.say("\t# Courage went up by 2 #");
                } else {
                    inventory.empty();
                    Player.say("... Ugh! You cannot talk those things out and get mugged by them...");
                }
                break;
            case 3:
                statsChanged[1] = -4;
                statsChanged[2] = 2;
                statsChanged[3] = 30;
                Player.say(".. Wait what are you gonna distract them with?!");
                Player.say("\t# Understanding went down by 4 #\t# Abnormality went up by 2 #\t# Stamina went down by 30 #");
                break;
            case 4:
                inventory.delInvalidItem();
                statsChanged[2] = -2;
                statsChanged[0] = 2;
                statsChanged[1] = 2;
                Player.say("... With your brilliant mind, you take out your [Jacket] and fling it away, then run. Magnificent!");
                Player.say("\t# Courage went up by 2 #\t# Understanding went up by 2 #\t# Abnormality went down by 2 #");
        }
        return statsChanged;
    }

    public int[] statsMetJanitor(int choice) {
        switch (choice) {
            case 0:
                break;
            case 1:
                statsChanged[0] = 1;
                Player.say("\t# Courage went up by 1 #");
                break;
            case 2:
                statsChanged[1] = -1;
                Player.say("\t# Understanding went down by 1 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsSeeJanitorNumber(int choice, Inventory inventory) {
        switch (choice) {
            case 0:
                statsChanged[0] = 1;
                statsChanged[2] = 2;
                Player.say("\t# Courage went up by 1 #\t# Abnormality went up by 2 #");
                break;
            case 1:
                inventory.addItem(new Item("Cake", "Recovers 20 Stamina", -20, 1));
                Player.say("\t[Cake] Obtained!");
                break;
            case 2:
                inventory.addItem(new Item("Cake", "Recovers 10 Stamina", -10, 1));
                Player.say("\t[Cake] Obtained!");
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent5A(int choice) {
        switch (choice) {
            case 0:
                statsChanged[1] = -2;
                statsChanged[2] = 2;
                statsChanged[3] = 20;
                Player.say("\t# Understanding went down by 2 #\t# Abnormality went up by 2 #\t# Stamina went down by 20 #");
                break;
            case 1:
                statsChanged[1] = -1;
                statsChanged[2] = 1;
                statsChanged[3] = 30;
                Player.say("\t# Understanding went down by 1 #\t# Abnormality went up by 1 #\t# Stamina went down by 30 #");
                break;
            case 2:
                statsChanged[1] = 2;
                Player.say("\t# Understanding went up by 2 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent7B(int choice) {
        switch (choice) {
            case 0:
                statsChanged[0] = 1;
                statsChanged[2] = 1;
                Player.say("\t# Courage went up by 1 #\t# Abnormality went up by 1 #");
                break;
            case 1:
                statsChanged[1] = -2;
                statsChanged[2] = 2;
                Player.say("\t# Understanding went down by 2 #\t# Abnormality went up by 2 #");
                break;
            case 2:
                statsChanged[1] = 2;
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent8A(int choice, Events events) {
        switch (choice) {
            case 0:
                statsChanged[0] = 1;
                events.setEventTrigger("SIDEKICK");
                Player.say("\t# Courage went up by 1 #");
                break;
            case 1:
                statsChanged[0] = 1;
                statsChanged[2] = 2;
                Player.say("\t# Courage went up by 1 #\t# Abnormality went up by 2 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent8B(int choice) {
        switch (choice) {
            case 0:
                statsChanged[1] = 1;
                statsChanged[2] = 2;
                statsChanged[3] = 20;
                Player.say("\t# Understanding went up by 1 #\t# Abnormality went up by 2 #\t# Stamina went down by 20 #");
                break;
            case 1:
                statsChanged[0] = 2;
                statsChanged[2] = 2;
                statsChanged[3] = 20;
                Player.say("\t# Courage went up by 2 #\t# Abnormality went up by 2 #\t# Stamina went down by 20 #");
                break;
            case 2:
                statsChanged[2] = -2;
                Player.say("\t# Abnormality went down by 2 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent15B(int choice) {
        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                statsChanged[1] = 1;
                Player.say("\t# Understanding went up by 1 #");
                break;
            case 2:
                statsChanged[0] = 2;
                statsChanged[2] = 2;
                Player.say("\t# Courage went up by 2 #\t# Abnormality went up by 2 #");
                break;
        }
        return statsChanged;
    }

    public void actionEvent15D(int choice, Events events) {
        switch (choice) {
            case 1:
                events.setEventTrigger("GAMEOVER");
                break;
        }
    }

    public int[] statsEvent18A(int choice, Player player, Inventory inventory, Events events) {
        switch (choice) {
            case 0:
                statsChanged[0] = 2;
                statsChanged[2] = -1;
                Player.say("\t# Courage went up by 2 #\t# Abnormality went down by 1 #");
                player.setDayCount(21);
                break;
            case 1:
            	inventory.addItem(new Item("Potion 1", "A weird looking bottle of chemical substances"));
            	inventory.addItem(new Item("Potion 2", "A weird looking bottle of chemical substances"));
                events.setEventTrigger("18A1");
                break;
        }
        return statsChanged;
    }
    
    public int[] statsFollowMan(int choice, Events events, Inventory inventory) {
        switch (choice) {
            case 0:
                statsChanged[0] = 3;
                Player.say("\t# Courage went up by 3 #");
                events.setEventTrigger("GAMEOVER");
                break;
            case 1:
                statsChanged[0] = -1;
                statsChanged[1] = 2;
                Player.say("\t# Courage went down by 1 #\t# Understanding went up by 2 #");
                inventory.addItem(new Item("Potion X", "A weird looking bottle with a purple substance inside."));
                break;
        }
        return statsChanged;
    }

    public void actionFollowWoman(Player player, Events events) {
        player.setPlayerPos(7);
        events.setEventTrigger("VL");
    }

    public int[] statsSeeWomanHiCrg(int choice, Player player, Events events) {
        switch (choice) {
            case 0:
                statsChanged[0] = 2;
                statsChanged[2] = 2;
                Player.say("\t# Courage went up by 2 #\t# Abnormality went up by 2 #");
                player.rest();
                break;
            case 1:
                statsChanged[0] = -2;
                statsChanged[2] = -1;
                Player.say("\t# Courage went down by 2 #\t# Abnormality went down by 1 #");
                events.setEventTrigger("14B1");
                break;
            case 2:
                statsChanged[0] = 1;
                statsChanged[1] = 2;
                Player.say("\t# Courage went up by 1 #\t# Understanding went up by 2 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsInJail(int choice, Player player, Inventory inventory) {
        switch (choice) {
            case 0:
                statsChanged[0] = 2;
                statsChanged[2] = 2;
                Item sHammer = inventory.hasItem("Small Hammer");
                if (inventory.hasItem("Small Hammer") != null) {
                    sHammer.consume();
                    inventory.addItem(new Item("Brick", "A craggy but sturdy brick, can be thrown at b!tches for permanent damage"));
                    Player.say("... With the small hammer, you eventually take out the brick. But the hammer is also done fore. This brick could be in use for later.\n [Brick] Obtained");
                } else {
                    Player.say("... You try and try but the brick is still stuck onto the wall, you can’t take it with proper tool");
                }
                Player.say("\t# Courage went up by 2 #\t# Abnormality went up by 2 #");
                break;
            case 1:
                statsChanged[1] = 1;
                Player.say("... If someone catches you, it may spell disaster for you.");
                Player.say("\t# Understanding went up by 1 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsFinalMorning(int choice) {
        switch (choice) {
            case 0:
                statsChanged[1] = -2;
                statsChanged[3] = 25;
                Player.say("\t# Understanding went down by 2 #\t# Stamina went down by 25 #");
                break;
            case 1:
                statsChanged[1] = -1;
                Player.say("\t# Understanding went down by 1 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsFinalToSchool(int choice, Player player, Events events) {
        switch (choice) {
            case 0:
                statsChanged[0] = 2;
                statsChanged[1] = 2;
                player.setPlayerPos(0);
                Player.say("\t# Courage went up by 2 #\t# Understanding went up by 2 #");
                break;
            case 1:
                statsChanged[1] = -1;
                statsChanged[2] = -2;
                Player.say("\t# Understanding went down by 1 #\t# Abnormality went down by 2 #");
                break;
        }
        return statsChanged;
    }

    public int[] statsFinalClues(int choice, Player player) {
        switch (choice) {
            case 3:
                Player.say(dialogue.getFinalCluesChoice(1));
                player.setPlayerPos(7);
                break;
            default:
                statsChanged[3] = 25;
                player.setPlayerPos(0);
                Player.say(dialogue.getFinalCluesChoice(0));
                Player.say("\t# Stamina went down by 25 #");
                break;
        }
        return statsChanged;
    }

    public void actionFinalAtCherr(int choice, Inventory inventory, Player player, Events events) {
        switch (choice) {
            case 0:
                if (player.getPlayerUnd() > 44) {
                    events.printEvent(dialogue.getTalkWoman());
                    inventory.addItem(new Item("Potion Note", "A note used to distinguish two potions."));
                } else {
                    events.printEvent(dialogue.getApproachWoman());
                }
                break;
            case 1:
                events.printEvent(dialogue.getApproachWoman());
                break;
        }
    }

    public void actionFinalShowdown(Player player) {
        int statMax = Math.max(Math.max(player.getPlayerAbn(), player.getPlayerCrg()), player.getPlayerUnd());
        if (statMax == player.getPlayerAbn()) {
            Player.say(dialogue.getFinalShowdownChoice(2));
        }
        if (statMax == player.getPlayerCrg()) {
            Player.say(dialogue.getFinalShowdownChoice(0));
        } else {
            Player.say(dialogue.getFinalShowdownChoice(1));
        }
    }
}
