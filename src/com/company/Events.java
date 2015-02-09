//package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Events {
    private Scanner input = new Scanner(System.in);
    private ArrayList<String> eventTrigger = new ArrayList <String>();
    private Dialogue eventDial = new Dialogue();                    // get the dialogues for events

    public int[] getEventFirstNight(ArrayList<String> eventTrigger) {
        int[] statsChanged = new int[] {0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("0A")) {
            return statsChanged;
        }
        String[] event = eventDial.getFirstNight();
        for (String s : event) {
            next(); say(s);
        }
        int choice = takeInput(2);
        for (ChoiceAction ca : eventDial.getActionFirstNight().get(choice)) {
            say(ca.getSayString()); next();
            statsChanged = ca.statsFirstNight(choice);
        }
        eventTrigger.add("0A");
        say(eventDial.getFirstNightEnd());
        return statsChanged;
    }
    
    public int[] getEventFirstSeeNumbers(ArrayList<String> eventTrigger) {
        int[] statsChanged = new int[] {0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (eventTrigger.contains("1A")) {
            return statsChanged;
        }
        int i;
        String[] event = eventDial.getFirstSeeNumbers_p1();
        for (String s : event) {
            next(); say(s);
        }
        int choice = takeInput(1);
        for (ChoiceAction ca : eventDial.getActionFirstSeeNum_p1().get(choice)) {
            say(ca.getSayString());
            next();
            statsChanged = ca.statsFirstSeeNum_p1(choice);
        }
        event = eventDial.getFirstSeeNumbers_p2();
        for (String s : event) {
            next(); say(s);
        }
        choice = takeInput(1);
        for (ChoiceAction ca : eventDial.getActionFirstSeeNum_p2().get(choice)) {
            say(ca.getSayString());
            next();
            for (int j = 0; j < statsChanged.length; j++) {
                statsChanged[j] += ca.statsFirstSeeNum_p2(choice)[j];
            }
        }
        eventTrigger.add("1A");
        return statsChanged;
    }
    
    public int[] getEventREvent1(ArrayList<String> eventTrigger) {
        int[] statsChanged = new int[] {0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("R1")) {
            return statsChanged;
        }
        String[] event = eventDial.getREvent1();
        for (String s : event) {
            next(); say(s);
        }
        int choice = takeInput(3);
        for (ChoiceAction ca : eventDial.getActionREvent1().get(choice)) {
            say(ca.getSayString()); next();
            statsChanged = ca.statsEvent1(choice);
        }
        eventTrigger.add("R1");
        return statsChanged;
    }
    
    public int[] getEventREvent2(ArrayList<String> eventTrigger) {
        int[] statsChanged = new int[] {0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("R2")) {
            return statsChanged;
        }
        String[] event = eventDial.getREvent2();
        for (String s : event) {
            next(); say(s);
        }
        int choice = takeInput(3);
        for (ChoiceAction ca : eventDial.getActionREvent2().get(choice)) {
            say(ca.getSayString()); next();
            statsChanged = ca.statsEvent2(choice);
        }
        eventTrigger.add("R2");
        return statsChanged;
    }

    public int[] getEventREvent3(ArrayList<String> eventTrigger, Inventory inventory) {
        int[] statsChanged = new int[] {0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("R3")) {
            return statsChanged;
        }
        String[] event = eventDial.getREvent3();
        for (String s : event) {
            next(); say(s);
        }
        int choice = takeInput(2);
        for (ChoiceAction ca : eventDial.getActionREvent3().get(choice)) {
            say(ca.getSayString()); next();
            statsChanged = ca.statsEvent3(choice, inventory);
        }
        eventTrigger.add("R3");
        return statsChanged;
    }

    public int[] getEventGetBullied(ArrayList<String> eventTrigger, int und) {
        int[] statsChanged = new int[] {0, 0, 0, 0};
        if (isTriggered("2A")) {
            return statsChanged;
        }
        String[] event = eventDial.getREvent3();
        for (String s : event) {
            say(s); next();
        }
        int choice = takeInput(3);
        for (ChoiceAction ca : eventDial.getActionGetBullied().get(choice)) {
            say(ca.getSayString()); next();
            statsChanged = ca.statsGetBullied(choice, und);
        }
        eventTrigger.add("2A");
        return statsChanged;
    }

    public int[] getEventFirstDeath(ArrayList<String> eventTrigger) {
        int[] statsChanged = new int[] {0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("3A")) {
            return statsChanged;
        }
        String[] event = eventDial.getFirstDeath();
        for (String s : event) {
            next(); say(s);
        }
        int firstChoice = takeInput(1);
        if (firstChoice==0)	{
            String[] event_p0 = eventDial.getFirstDeath_p0();
            for (String s : event_p0) {
                next(); say(s);
            }
        }
        if (firstChoice==1)	{
            String[] event_p1 = eventDial.getFirstDeath_p1();
            for (String s : event_p1) {
                next(); say(s);
            }
        }
        int choice = takeInput(1);
        for (ChoiceAction ca : eventDial.getActionFirstDeath().get(choice)) {
            say(ca.getSayString()); next();
            statsChanged = ca.statsFirstDeath(choice);
        }
        eventTrigger.add("3A");
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

    public int takeInput(int upperLim) {
        int choice = -1;
        while (choice > upperLim || choice < 0) {
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                next();
            }
        }
        return choice;
    }
}
