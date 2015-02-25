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
                break;
            case 1:
                statsChanged[1] = 2;
                break;
            case 2:
                break;
        }
        return statsChanged;
    }

    public int[] statsFirstDeath(int choice)	{
    	switch (choice) {
        case 0:
            statsChanged[0] = 2;
            statsChanged[1] = 1;
            break;
        case 1:
            statsChanged[0] = -1;
            statsChanged[1] = -1;
            break;
    	}
    	return statsChanged;
    }

    public int[] statsFirstSeeNum_p1(int choice) {
        switch (choice) {
            case 0:
                statsChanged[2] = 2;
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
                break;
            case 1:
                statsChanged[2] = -1;
                statsChanged[3] = 30;
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent1(int choice) {
    	switch (choice)	{
    		case 0:
    			statsChanged[0] = -2;
    			statsChanged[2] = 2;
    			break;
    		case 1:
    			statsChanged[0] = 1;
    			statsChanged[2] = 1;
    			break;
    		case 2:
    			statsChanged[0] = 2;
    			statsChanged[1] = -1;
    			break;
    		case 3:
    			statsChanged[0] = -3;
    			break;
    	}
    	return statsChanged;
    }

    public int[] statsEvent2(int choice) {
    	switch (choice)	{
    		case 0:
    			statsChanged[1] = 1;
    			break;
    		case 1:
    			break;
    		case 2:
    			break;
    		case 3:
    			statsChanged[0] = 1;
    			statsChanged[1] = -3;
    			break;
    	}
    	return statsChanged;
    }

    public int[] statsEvent3(int choice, Inventory inventory) {
        switch (choice)	{
            case 0:
                statsChanged[1] = -4;
                break;
            case 1:
                statsChanged[0] = 2;
                inventory.addItem(new Item("Bike", "Make it easier for you to go around"));
                break;
            case 2:
                statsChanged[1] = -4;
                break;
            case 3:
                statsChanged[4] = 50;
                break;
        }
        return statsChanged;
    }

    public int[] statsGetBullied(int choice, int und, Inventory inventory) {
        switch (choice)	{
            case 0:
                statsChanged[0] = -1;
                statsChanged[2] = 1;
                break;
            case 1:
                statsChanged[0] = 1;
                statsChanged[1] = -4;
                statsChanged[3] = 35;
                break;
            case 2:
                if (und > 14) {
                    statsChanged[0] = 2;
                    Player.say("In the end it's not that bad. They listen to your reasons!");
                } else {
                    inventory.empty();
                    Player.say("Ugh! You cannot talk those things out and get mugged by them...");
                }
                break;
            case 3:
                statsChanged[3] = 30;
                Player.say("Wait what are you gonna distract them with?!");
                break;
            case 4:
                inventory.delInvalidItem();
                statsChanged[2] = -2;
                statsChanged[0] = 2;
                statsChanged[1] = 2;
                Player.say("With your brilliant mind, you take out your [Jacket] and fling it away, then run. Magnificent!");
        }
        return statsChanged;
    }

    public int[] statsMetJanitor(int choice) {
        switch (choice) {
            case 0:
                break;
            case 1:
                statsChanged[0] = 1;
                break;
            case 2:
                statsChanged[1] = -1;
                break;
        }
        return statsChanged;
    }

    public int[] statsSeeJanitorNumber(int choice, Inventory inventory) {
        switch (choice) {
            case 0:
                statsChanged[0] = 1;
                statsChanged[2] = 2;
                break;
            case 1:
                inventory.addItem(new Item("Cake", "Recovers 20 Stamina", -10, 1));
                Player.say("[Cake] Obtained!");
                break;
            case 2:
                inventory.addItem(new Item("Cake", "Recovers 20 Stamina", -10, 1));
                Player.say("[Cake] Obtained!");
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
                break;
            case 1:
                statsChanged[1] = -1;
                statsChanged[2] = 1;
                statsChanged[3] = 30;
                break;
            case 2:
                statsChanged[1] = 2;
                break;
        }
        return statsChanged;
    }

    public int[] statsEvent7B(int choice) {
        switch (choice) {
            case 0:
                statsChanged[0] = 1;
                statsChanged[2] = 1;
                break;
            case 1:
                statsChanged[1] = -2;
                statsChanged[2] = 2;
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
			break;
		case 1:
			statsChanged[0] = 1;
			statsChanged[2] = 2;
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
			break;
		case 1:
			statsChanged[0] = 2;
			statsChanged[2] = 2;
			statsChanged[3] = 20;
			break;
		case 2:
            statsChanged[2] = -2;
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
                break;
            case 2:
                statsChanged[0] = 2;
                statsChanged[2] = 2;
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
                events.setEventTrigger("GAMEOVER");
                break;
            case 1:
                statsChanged[0] = -1;
                statsChanged[1] = 2;
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
                player.rest();
                break;
            case 1:
                statsChanged[0] = -2;
                statsChanged[2] = -1;
                events.setEventTrigger("14B1");
                break;
            case 2:
                statsChanged[0] = 1;
                statsChanged[1] = 2;
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
                    Player.say("With the small hammer, you eventually take out the brick. But the hammer is also done fore. This brick could be in use for later.\n [Brick] Obtained");
                } else {
                    Player.say("You try and try but the brick is still stuck onto the wall, you can’t take it with proper tool");
                }
                break;
            case 1:
                statsChanged[1] = 1;
                Player.say("If someone catches you, it may spell disaster for you.");
                break;
        }
        return statsChanged;
    }

    public int[] statsFinalMorning(int choice) {
        switch (choice) {
            case 0:
                statsChanged[1] = -2;
                statsChanged[3] = 25;
                break;
            case 1:
                statsChanged[1] = -1;
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
                break;
            case 1:
                statsChanged[1] = -1;
                statsChanged[2] = -2;
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
                break;
        }
        return statsChanged;
    }

    public void actionFinalAtCherr(int choice, Inventory inventory, Player player, Events events) {
        switch (choice) {
            case 0:
                if (player.getPlayerUnd() > 24) {
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
        }
        else {
            Player.say(dialogue.getFinalShowdownChoice(1));
        }
    }
}
