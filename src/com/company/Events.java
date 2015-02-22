package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Events {
    public static Scanner input = new Scanner(System.in);
    private Random rand = new Random();
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
        setEventTrigger("0A");
        setEventTrigger("DAYDREAMER");
        Player.say("Eventually, the darkness slowly fades away ... But the creepy feeling keeps on and prolongs throughout the night. It was a very haunting dream...");
        next();
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
        setEventTrigger("1A");
        next();
    }
    public void getEventAfterClass1st(Player player, Inventory inventory) {
        if (isTriggered("1B")) {
            return;
        }
        player.setPlayerStamina(25);
        printEvent(eventDial.getAfterClass1st());
        Item homework1 = new Item("Finnish Homework", "Rekt's weekend homework", "ASSIGNMENT");
        inventory.addItem(homework1);
        setEventTrigger("1B");
        setEventTrigger("CB");
        next();
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
        next();
        player.setAllStats(doChoiceAction.statsGetBullied(choice, und, inventory));
        setEventTrigger("2A");
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
        setEventTrigger("2B");
        next();
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
        setEventTrigger("2C");
        next();
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
        Player.say(eventDial.getFirstDeathChoice(choice));
        player.setAllStats(doChoiceAction.statsFirstDeath(choice));
        setEventTrigger("3A");
        setEventTrigger("JN");                                                  // Janitor
        next();
    }

    public void getEventFirstAtJanitors(Player player) {
        if (isTriggered("3B")) {
            return;
        }
        printEvent(eventDial.getFirstAtJanitors());
        setEventTrigger("3B");
        player.setPlayerPos(0);
        player.setPlayerStamina(30);
        next();
    }

	public void getEvent5A(Player player, Inventory inventory) {
		ChoiceAction doChoiceAction = new ChoiceAction();
		if (!isTriggered("5A") && inventory.hasItem("Statue") != null) {
			printEvent(eventDial.getEvent5A());
			int choice = takeInput(2);
			Player.say(eventDial.getEvent5AChoice(choice));
			player.setAllStats(doChoiceAction.statsEvent5A(choice));
			Player.say("Anyway, you have no idea what to do with the statue yet, so just keep it for later.");
			setEventTrigger("5A");
			next();
		} else {
			return;
		}
	}

    public void getEventFirstInJanitor(Inventory inventory, Player player) {
        if (isTriggered("5B")) {
            return;
        }
        Item oldKey = inventory.hasItem("Old Key");
        oldKey.consume();
        printEvent(eventDial.getFirstInJanitor());
        Item note = new Item("Small Note", "A note with barely readable text", eventDial.getJanitorNote());
        inventory.addItem(note);
        note.puzzle(this, player, inventory);
        setEventTrigger("5B");
        next();
    }

    public void getEvent7A(Player player) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("7A")) {
            return;
        }
        printEvent(eventDial.getEvent7A());
        setEventTrigger("7A");
        setEventTrigger("TT");                                                  // Tattooist's opened
        next();
    }

    public void getEvent7B(Player player) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (!isTriggered("7B") && isTriggered("5A")) {
            printEvent(eventDial.getEvent7B());
            int choice = takeInput(2);
            Player.say(eventDial.getEvent7BChoice(choice));
            player.setAllStats(doChoiceAction.statsEvent7B(choice));
            Player.say("While you are waiting, a phone rings from inside the store. Its sound… It’s so peculiar, yet a bit similar. You have the feeling that you heard this somewhere…");
            setEventTrigger("7B");
            next();
        }
    }

    public void getEvent7C(Player player) {
        if (isTriggered("7C")) {
            return;
        }
        printEvent(eventDial.getEvent7C());
        setEventTrigger("7C");
        next();
    }

    public void getEvent8A(Player player) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("8A")) {
            return;
        }
        printEvent(eventDial.getEvent8A());
        int choice = takeInput(1);
        if (choice == 0) {
            setEventTrigger("SIDEKICK");
        }
        player.setAllStats(doChoiceAction.statsEvent8A(choice));
        Player.say("Let’s come to that Tattooist’s place now, shall we?");
        setEventTrigger("8A");
        next();
    }

    public void getEvent8B(Player player) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (!isTriggered("8B") && isTriggered("8A")) {
            printEvent(eventDial.getEvent8B());
            int options=1;
            if (isTriggered("SIDEKICK")) {
                Player.say("\t(2) Ask your friend to do so");
                options=2;
            }
            int choice = takeInput(options);
            player.setAllStats(doChoiceAction.statsEvent8B(choice));
            setEventTrigger("8B");
            next();
        } else {
            return;
        }
    }

    public void getFrontOfTattoo() {
        if (isTriggered("9A")) {
            return;
        }
        printEvent(eventDial.getFrontOfTattoo());
        setEventTrigger("9A");
        next();
    }

    public void getFrontOfTattooPuzzle(Inventory inventory) {
        if (!isTriggered("9A") || isTriggered("9B")) {
            return;
        }
        printEvent(eventDial.getFrontOfTattooPuzzle());
        Item bone = inventory.hasItem("Bones");
        if (bone != null) {
            bone.consume();
            if (bone.getItemCount() < 2) {
                Player.say("You fed the dog some bones, but they were consumed too quickly.");
                bone.consume();
            } else {
                Player.say("Having eaten all the bones, the dog now is too full and starts to sleep.\nYou can sneak past it now.");
                setEventTrigger("9B");
                for (int i = 0; i < bone.getItemCount(); i++) {
                    bone.consume();
                }
            }
        }
        next();
    }

    public void getInsideTattoo(Inventory inventory, Player player) {
        if (!isTriggered("9B") || isTriggered("10A")) {
            return;
        }
        if (isTriggered("10B")) {
            Player.say("The strange object still lies there, waiting for you to investigate.\nCheck it?\n \t(0) Yes \t (1) No");
            int choice = takeInput(1);
            switch (choice) {
                case 0:
                    getTattooPuzzle(inventory);
                    break;
                case 1:
                    break;
            }
            return;
        }
        printEvent(eventDial.getInsideTattoo());
        int choice = takeInput(1);
        Player.say(eventDial.getInsideTattooChoice(choice));
        switch (choice) {
            case 0:
                player.setPlayerStamina(15);
                getTattooPuzzle(inventory);
                break;
            case 1:
                if (!isTriggered("10B")) {
                    setEventTrigger("10B");
                }
                break;
        }
        next();
    }

    public void getTattooPuzzle(Inventory inventory) {
        printEvent(eventDial.getTattooPuzzle());
        DateFormat dateFormat = new SimpleDateFormat("ddMM");
        Calendar cal = Calendar.getInstance();
        String password = dateFormat.format(cal.getTime());
        String guess = input.nextLine();
        if (guess.equals(password)) {
            inventory.addItem(new Item("Pass Card", "Access card for a lab somewhere"));
            Player.say("The box opens.. There's is a pass card inside.\n[Pass Card] Obtained!");
            setEventTrigger("10A");
        } else {
            Player.say("Wrong password. Try again some times");
            if (!isTriggered("10B")) {
                setEventTrigger("10B");
            }
        }

    }

    public void getFrontOfLab(Inventory inventory, Player player) {
        if (isTriggered("12A")) {
            return;
        }
        printEvent(eventDial.getFrontOfLab());
        if (player.getPlayerUnd() > 20 && player.getPlayerCrg() > 20) {
            if (inventory.hasItem("Small Hammer") != null) {
                Player.say("With your brilliant mind and courage, you used the hammer to fix the small bridge and go past it into the lab");
                setEventTrigger("12A");
            }
        } else if (inventory.hasItem("Toolbox") != null) {
            Player.say("The tool box has everything you need to fix the bridge.\nBut it takes you so long that you grow tired and decide to go home for a rest");
            player.rest();
            setEventTrigger("12A");
        } else {
            return;
        }
    }

    public void getHangOut(Player player) {
        if (isTriggered("14A")) {
            return;
        }
        printEvent(eventDial.getHangOut());
        player.setPlayerPos(4);
        setEventTrigger("14A");
        next();
    }

    public void getSeeWomanNumber(Player player, Inventory inventory) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("14B")) {
            return;
        }
        printEvent(eventDial.getSeeWomanNumber());
        if (player.getPlayerCrg() > 30) {
            printEvent(eventDial.getSeeWomanNumberHiCrg());
            int choice = takeInput(2);
            player.setAllStats(doChoiceAction.statsSeeWomanHiCrg(choice, player, this));
            if (choice == 1) {
                printEvent(eventDial.getSeeWomanNumberLowCrg());
                next();
                getFollowMan(player, inventory);
            }
            if (choice == 2) {
                printEvent(eventDial.getFollowManNext());
                choice = takeInput(1);
                if (choice == 0) {
                    printEvent(eventDial.getFollowWoman());
                    doChoiceAction.actionFollowWoman(player, this);
                    setEventTrigger("14D");
                } else {
                    getFollowMan(player, inventory);
                }

            }
        } else {
            printEvent(eventDial.getSeeWomanNumberLowCrg());
            next();
            getFollowMan(player, inventory);
        }
        setEventTrigger("14B");
        next();
    }

    public void getFollowMan(Player player, Inventory inventory) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("14C")) {
            return;
        }
        printEvent(eventDial.getFollowMan());
        int choice = takeInput(1);
        player.setAllStats(doChoiceAction.statsFollowMan(choice, this, inventory));
        Player.say(eventDial.getFollowManChoice(choice));
        setEventTrigger("14C");
    }

    public void getEvent15A(Player player)	{
        if (isTriggered("15A"))	{
            return;
        }
        printEvent(eventDial.getEvent15A());
        setEventTrigger("15A");
        setEventTrigger("VL");                                                  // OPEN TEACHER'S PLACE
        next();
    }

    public void getEvent15B(Player player) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("15B")) {
            return;
        }
        printEvent(eventDial.getEvent15B());
        int choice = takeInput(2);
        Player.say(eventDial.getEvent15BChoice(choice));
        player.setAllStats(doChoiceAction.statsEvent15B(choice));
        setEventTrigger("15B");
        next();
    }

    public void getEvent16A(Player player) {
        if (isTriggered("16A")) {
            return;
        }
        printEvent(eventDial.getGetArrested());
        setEventTrigger("16A");
        next();
    }

    public void getFinalEvent() {
        if (isTriggered("21A")) {
            return;
        }
        if (!isTriggered("RESCUER")) {
            printEvent(eventDial.getFinalEvent());
            int choice = takeInput(1);
            int correct = rand.nextInt(1);
            if (choice == correct) {
                printEvent(eventDial.getFinalEventChoiceCorrect());
                setEventTrigger("21A");
                setEventTrigger("HERO");
            } else {
                printEvent(eventDial.getFinalEventChoiceWrong());
                setEventTrigger("21A");
                setEventTrigger("ZERO");
            }
        } else {
            printEvent(eventDial.getFinalEventAlter());
            setEventTrigger("21A");
            setEventTrigger("HERO");
        }
        next();
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
        setEventTrigger("R1");
        next();
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
        setEventTrigger("R2");
        next();
    }

    public void getEventREvent3(Player player, Inventory inventory) {
        ChoiceAction doChoiceAction = new ChoiceAction();
        if (isTriggered("R3")) {
            return;
        }
        printEvent(eventDial.getREvent3());
        int choice = takeInput(2);
        Player.say(eventDial.getREvent3Choice(choice));
        player.setAllStats(doChoiceAction.statsEvent3(choice, inventory));
        setEventTrigger("R3");
        next();
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