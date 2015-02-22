package com.company;

import java.util.*;


/**
 * Created by ASUS on 29-Jan-15.
 */
public class Map {
    private HashMap<Integer, Place> map = new HashMap<Integer, Place>();
    Scanner input = new Scanner(System.in);

    private Place teacher = new Place(5, "Mr.Cherr's", "Your chemistry teacher's house. It looks nice and clean", "VL");
    private Place tattoo = new Place(6, "Mr.Tate's", "A famous tattooist's in your area. It has some weird graffiti on the walls.", "TT");
    private Place police = new Place(7, "Police station", "A place for laws and jails. Wonder if you will get in there.", "PL");
    private Place river = new Place(8, "River", "Your area's main water source. It feels fresh being here.", "RV");

    // unused places, can be modified

    public Map() {
        map.put(0, addHome());
        map.put(1, addClassA());
        map.put(2, addClassB());
        map.put(3, addMountain());
        map.put(4, addJanitor());
    }

    public Place getPlace(int x) {
        return map.get(x);
    }

    public boolean isReachable(int playerPos, int destination) {    // check if can go to datPlace from disPlace
        Map cloneMap = new Map();
        Place disPlace = cloneMap.getPlace(playerPos);
        Place datPlace = cloneMap.getPlace(destination);
        return disPlace.canAccessTo(datPlace.getPlaceName());
    }

    public boolean isAccessible(Events events, int accessCode) {  // check if place is unlocked
        return events.isTriggered(map.get(accessCode).getAccessCode());
    }

    public void printPlace(int x) {
        System.out.println(getPlace(x));
    }

    public int move(int playerPos, Events events) {               // check everything then move player
        int destination = -1;
        while (destination >= map.size() || destination < 0) {
            try {
                System.out.println("[Only places with numbers in brackets are available!]");
                destination = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("[Only places with numbers in brackets are available!]");
                input.nextLine();
            }
        }
        if (isReachable(playerPos, destination) && isAccessible(events, destination)) {
            playerPos = destination;
            printPlace(playerPos);
            return playerPos;
        } else {
            System.out.println("Area not accessible!");
            return playerPos;
        }
    }

    public ArrayList<Item> showItems(int pos) {
        say("Items in this area: ");
        ArrayList<com.company.Item> itemList = getPlace(pos).getItemList();
        if (itemList.size() < 1) {
            say("EMPTY AREA!");
        } else {
            for (int i = 0; i < itemList.size(); i++) {
                say("(" + i + ") " + itemList.get(i).getItemName() + "\t| " + itemList.get(i).getItemDescription());
            }
        }
        return itemList;
    }

    public Place addHome() {
        Place home = new Place (0, "Home", "This is your own home", "HM");
        home.setItems();
        Collections.addAll(home.getAccessTo(), "Home", "ClassA", "Mountain", "Mr.Jani's", "Mr.Cherr's", "Police station");
        return home;
    }

    public Place addClassA() {
        Place classA = new Place(1, "ClassA", "This is your own class", "CA");
        classA.setItems();
        Collections.addAll(classA.getAccessTo(), "ClassA", "Home", "ClassB");
        return classA;
    }

    public Place addClassB() {
        Place classB = new Place(2, "ClassB", "This is your buddy's class", "CB");
        Collections.addAll(classB.getAccessTo(), "ClassB", "ClassA", "Mr.Jani's");
        return classB;
    }

    public Place addMountain() {
        Place mountain = new Place(3, "Mountain", "This is the mountain near your school", "MT");
        Collections.addAll(mountain.getAccessTo(), "Home", "River", "Mountain", "Police station");
        return mountain;
    }

    public Place addJanitor() {
        //janitor.addAccessTo("Home");
        Place janitor = new Place(4, "Mr.Jani's", "This is your school janitor's house. It feels creepy somehow", "JN");
        Collections.addAll(janitor.getAccessTo(), "Home", "ClassB");
        janitor.setItems();
        return janitor;
    }

    public static void say(String text) {
        System.out.println(text);
    }
}
