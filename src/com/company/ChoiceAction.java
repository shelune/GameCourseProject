package com.company;
/**
 * Created by ASUS on 05-Feb-15.
 */
public class ChoiceAction {
    private String sayString;
    private int[] statsChanged = new int[] {0, 0, 0, 0}; // COU - UND - ABN - STAMINA

    public ChoiceAction() {

    }
    public String getSayString() {
        return sayString;
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
                break;
            case 4:
                inventory.delInvalidItem();
                statsChanged[2] = -2;
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
                inventory.addItem(new Item("Cake", "Recovers 20 Stamina", 10, 1));
                break;
            case 2:
                break;
        }
        return statsChanged;
    }

    public ChoiceAction(String sayString) {
        super();
        this.sayString = sayString;
    }
}
