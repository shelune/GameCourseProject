package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Events {
    public static Scanner input = new Scanner(System.in);
    private ArrayList<String> eventTrigger = new ArrayList<String>();
    private Dialogue eventDial = new Dialogue(); // get the dialogues for events
    //private ChoiceAction doChoiceAction = new ChoiceAction();
    public void getEventFirstNight(Player player) { // COU - UND - ABN - STAMINA
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
    public void getEventGetBullied(Player player, int und, Inventory inventory) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("2A")) {
            return;
        }
        printEvent(eventDial.getEventGetBullied());
        int choice = takeInput(3);
        if (choice == 3) {
            Item jacket = inventory.hasItem("Jacket");
            if(jacket != null) {
                choice = 4;
                jacket.consume();
            }
        }
        Player.say(eventDial.getBulliedChoice(choice));
        player.setAllStats(doChoiceAction.statsGetBullied(choice, und, inventory));
        eventTrigger.add("2A");
    }

    public void getEventMetJanitor(Player player) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("2B")) {
            return;
        }
        printEvent(eventDial.getFirstMetJanitor());
        int choice = takeInput(2);
        Player.say(eventDial.getMetJanitorChoice(choice));
        player.setAllStats(doChoiceAction.statsMetJanitor(choice));
        eventTrigger.add("2B");
    }
    public void getEventFirstDeath(Player player) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("3A")) {
            return;
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
        player.setAllStats(doChoiceAction.statsFirstDeath(choice));
        eventTrigger.add("3A");
        eventTrigger.add("JN");
    }
    public void getEventFirstInJanitor(Inventory inventory, Player player) {
        if (isTriggered("5C")) {
            return;
        }
        printEvent(eventDial.getFirstInJanitor());
        Item note = new Item("Small Note", "A note with barely readable text", eventDial.getJanitorNote());
        inventory.addItem(note);
        note.puzzle(this, player, inventory);
        eventTrigger.add("5C");
    }
    public void getEventSeeJanitorNumber(Player player, Inventory inventory) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("2C")) {
            return;
        }
        printEvent(eventDial.getSeeJanitorNumber());
        int choice = takeInput(2);
        Player.say(eventDial.getSeeJanitorNumChoice(choice));
        player.setAllStats(doChoiceAction.statsSeeJanitorNumber(choice, inventory));
        eventTrigger.add("2C");
    }
    public void getEventREvent1(Player player) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("R1")) {
            return;
        }
        printEvent(eventDial.getREvent1());
        int choice = takeInput(3);
        Player.say(eventDial.getREvent1Choice(choice));
        player.setAllStats(doChoiceAction.statsEvent1(choice));
        eventTrigger.add("R1");
    }
    public void getEventREvent2(Player player) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("R2")) {
            return;
        }
        printEvent(eventDial.getREvent2());
        int choice = takeInput(3);
        Player.say(eventDial.getREvent2Choice(choice));
        player.setAllStats(doChoiceAction.statsEvent2(choice));
        eventTrigger.add("R2");
    }
    public void getEventREvent3(Player player, Inventory inventory) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("R3")) {
            return;
        }
        printEvent(eventDial.getREvent3());
        int choice = takeInput(2);
        Player.say(eventDial.getREvent3Choice(choice));
        player.setAllStats(doChoiceAction.statsFirstNight(choice));
        eventTrigger.add("R3");
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