package com.company;

import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {                    // initiate the player
        Player player = new Player("", "", 100);
        player.start();
    }

}