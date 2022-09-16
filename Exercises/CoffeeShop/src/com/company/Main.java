package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // create scanner object
        Scanner scannerObject = new Scanner(System.in);

	// declare variables
        double priceOfCoffee = 1.25 ;
        double taxRate = 1.15 ;
        double priceOfCake = 3.25;

        // gather information from user
        System.out.println("Welcome to the Coffee Shop");

        System.out.print("Please enter the number of cups: ");
        int numOfCups = scannerObject.nextInt();

        System.out.print("Please enter the number of cakes: ");
        int numOfCakes = scannerObject.nextInt();

        double preTaxTotal = (numOfCups * priceOfCoffee) + (numOfCakes * priceOfCake);
        double finalPrice = preTaxTotal * taxRate;


        System.out.println("Your pre tax total is: " + preTaxTotal);
        System.out.printf("Your pre tax total is: $ %.2f", finalPrice);
    }
}
