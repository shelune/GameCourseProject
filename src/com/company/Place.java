package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ASUS on 29-Jan-15.
 */
public class Place {
    private Random rand = new Random();
    private Dialogue dialogue = new Dialogue();

    private int placeNumber;
    private String placeName;
    private String placeDescription;
    private ArrayList<Item> itemList = new ArrayList<Item>();
    private String accessCode;
    private ArrayList<String> accessTo = new ArrayList<String>();

    public Place(int num, String name, String description, String access) {
        this.placeNumber = num;
        this.placeName = name;
        this.placeDescription = description;
        this.accessCode = access;
    }

    public boolean canAccessTo(String code) {
        return this.accessTo.contains(code);
    }


    public ArrayList<String> getAccessTo() {
        return accessTo;
    }

    public String getAccessCode() {
        return this.accessCode;
    }

    public ArrayList<Item> getItemList() {
        return this.itemList;
    }

    public String getPlaceName() {
        return this.placeName;
    }

    public void loadHomeItems() {
        Item apple = new Item("Apple", "Recovers 10 Stamina", 10, 1);
        Item phone = new Item("Phone", "Used to call someone");
        Item magnifier = new Item("Magnifier", "Used to see tiny things");
        itemList.add(apple);
        itemList.add(phone);
    }

    public void loadJanitorItems() {
        Item note = new Item("Small Note", dialogue.getJanitorNote());
        itemList.add(note);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    @Override
    public String toString() {
        return this.placeName + " - " + this.placeDescription;
    }
}
