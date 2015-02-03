package com.company;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> inventory = new ArrayList <Item>();

    public Inventory() {

    }

    public void addItem(Item item) {
        String itemType = item.getItemType();
        if (itemType.equals("Food")) {
            if (inventory.contains(item)) {
                item.addItemCount();
            } else {
                inventory.add(item);
            }
        } else {
            if (!inventory.contains(item)) {
                inventory.add(item);
            } else {
                return;
            }
        }
    }

    public void addItem(Item item, int num) {
        for (int i = 0; i < num; i++) {
            addItem(item);
        }
    }

    public void use(Item item) {
        if (item.getItemCount() > 1) {
            item.consume();
        } else {
            inventory.remove(item);
        }
    }

    public int search(Item item) {
        return inventory.indexOf(item);
    }

    public int searchFood() {
        for (Item item : inventory) {
            if (item.isFood()) {
                return inventory.indexOf(item);
            }
        }
        return -1;
    }

    public boolean hasItem(Item item) {
        return inventory.contains(item);
    }

    public Item getItem(int index) {
        return inventory.get(index);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void printInventory() {
        System.out.println("Inventory: ");
        for (Item item : inventory) {
            System.out.print(item.getItemName() + "\tx" + item.getItemCount() + " | ");
        }
    }
}
