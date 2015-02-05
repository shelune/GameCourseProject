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
        int i;
        String[] event = eventDial.getFirstNight();
        for (i = 0; i < 7; i++) {
            say(event[i]);
            next();
        }
        int choice = -1;
        while (choice > 2 || choice < 0) {
            try {
                say(event[7]);
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                next();
            }
            switch (choice) {
                case 0:
                    say(event[8]); say(event[9]);
                    statsChanged[0] = 2;
                    break;
                case 1:
                    say(event[10]); say (event[11]);
                    statsChanged[1] = 2;
                    break;
                case 2:
                    say(event[12]);
                    break;
            }
        }
        say(event[13]);
        eventTrigger.add("0A");
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
