package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Place {

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
                Item sHammer = new Item("Small Hammer", "A tiny hammer you used to play when you were young");
                Item phone = new Item("Phone", "Used to call someone");
                Item jacket = new Item("Jacket", "Your school jacket. Quite large for your body");
                Collections.addAll(temp, phone, jacket, sHammer);
                break;
            case 1:
                Item calculator = new Item("Calculator", "A mechanical calculator for complex problems");
                Collections.addAll(temp, calculator);
                break;
            case 2:
                Item toolbox = new Item("Toolbox", "A small toolbox that holds every tool needed for woodcraft");
                Collections.addAll(temp, toolbox);
                break;
            case 3:
                break;
            case 4:
                Item statue = new Item("Statue", "A small statue with a small crack on it", "KEY INSIDE");
                Item bones = new Item("Bones", "Dogs enjoy this so much");
                Collections.addAll(temp, statue, bones);
                break;
            case 5:
                Item dye = new Item("Hairdye", "A small bottle of hair dye with good smell");
                Collections.addAll(temp, dye);

        }
        itemList = temp;
    }

    @Override
    public String toString() {
        return "CURRENT PLACE : " + this.placeName;
    }
}
