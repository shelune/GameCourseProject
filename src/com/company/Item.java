package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Item {
    private Scanner input = new Scanner(System.in);
    private boolean keyItem = false;
    private String itemType;
    private String itemName;
    private String itemDescription;         // description with stamina rec / how-to-use hint
    private String clue;
    private int staminaRec;                 // MUST BE NEGATIVE
    private int itemCount;                  // how many item you have

    public Item(String name, String description, int stamina, int count) {
        this.itemType = "Food";
        this.itemName = name;
        this.itemDescription = description;
        this.staminaRec = stamina;
        this.itemCount = count;
    }

    public Item(String name, String description) {
        this.itemType = "Tool";
        this.itemName = name;
        this.itemDescription = description;
        this.itemCount = 1;
    }

    public Item(String name, String description, String clue) {
        this.keyItem = true;
        this.itemType = "KeyItem";
        this.itemName = name;
        this.itemDescription = description;
        this.clue = clue;
        this.itemCount = 1;
    }

    public String getItemType() {
        return this.itemType;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }
    public String getItemName() {
        return itemName;
    }

    public int getStaminaRec() {
        return this.staminaRec;
    }

    public void addItemCount() {
        addItemCount(1);
    }

    public void addItemCount(int n) {
        if (n < 1) {
            return;
        }
        this.itemCount += n;
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public boolean isFood() {
        return itemType.equals("Food");
    }

    public boolean isKeyItem() {
        return keyItem;
    }

    public void consume() {
        this.itemCount--;
    }

    public String getItemClue() {
        return this.clue;
    }

    public void puzzle(Events events, Player player) {
        Events.next();
        if (!keyItem) {
            player.setPlayerStamina(60);
        } else {
            if (itemName.equalsIgnoreCase("small note")) {
                Player.say(getItemClue());
                Player.say("What do you these numbers at the end of the note to be?\n\t(0) An IP address\n\t(1) A location\n\t(2) Some phone numbers\n\t(3) Words in a book");
                int i = takeInput(3);
                switch (i) {
                    case 1:
                        events.setEventTrigger("MT");
                        Player.say("How brilliant! If you switch the note side down, it would be \n\t56.82.13 N | 165.168.11 W\nObviously some kind of geography stuff with latitude and longitude.");
                        Player.say("...\t +++ NEW AREA OPENED : MOUNTAIN +++");
                        solved();
                        break;
                    default:
                        Player.say("It seems not to be the case here... Although you want to think of something else, it is getting really late and you need some other time to figure this out.");
                        player.setPlayerStamina(50);
                        break;
                }
            }
            if (itemName.equalsIgnoreCase("finnish homework")) {
                Player.say("What are the correct meanings of the following words?");
                Player.say("WORDS : Tuuli | Tuli | Tulli\n\t(0) Wind | Fire | Customs\n\t(1) Fire | Wind | Customs\n\t(2) Customs | Fire | Wind\n\t(3) Fire | Customs | Wind");
                int i = takeInput(3);
                switch (i) {
                    case 0:
                        solved();
                        Player.say("Seems to be the right answer! You can give Rekt this with certainty!");
                        this.consume();
                        break;
                    default:
                        Player.say("You are not sure about this though... Probably wanna give him the answer later.");
                        player.setPlayerStamina(30);
                        break;
                }
            }
        }
    }

    public void puzzle(Events events, Player player, Inventory inventory) {
    }

    public void solved() {
        this.keyItem = false;
    }
    public String toString() {
        return itemName + " (" + itemDescription + ")";
    }

    public int takeInput(int upperLim) {
        int choice = -1;
        while (choice > upperLim || choice < 0) {
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                Events.next();
            }
        }
        return choice;
    }
}

