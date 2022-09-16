package com.company;

public class Circle {
    // Properties
    private double radius;
    private String colour;

    // Constructors
    public Circle (){
        this.setRadius(2.0);
        this.setColour("Green");
    }

    public Circle (double pRadius){
        this.setRadius(pRadius);
        this.setColour("Green");
    }

    public Circle (double pRadius, String pColour){
        this.setRadius(pRadius);
        this.setColour(pColour);
    }

    //Methods
    public double getArea(){
        return (Math.PI * Math.pow(this.getRadius(), 2));
    }

    public String toString(){
        return "Radius = " + this.getRadius() + ", Total Area = " + getArea() + " and Colour = " + this.getColour();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}