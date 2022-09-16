package com.company;

public class Triangle extends Shape{
    //Properties
    public double sideOneLength;
    public double sideTwoLength;
    public double sideThreeLength;

    //Constructors
    public Triangle(String pColour, String pLineType, double pSideOneLength, double pSideTwoLength, double pSideThreeLength) {
        super(pColour, pLineType);
        this.sideOneLength = pSideOneLength;
        this.sideTwoLength = pSideTwoLength;
        this.sideThreeLength = pSideThreeLength;
    }

    //Methods
    public double getArea(){
        return (Math.sqrt((sideOneLength + sideTwoLength + sideThreeLength) *
                (-sideOneLength + sideTwoLength + sideThreeLength) * (sideOneLength - sideTwoLength + sideThreeLength) *
                (sideOneLength + sideTwoLength - sideThreeLength)) * 0.25);
    }
}
