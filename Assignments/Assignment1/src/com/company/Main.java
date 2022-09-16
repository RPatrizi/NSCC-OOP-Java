package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create scanner object
        Scanner sc = new Scanner(System.in);

        // First Part of the assignment

        // gather information from user
        System.out.println("Welcome to the first part!");

        System.out.print("Enter the number of asterisks: ");
        int numOfAsterisk = sc.nextInt();

        for (int i=numOfAsterisk; i>0; i--) {
            for (int y=0; y<i; y++) { // for loop nested to print number of *
                System.out.print("*");
            }
            System.out.println(); // line break at the end of each nested loop
        }

        // Second Part of the assignment

        // declare array
        double[] stMarks = new double[10] ;

        // declare variables
        double totalMark = 0;
        double averageMark = 0;
        double maxMark = stMarks[0];
        double minMark = 101;

        // gather information from user
        System.out.println("\nWelcome to the second part!");

        System.out.println("Enter the Student Marks: ");
        for (int i=0; i < stMarks.length; i++) { // for loop to be able to gather information for every student
            System.out.print("Enter Mark # " + (i + 1) + ": ");
            stMarks[i] = sc.nextDouble();
            if (stMarks[i] > maxMark) // if statement to check if mark typed is bigger than previously one
                maxMark = stMarks[i];

            if (stMarks[i] < minMark) // if statement to check if mark typed is smaller than previously one
                minMark = stMarks[i];
        }
        for (int j=0; j < stMarks.length; j++) { // for loop to sum marks
            totalMark = totalMark + stMarks[j];
        }
        averageMark = (totalMark / stMarks.length);


        // output
        System.out.println("\nFinal Report:");
        System.out.println("The Total Marks: " + totalMark);
        System.out.printf("The Average : %.1f \n",averageMark);
        System.out.println("The Maximum Value : " + maxMark);
        System.out.println("The Minimum Value : " + minMark);


        // Third Part of the assignment

        // declare variables
        int sumFirstRow = 0;
        int sumTotal = 0;
        int averageTotal = 0;
        int totalLen = 0;
        int n = 0;

        // declare array
        int[][] myArray = {
                {10, 20, 30, 40},
                {12, 15, 18, 19},
                {10, 10, 10, 10}
        } ;
        int[] my1DArray = new int [myArray.length * myArray[0].length]; // create 1D array considering 2D array

        for (int i=0; i < 4; i++) { // to sum first roll
            sumFirstRow = sumFirstRow + myArray[0][i];
        }

        for (int j=0; j < 3; j++) {
            for (int k = 0; k < 4; k++) { // for loop nested to calculate total marks, total length and to insert 2D array values to 1D array
                sumTotal = sumTotal + myArray[j][k];
                totalLen++;
                my1DArray[n] = myArray[j][k];
                n++;
            }
        averageTotal = sumTotal / totalLen;
        }

        // output
        System.out.println("\nWelcome to the third part!");
        System.out.println("The array elements are:\n");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) { // nested loop to print all elements of the 2D array
                System.out.print(myArray[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("\nThe sum of Row # 1 is: " + sumFirstRow);
        System.out.println("The average for the entire array is: " + averageTotal);

        System.out.println("\nThe converted array’s elements are:");
        for (int z = 0; z < my1DArray.length; z++) { // for loop to print 1D array elements
                System.out.println(my1DArray[z]);
        }
    }
}
