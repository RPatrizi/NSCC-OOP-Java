package com.company;

public class Course {
    // Properties
    public String courseName;
    public double assignOneTotalMark;
    public double assignTwoTotalMark;
    public double totalMarkCourse;

    //Constructors
    public Course (String pCourseName){
        this.courseName = pCourseName;
    }

    public Course(){}

    //Method
    public void reportTwo(){
        System.out.printf(this.courseName + ": \t Assignment1 - %.1f \t Assignment2 - %.1f \t Total - %.1f \n", this.assignOneTotalMark, this.assignTwoTotalMark, this.totalMarkCourse);}
}