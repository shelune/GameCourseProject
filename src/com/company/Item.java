package com.company;


import java.util.Random;

public class Item {
    private boolean keyItem = false;
    private String itemType;
    private String itemName;
    private String itemDescription;         // description with stamina rec / how-to-use hint
    private String clue;
    private int staminaRec;                 // MUST BE NEGATIVE
    private int itemCount;                  // how many item you have

    private final static Random rand = new Random();

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
        this.itemName = name;
        this.itemDescription = description;
        this.clue = clue;
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

    public String toString() {
        return itemName + " (" + itemDescription + ")";
    }
}

