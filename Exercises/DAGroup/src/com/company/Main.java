package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Student firstStudent = new Student(); // Java will assign constant values from
        // the user defined constructor without parametersand the remaining propwerties
        // will get the default values from the default constructor
        Student secondStudent = new Student("Yousef","Abu Baker","W111111",
                true,12000);
        firstStudent.reportOne();
        secondStudent.reportOne();
        //Normal or premitive data type array:
        double[] stMarks = new double[10];

        //Array of Object
        Student[] myList = new Student[3];
        myList[0] = firstStudent;
        myList[1] = secondStudent;
        myList[2] = new Student("David","Yousef","W22222",
                false,1500);
        System.out.println("From array of objects");
        for (int i = 0; i < myList.length; i++) {
            myList[i].reportOne();
        }

        //Declare a new array of objects.
        Student[] classList = new Student[3];
        String stdFname;
        String stdLname;
        String stdWnumber;
        boolean enrollment;
        double stdTuiFees;
        //System.out.println(classList.length);
        System.out.println("The second array of objects");

        for (int i = 0; i < classList.length ; i++) {
            System.out.println("Enter student's information # "+(i+1));
            System.out.println("Enter student's first name");
            stdFname = sc.nextLine();
            System.out.println("Enter student's last name");
            stdLname = sc.nextLine();
            System.out.println("Enter student's W number");
            stdWnumber = sc.nextLine();
            System.out.println("Enter student's enrollment (true/false) ? ");
            enrollment = sc.nextBoolean();
            System.out.println("Enter student's tuition fees");
            stdTuiFees = sc.nextDouble();
            sc.nextLine(); //to read or get the new line character from tuition fees entry
            //Instantiate my objects.
            classList[i] = new Student(stdFname,stdLname,stdWnumber,enrollment,stdTuiFees);
        }
        for (int i = 0; i < classList.length; i++) {
            classList[i].reportOne();
        }





    }
}
