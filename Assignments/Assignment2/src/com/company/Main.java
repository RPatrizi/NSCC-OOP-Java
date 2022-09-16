package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // New Scanner Object
        Scanner sc = new Scanner(System.in);

        // Declare Arrays
        Course[] courses = new Course[2];
        Student[] stuListOne = new Student[6];
        Student[] stuListTwo = new Student[6];

        // Gather information of courses
        System.out.println("Programming IT Courses");
        System.out.println("Course Entry");
        System.out.println("=".repeat(32));
        for (int i = 0; i < 2; i++){
            System.out.println("Enter name for course # " + (i+1) + ": ");
            courses[i] = new Course(sc.nextLine());
        }
        System.out.println("Student Entry");
        System.out.println("=".repeat(32));

        // Gather information of students course1
        System.out.println("Enter students for " + courses[0].courseName + ":");
        for (int k = 0; k < stuListOne.length; k++){
            stuListOne[k] = new Student();
            System.out.println("Enter name for student # " + (k+1) + ": ");
            stuListOne[k].stuName = sc.nextLine();
            System.out.println("Enter Assignment1 mark for " + stuListOne[k].stuName + ":");
            stuListOne[k].assignOneMark = sc.nextDouble();
            System.out.println("Enter Assignment2 mark for " + stuListOne[k].stuName + ":");
            stuListOne[k].assignTwoMark = sc.nextDouble();
            stuListOne[k].totalMarkStu = stuListOne[k].assignOneMark + stuListOne[k].assignTwoMark;
            sc.nextLine();
        }

        // Gather information of students course2
        System.out.println("Enter students for " + courses[1].courseName + ":");
        for (int n = 0; n < stuListTwo.length; n++){
            stuListTwo[n] = new Student();
            System.out.println("Enter name for student # " + (n+1) + ": ");
            stuListTwo[n].stuName = sc.nextLine();
            System.out.println("Enter Assignment1 mark for " + stuListTwo[n].stuName + ":");
            stuListTwo[n].assignOneMark = sc.nextDouble();
            System.out.println("Enter Assignment2 mark for " + stuListTwo[n].stuName + ":");
            stuListTwo[n].assignTwoMark = sc.nextDouble();
            stuListTwo[n].totalMarkStu = stuListTwo[n].assignOneMark + stuListTwo[n].assignTwoMark;
            sc.nextLine();
        }

        // Calculate Courses Total Mark for each Assignment
        for (int x = 0; x < stuListTwo.length; x++){
            courses[0].assignOneTotalMark += stuListOne[x].assignOneMark;
            courses[1].assignOneTotalMark += stuListTwo[x].assignOneMark;
            courses[0].assignTwoTotalMark += stuListOne[x].assignTwoMark;
            courses[1].assignTwoTotalMark += stuListTwo[x].assignTwoMark;
        }

        // Calculate Total Mark for each course
        for (int y = 0; y < courses.length; y++) {
            courses[y].totalMarkCourse = courses[y].assignOneTotalMark + courses[y].assignTwoTotalMark;
        }

        // Course Report
        System.out.println("REPORT: Stats per course");
        System.out.println("=".repeat(32));
        for (int w = 0; w < courses.length; w++) {
            courses[w].reportTwo();
        }
        System.out.println("");

        // Student Report
        System.out.println("REPORT: Stats per student");
        System.out.println("=".repeat(32));

        System.out.println(courses[0].courseName);
        for (int j = 0; j < stuListOne.length; j++) {
            stuListOne[j].reportOne();
        }

        System.out.println(courses[1].courseName);
        for (int h = 0; h < stuListOne.length; h++) {
            stuListTwo[h].reportOne();
        }
    }
}

//if (stuListTwo[n].assignOneMark < 0 || stuListTwo[n].assignOneMark > 20){
//        System.out.println("Enter a valid mark.");
//        break;
//        }