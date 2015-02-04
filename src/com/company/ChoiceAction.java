package com.company;

/**
 * Created by ASUS on 05-Feb-15.
 */
public class ChoiceAction {
    private String sayString;
    private int[] statsChanged = new int[] {0, 0, 0, 0};

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

    public ChoiceAction(String sayString) {
        super();
        this.sayString = sayString;
    }
}
