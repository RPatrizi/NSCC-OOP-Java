package com.company;

public class Pasta extends Food {
    //Attributes
    private String type;
    private String grainType;
    private double kilogram;

    //Constructors
    public Pasta (String pMeal, boolean pWantToEat){
        super(pMeal, pWantToEat);
        this.setType("Spaghetti");
        this.setGrainType("Whole Wheat");
        this.setKilogram(0.5);
    }

    public Pasta (String pMeal, boolean pWantToEat, String pType, String pGrainType, double pKilogram){
        super(pMeal, pWantToEat);
        this.setType(pType);
        this.setGrainType(pGrainType);
        this.setKilogram(pKilogram);
    }

    public Pasta (String pMeal, boolean pWantToEat, String pType, double pKilogram){
        super(pMeal, pWantToEat);
        this.setType(pType);
        this.setGrainType("Refined Wheat");
        this.setKilogram(pKilogram);
    }

    //Getter and Setter Methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrainType() {
        return grainType;
    }

    public void setGrainType(String grainType) {
        this.grainType = grainType;
    }

    public double getKilogram() {
        return kilogram;
    }

    public void setKilogram(double kilogram) {
        this.kilogram = kilogram;
    }

    //Methods
    public String yourChoice(){

        return "Your Main Course is a " + this.getGrainType() + " " + this.getType() + " portion of " + this.getKilogram() + " kg";
    }
}
