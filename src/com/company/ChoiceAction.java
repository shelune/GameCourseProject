package com.company;
/**
 * Created by ASUS on 05-Feb-15.
 */
public class ChoiceAction {
    private String sayString;
    private int[] statsChanged = new int[] {0, 0, 0, 0}; // COU - UND - ABN - STAMINA

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
    
    public ChoiceAction(String sayString) {
        super();
        this.sayString = sayString;
    }
}
