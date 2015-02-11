package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ASUS on 29-Jan-15.
 */
public class Place {
    private Dialogue dialogue = new Dialogue();

    private int placeNumber;
    private String placeName;
    private String placeDescription;
    private String accessCode;
    private ArrayList<String> accessTo = new ArrayList<String>();
    private ArrayList<Item> itemList = new ArrayList<Item>();

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

    public void setItems() {
        ArrayList<Item> temp = new ArrayList<Item>();
        switch (placeNumber) {
            case 0:
                // Item apple = new Item("Apple", "Recovers 10 Stamina", 10, 1);
                Item phone = new Item("Phone", "Used to call someone");
                Item magnifier = new Item("Magnifier", "Used to see tiny things");
                Collections.addAll(temp, phone, magnifier);
                break;
            case 1:
                Item calculator = new Item("Calculator", "A mechanical calculator for complex problems");
                Collections.addAll(temp, calculator);
                break;
            case 4:
                Item statue = new Item("Status", "A small statue with a small crack on it", "KEY INSIDE");
                Collections.addAll(temp, statue);
                break;

        }
        itemList = temp;
    }

    @Override
    public String toString() {
        return this.placeName + " - " + this.placeDescription;
    }
}
