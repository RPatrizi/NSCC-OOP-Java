package com.company;

public class Square extends Shape{
    //Properties
    public double sideLength;

    //Constructors
    public Square(String pColour, String pLineType, double pSideLength) {
        super(pColour, pLineType);
        this.sideLength = pSideLength;
    }

    //Methods
    public double getArea(){
        return (Math.pow(this.sideLength, 2));
    }
}
