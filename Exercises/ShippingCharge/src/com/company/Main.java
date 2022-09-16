package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create scanner object
        Scanner scannerObject = new Scanner(System.in);

        // declare variables
        double freeShipping = 50.00;
        double shippingAmount = 10.00;

        // gather information from user
        System.out.println("Welcome to our company");

        System.out.print("Please enter the total amount of your purchase: $");
        int purchaseAmount = scannerObject.nextInt();

        double finalPrice;
        if (purchaseAmount < freeShipping) {
            finalPrice = purchaseAmount + shippingAmount;
        }
        else{
            finalPrice = purchaseAmount;
            }

        System.out.printf("Your total amount with shipping is: $ %.2f", finalPrice);
    }
}
