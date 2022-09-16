package com.company;

public class Student {
    //A.Member variables/Attribute/Properties
    //Don't use public at all for the properties. This is the Encapsulation Concept
    private String firstName;
    private String lastName;
    private String wNumber;
    private boolean isFullTime;
    private double tuitionFees;
     //To access those properties, you have to deal with your constructors or
    // Getters and Setters.

    //B.Constructors
    //1. The default constructor(The predefined constructor which will assign
    // default values to all the properties)
    //2. User defined constructor without parameters
    public Student(){
        this.firstName = "ABCDEF";
        this.lastName = "Nothing";
        this.tuitionFees = 1000;
    }
    //3. User defined constructor with parameters
    public Student(String pFirstName, String pLastName, String pWnumber,boolean isFullTime,
                   double tuitionFees){
        this.firstName = pFirstName;
        this.lastName = pLastName;
        this.wNumber = pWnumber;
        this.isFullTime = isFullTime;
        this.tuitionFees = tuitionFees;
    }

    //C. Methods/Behaviours/Getters/Setters
    public void reportOne(){
        System.out.println(this.firstName+"-".repeat(5)+this.lastName+
                "-".repeat(5)+this.wNumber+"-".repeat(5)+
                this.tuitionFees+"-".repeat(5)+this.isFullTime);
    }


}
