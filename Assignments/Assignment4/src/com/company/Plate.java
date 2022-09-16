package com.company;

public class Plate {
    //Attributes
    private String color;
    private String material;
    private double radius;

    //Constructors
    public Plate (){
        this.setColor("Gray");
        this.setMaterial("Ceramic");
        this.setRadius(12.4);
    }
    // Getter and Setter Methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
