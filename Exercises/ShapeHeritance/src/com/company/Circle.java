package com.company;

public class Circle extends Shape{
    // Properties
    public double radius;

    //Constructors
    public Circle(String pColour, String pLineType, double pRadius){
        super(pColour, pLineType);
        this.radius = pRadius;
    }

    //Methods
    public double getArea(){
        return (Math.PI * Math.pow(this.radius, 2));
    }
}
