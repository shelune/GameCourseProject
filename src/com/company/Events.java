package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Events {
    private Scanner input = new Scanner(System.in);
    private ArrayList<String> eventTrigger = new ArrayList <String>();
    private Dialogue eventDial = new Dialogue();                    // get the dialogues for events

    public int[] getEventFirstNight(ArrayList<String> eventTrigger) {
        int[] statsChanged = new int[] {0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (eventTrigger.contains("0A")) {
            return statsChanged;
        }
        String[] event = eventDial.getFirstNight();
        for (String s : event) {
            next(); say(s);
        }
        int choice = -1;
        while (choice > 2 || choice < 0) {
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                next();
            }
            for (ChoiceAction ca : eventDial.getSayMap().get(choice)) {
                say(ca.getSayString()); next();
                statsChanged = ca.statsFirstNight(choice);
            }
        }
        eventTrigger.add("0A");
        return statsChanged;
    }

    public int[] getEventFirstSeeNumbers(ArrayList<String> eventTrigger) {
        int[] statsChanged = new int[] {0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (eventTrigger.contains("1A")) {
            return statsChanged;
        }
        int i;
        String[] event = eventDial.getFirstSeeNumbers();
        for (i = 0; i < 6; i++) {
            say(event[i]);
            next();
        }
        int choice = -1;
        while (choice > 1 || choice < 0) {
            try {
                say(event[6]);
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                next();
            }
            switch (choice) {
                case 0:
                    say(event[7]); say(event[8]); next();
                    statsChanged[3] = 2;
                    break;
                case 1:
                    say(event[9]); say (event[10]);
                    break;
            }
        }
        next();
        say(event[11]); next(); say(event[12]); next(); say(event[13]);
        choice = -1;
        while (choice > 1 || choice < 0) {
            try {
                say(event[14]);
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                next();
            }
            switch (choice) {
                case 0:
                    say(event[15]); say(event[16]); next();
                    statsChanged[2] = 1;
                    break;
                case 1:
                    say(event[17]); say (event[18]); next();
                    statsChanged[2] = -1;
                    statsChanged[3] = 30;
                    break;
            }
        }
        eventTrigger.add("1A");
        return statsChanged;
    }

    public void next() {
        input.nextLine();
    }

    public void setEventTrigger(String event) {
        this.eventTrigger.add(event);
    }

    public void clearEventTrigger(String eventCode) {
        eventTrigger.remove(eventCode);
    }

    public void resetEventList() {
        eventTrigger.clear();
    }

    public boolean isTriggered(String eventCode) {
        return this.eventTrigger.contains(eventCode);
    }

    public ArrayList<String> getEventList() {
        return this.eventTrigger;
    }

    public static void say(String text) {
        System.out.println(text);
    }

}
