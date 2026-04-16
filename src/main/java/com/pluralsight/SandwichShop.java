package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        //build an input system
        Scanner choice = new Scanner(System.in);

        //pre-set prices
        double basePrice1 = 5.45;
        double discount1Price1 = basePrice1 - (basePrice1 * 0.1);
        double discount2Price1 = basePrice1 - (basePrice1 * 0.2);
        double basePrice2 = 8.95;
        double discount1Price2 = basePrice2 - (basePrice2 * 0.1);
        double discount2Price2 = basePrice2 - (basePrice2 * 0.2);

        //Start output + input process

        System.out.println("Welcome to sandwich shop!\n");



        //Set choices / menu
        System.out.println("We have the following sizes:");
        System.out.println("1: Regular ....  $" + basePrice1);
        System.out.println("2: Large   ....  $" + basePrice2);

        System.out.println("\nWhich one would you like?");
        int size = choice.nextInt();

        // Clear Buffer
        choice.nextLine();

        //set option for discount
        System.out.println("We have some dicounts, would you like to check eligibility?\n Y (Yes)\n N (No) ");
        String check = choice.nextLine();

    }

}
