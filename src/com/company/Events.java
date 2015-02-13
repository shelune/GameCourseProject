package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Events {

    public static Scanner input = new Scanner(System.in);
    private ArrayList<String> eventTrigger = new ArrayList<String>();
    private Dialogue eventDial = new Dialogue();                    // get the dialogues for events
    //private ChoiceAction doChoiceAction = new ChoiceAction();
    
    public void getEventFirstNight(Player player) {               // COU - UND - ABN - STAMINA
        ChoiceAction doChoiceAction = new ChoiceAction();
    	if (isTriggered("0A")) {
            return;
        }
        printEvent(eventDial.getFirstNight());
        int choice = takeInput(2);
        Player.say(eventDial.getFirstNightChoice(choice));
        player.setAllStats(doChoiceAction.statsFirstNight(choice));
        eventTrigger.add("0A");
        Player.say("Eventually, the darkness slowly fades away ... But the creepy feeling keeps on and prolongs throughout the night. It was a very haunting dream...");
    }

    public void getEventFirstSeeNumbers(Player player) {
    	ChoiceAction doChoiceAction = new ChoiceAction();
        if (eventTrigger.contains("1A")) {
            return;
        }
        printEvent(eventDial.getFirstSeeNumbers_p1());
        int choice = takeInput(1);
        Player.say(eventDial.getFirstSeeNumChoice_p1(choice));
        player.setAllStats(doChoiceAction.statsFirstSeeNum_p1(choice));
        printEvent(eventDial.getFirstSeeNumbers_p2());
        choice = takeInput(1);
        Player.say(eventDial.getFirstSeeNumChoice_p2(choice));
        player.setAllStats(doChoiceAction.statsFirstSeeNum_p2(choice));
        eventTrigger.add("1A");
    }

    public void getEventAfterClass1st(Player player, Inventory inventory) {
        if (isTriggered("1B")) {
            return;
        }
        player.setPlayerStamina(25);
        printEvent(eventDial.getAfterClass1st());
        Item homework1 = new Item("Finnish Homework", "Rekt's weekend homework", "ASSIGNMENT");
        inventory.addItem(homework1);
        eventTrigger.add("1B");
    }

    public void getEventGetBullied(Player player, int und) {
        ChoiceAction doChoiceAction = new ChoiceAction();
    	if (isTriggered("2A")) {
            return;
        }
        printEvent(eventDial.getEventGetBullied());
        int choice = takeInput(3);
        Player.say(eventDial.getBulliedChoice(choice));
        player.setAllStats(doChoiceAction.statsGetBullied(choice, und));
        eventTrigger.add("2A");
    }

    public int[] getEventMetJanitor(Player player) {
        int[] statsChanged = new int[]{0, 0, 0, 0};
        if (isTriggered("2B")) {
            return statsChanged;
        }
        printEvent(eventDial.getFirstMetJanitor());
        int choice = takeInput(2);
        for (ChoiceAction ca : eventDial.getActionMetJanitor().get(choice)) {
            Player.say(ca.getSayString());
            next();
            statsChanged = ca.statsMetJanitor(choice);
        }
        player.setAllStats(statsChanged);
        eventTrigger.add("2B");
        return statsChanged;
    }

    public int[] getEventFirstDeath(Player player) {
        int[] statsChanged = new int[]{0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("3A")) {
            return statsChanged;
        }
        printEvent(eventDial.getFirstDeath());
        switch (takeInput(1)) {
            case 0:
                printEvent(eventDial.getFirstDeath_p0());
                break;
            case 1:
                printEvent(eventDial.getFirstDeath_p1());
                break;
        }
        int choice = takeInput(1);
        for (ChoiceAction ca : eventDial.getActionFirstDeath().get(choice)) {
            Player.say(ca.getSayString());
            next();
            statsChanged = ca.statsFirstDeath(choice);
        }
        player.setAllStats(statsChanged);
        eventTrigger.add("3A");
        return statsChanged;
    }

    public int[] getEventFirstInJanitor(Inventory inventory, Player player) {
        int[] statsChanged = new int[]{0, 0, 0, 0};
        if (isTriggered("5A")) {
            return statsChanged;
        }
        printEvent(eventDial.getFirstInJanitor());
        Item note = new Item("Small Note", "A note with barely readable text", eventDial.getJanitorNote());
        inventory.addItem(note);
        note.puzzle(this, player);
        eventTrigger.add("5A");
        return statsChanged;
    }

    public int[] getEventSeeJanitorNumber(Player player, Inventory inventory) {
        int[] statsChanged = new int[]{0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("2C")) {
            return statsChanged;
        }
        printEvent(eventDial.getSeeJanitorNumber());
        int choice = takeInput(2);
        for (ChoiceAction ca : eventDial.getActionSeeJanitorNumber().get(choice)) {
            Player.say(ca.getSayString());
            next();
            statsChanged = ca.statsSeeJanitorNumber(choice, inventory);
        }
        player.setAllStats(statsChanged);
        eventTrigger.add("2C");
        return statsChanged;
    }

    public int[] getEventREvent1(Player player) {
        int[] statsChanged = new int[]{0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("R1")) {
            return statsChanged;
        }
        printEvent(eventDial.getREvent1());
        int choice = takeInput(3);
        for (ChoiceAction ca : eventDial.getActionREvent1().get(choice)) {
            Player.say(ca.getSayString());
            next();
            statsChanged = ca.statsEvent1(choice);
        }
        player.setAllStats(statsChanged);
        eventTrigger.add("R1");
        return statsChanged;
    }

    public int[] getEventREvent2(Player player) {
        int[] statsChanged = new int[]{0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("R2")) {
            return statsChanged;
        }
        printEvent(eventDial.getREvent2());
        int choice = takeInput(3);
        for (ChoiceAction ca : eventDial.getActionREvent2().get(choice)) {
            Player.say(ca.getSayString());
            next();
            statsChanged = ca.statsEvent2(choice);
        }
        player.setAllStats(statsChanged);
        eventTrigger.add("R2");
        return statsChanged;
    }

    public int[] getEventREvent3(Player player, Inventory inventory) {
        int[] statsChanged = new int[]{0, 0, 0, 0};                    // COU - UND - ABN - STAMINA
        if (isTriggered("R3")) {
            return statsChanged;
        }
        printEvent(eventDial.getREvent3());
        int choice = takeInput(2);
        for (ChoiceAction ca : eventDial.getActionREvent3().get(choice)) {
            Player.say(ca.getSayString());
            next();
            statsChanged = ca.statsEvent3(choice, inventory);
        }
        player.setAllStats(statsChanged);
        eventTrigger.add("R3");
        return statsChanged;
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

    public static void next() {
        input.nextLine();
    }

    public void printEvent(String[] event) {
        for (int i = 0; i < event.length - 1; i++) {
            Player.say(event[i]);
            next();
        }
        Player.say(event[event.length - 1]);

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
