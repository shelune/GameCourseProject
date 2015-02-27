package com.company;

import java.util.*;

public class Map {
    private HashMap<Integer, Place> map = new HashMap<Integer, Place>();
    Scanner input = new Scanner(System.in);

    public Map() {
        map.put(0, addHome());
        map.put(1, addClassA());
        map.put(2, addClassB());
        map.put(3, addMountain());
        map.put(4, addJanitor());
        map.put(5, addTattoo());
        map.put(6, addLab());
        map.put(7, addTeacher());
        map.put(8, addPolice());
        map.put(9, addRiver());
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

    public void move(int playerPos, Events events, Player player) {               // check everything then move player
        int destination = -1;
        while (destination >= map.size() || destination < 0) {
            try {
                System.out.println("[Only places with numbers in brackets are available!]");
                destination = input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
            }
        }
        if (events.isTriggered("ARRESTED")) {
            Player.say("You're in jail. Your movement is limited.");
            return;
        }
        if (isReachable(playerPos, destination) && isAccessible(events, destination)) {
            if (destination != 1 && !events.isTriggered("TC") && player.getDayCount() % 7 != 0 && player.getDayCount() < 19) {
                Player.say("You have to go to your class first!");
                input.nextLine();
                return;
            }
            player.setPlayerPos(destination);
            if (playerPos != destination) {
                player.setPlayerStamina(player.getStaminaLost());
                printPlace(destination);
            }
        } else {
            System.out.println("Area not accessible!");
        }
    }

    public ArrayList<Item> showItems(int pos) {
        Player.say("Items in this area: ");
        ArrayList<com.company.Item> itemList = getPlace(pos).getItemList();
        if (itemList.size() < 1) {
            Player.say("EMPTY AREA!");
        } else {
            for (int i = 0; i < itemList.size(); i++) {
                Player.say("(" + i + ") " + itemList.get(i).getItemName() + "\t| " + itemList.get(i).getItemDescription());
            }
        }
        return itemList;
    }

    public Place addHome() {
        Place home = new Place (0, "Home", "This is your own home", "HM");
        home.setItems();
        Collections.addAll(home.getAccessTo(), "Home", "ClassA", "Mountain", "Janitor's", "Tattoo's", "Teacher's", "Police station");
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
        Collections.addAll(classB.getAccessTo(), "ClassB", "ClassA", "Janitor's");
        classB.setItems();
        return classB;
    }

    public Place addMountain() {
        Place mountain = new Place(3, "Mountain", "This is the mountain near your school", "MT");
        Collections.addAll(mountain.getAccessTo(), "Home", "River", "Mountain", "Lab");
        return mountain;
    }

    public Place addJanitor() {
        //janitor.addAccessTo("Home");
        Place janitor = new Place(4, "Janitor's", "This is your school janitor's house. It feels creepy somehow", "JN");
        Collections.addAll(janitor.getAccessTo(), "Home", "ClassB", "Janitor's");
        janitor.setItems();
        return janitor;
    }

    public Place addTattoo() {
        Place tattoo = new Place(5, "Tattoo's", "A famous tattooist's in your area. It has some weird graffiti on the walls.", "TT");
        Collections.addAll(tattoo.getAccessTo(), "Home", "Tattoo's");
        tattoo.setItems();
        return tattoo;
    }

    public Place addLab() {
        Place lab = new Place(6, "Lab", "A abandoned lab situationed at the side of the mountain", "LB");
        Collections.addAll(lab.getAccessTo(), "Mountain", "Lab");
        lab.setItems();
        return lab;
    }

    public Place addTeacher() {
        Place teacher = new Place(7, "Teacher's", "Your chemistry teacher's house. It looks nice and clean", "VL");
        Collections.addAll(teacher.getAccessTo(), "Home", "Teacher's");
        teacher.setItems();
        return teacher;
    }

    public Place addPolice() {
        Place police = new Place(8, "Police station", "A place for laws and jails. Wonder if you will get in there.", "PL");
        Collections.addAll(police.getAccessTo(), "Home", "Police station");
        police.setItems();
        return police;
    }

    public Place addRiver() {
        Place river = new Place(9, "River", "Your area's main water source. It feels fresh being here.", "RV");
        Collections.addAll(river.getAccessTo(), "Mountain", "River");
        river.setItems();
        return river;
    }
}
