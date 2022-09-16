package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create scanner object
        Scanner scannerObject = new Scanner(System.in);

        // declare array
        String[] letterGrades = new String[] {"A", "B", "C", "D", "F"};
        int[] numGrades = new int[] {4, 3, 2, 1, 0};

        // declare variables
        String letterGrade = "";

        // gather information from user
        System.out.print("Please enter a letter grade (A, B, C, D or F): ");
        letterGrade = scannerObject.nextLine();

        for (int i = 0; i < letterGrades.length; i++) {
            if (Objects.equals(letterGrade, letterGrades[i])) {
                System.out.print("Based in the letter grade you entered, " + letterGrade + ", your numerical grade is: " + numGrades[i]);
            }
        }
    }
}
