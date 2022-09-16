package com.company;

public class Student {
    // Properties
    public String stuName;
    public double assignOneMark;
    public double assignTwoMark;
    public double totalMarkStu;


    //Constructors
    public Student (){}

    public Student (String pStuName, double pAssignOneMark, double pAssignTwoMark){
        this.stuName = pStuName;
        this.assignOneMark = pAssignOneMark;
        this.assignTwoMark = pAssignTwoMark;
        this.totalMarkStu = this.assignOneMark + this.assignTwoMark;
    }

    //Method
     public void reportOne(){
     System.out.printf(this.stuName + ": \t Assignment1 - %.1f \t Assignment2 - %.1f \t Total - %.1f \n", this.assignOneMark, this.assignTwoMark, this.totalMarkStu);}
}
