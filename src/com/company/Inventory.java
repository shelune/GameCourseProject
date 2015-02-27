package com.company;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> inventory = new ArrayList <Item>();

    public void addItem(Item item) {
        if (inventory.contains(item)) {
            item.addItemCount();
            Player.say("Item amount ++");
        } else {
            inventory.add(item);
            Player.say("New item added.");
        }
    }

    public void use(Item item) {
        item.consume();
    }

    public int search(Item item) {
        return inventory.indexOf(item);
    }

    public void delInvalidItem() {
        ArrayList toRemove = new ArrayList();
        int length = inventory.size();
        for (Item i : inventory) {
            if (i.getItemCount() <= 0) {
                toRemove.add(i);
            }
        }
        if (length > 6) {
            toRemove.add(inventory.get(0));
        }
        inventory.removeAll(toRemove);
    }

    public void empty() {
        inventory.clear();
    }

    public int searchFood() {
        for (Item item : inventory) {
            if (item.isFood()) {
                return inventory.indexOf(item);
            }
        }
        return -1;
    }

    public Item hasItem(String name) {
        for (Item i : inventory) {
            if (i.getItemName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return null;
    }

    public Item searchKeyItem() {
        for (Item i : inventory) {
           if (i.isKeyItem()) {
               return i;
           }
        }
        return null;
    }

    public Item getItem(int index) {
        return inventory.get(index);
    }

    public void printInventory() {
        System.out.println("Inventory: ");
        for (Item item : inventory) {
            System.out.println(item.getItemName() + "\tx" + item.getItemCount() + " | " + item.getItemDescription());
        }
    }
}
