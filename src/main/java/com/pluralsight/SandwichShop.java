package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        //build an input system
        Scanner choice = new Scanner(System.in);

    //pre-set prices
        double basePrice1 = 5.45;
        double loadedPrice1 = 1.00 + basePrice1;
        //discounts of Price-1
        //10%
        double discount1Price1 = basePrice1 - (basePrice1 * 0.1);
        double loadedDiscount1Price1 = loadedPrice1 - (loadedPrice1 * 0.1);
        //20%
        double discount2Price1 = basePrice1 - (basePrice1 * 0.2);
        double loadedDiscount2Price1 = loadedPrice1 - (loadedPrice1 * 0.2);

        double basePrice2 = 8.95;
        double loadedPrice2 = 1.75 + basePrice2;
        //discounts of Price-2
        // 10%
        double discount1Price2 = basePrice2 - (basePrice2 * 0.1);
        double loadedDiscount1Price2 = loadedPrice2 - (loadedPrice2 * 0.1);
        // 20%
        double discount2Price2 = basePrice2 - (basePrice2 * 0.2);
        double loadedDiscount2Price2 = loadedPrice2 - (loadedPrice2 * 0.2);


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

        //loaded sandwich option
        System.out.println("Would you like your sandwich loaded (double everything)?");
        System.out.println("Y : Yes" + "\nN : No");
        String loaded = choice.nextLine();


        //set option for discount
        System.out.println("We have some dicounts, would you like to check eligibility?\n Y (Yes)\n N (No) ");
        String check = choice.nextLine();

    //set price display

        /* calculate discount if Customer wants to
         * this applies discount automatically, if customer is eligible
         * code could be slightly modified to apply discount upon customer's request
         */

        //Price w/o loaded option
        if (check.equalsIgnoreCase("Y") && loaded.equalsIgnoreCase("N")) {
            System.out.println("What is your age? ");
            int age = choice.nextInt();

            if (age <= 17) {
                if (size == 1) {
                    System.out.printf("You get 10%% discounts" + "\n~~Your new total is: $%.2f", discount1Price1);
                } else if (size == 2) {
                    System.out.printf("You get 10%% discounts" + "\n~~Your new total is: $%.2f", discount1Price2);
                }

            } else if (age >= 65) {
                if (size == 1) {
                    System.out.printf("You get 20%% discounts" + "\n~~Your new total is: $%.2f", discount2Price1);
                } else if (size == 2) {
                    System.out.printf("You get 20%% discounts" + "\n~~Your new total is: $%.2f", discount2Price2);
                }

                // if customer wants discount but isn't eligible
            } else {
                System.out.println("Sorry, you're not eligible for any of our discounts.");
                if (size == 1) {
                    System.out.println("Your total is: $" + basePrice1);
                } else if (size == 2) {
                    System.out.println("Your total is: $" + basePrice2);
                }
            }

            /* if customer doesn't want discount
             * display base price w/o discount
             */
        } else if (check.equalsIgnoreCase("N") && loaded.equalsIgnoreCase("N")) {
            if (size == 1) {
                System.out.println("Your total is: $" + basePrice1);
            } else if (size == 2) {
                System.out.println("Your total is: $" + basePrice2);
            }

        }

        //price w loaded option
        if (check.equalsIgnoreCase("Y") && loaded.equalsIgnoreCase("Y")) {
            System.out.println("What is your age? ");
            int age = choice.nextInt();

            if (age <= 17) {
                if (size == 1) {
                    System.out.printf("You get 10%% discounts" + "\n~~Your new total is: $%.2f", loadedDiscount1Price1);
                } else if (size == 2) {
                    System.out.printf("You get 10%% discounts" + "\n~~Your new total is: $%.2f", loadedDiscount1Price2);
                }

            } else if (age >= 65) {
                if (size == 1) {
                    System.out.printf("You get 20%% discounts" + "\n~~Your new total is: $%.2f", loadedDiscount2Price1);
                } else if (size == 2) {
                    System.out.printf("You get 20%% discounts" + "\n~~Your new total is: $%.2f", loadedDiscount2Price2);
                }

                // if customer wants discount but isn't eligible
            } else {
                System.out.println("Sorry, you're not eligible for any of our discounts.");
                if (size == 1) {
                    System.out.println("Your total is: $" + loadedPrice1);
                } else if (size == 2) {
                    System.out.println("Your total is: $" + loadedPrice2);
                }
            }

            /* if customer doesn't want discount
             * display loaded-sandwich price w/o discount
             */
        } else if (check.equalsIgnoreCase("N") && loaded.equalsIgnoreCase("Y")) {
            if (size == 1) {
                System.out.println("Your total is: $" + loadedPrice1);
            } else if (size == 2) {
                System.out.println("Your total is: $" + loadedPrice2);
            }

        }

        // Service conclusion
        System.out.println("\nYour sandwich will be ready in a bit, \nWe hope you like your it!");

    }
}
