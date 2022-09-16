package com.company;

public class Meat extends Food{
    //Attributes
    private String animal;
    private String type;
    private String doneness;
    private double kilogram;

    //Constructors
    public Meat (String pMeal, boolean pWantToEat){
        super(pMeal, pWantToEat);
        this.setAnimal("Pork");
        this.setType("Steak");
        this.setDoneness("Medium Well");
        this.setKilogram(0.4);
    }

    public Meat (String pMeal, boolean pWantToEat, String pAnimal, String pType, String pDoneness, double pKilogram){
        super(pMeal, pWantToEat);
        this.setAnimal(pAnimal);
        this.setType(pType);
        this.setDoneness(pDoneness);
        this.setKilogram(pKilogram);
    }

    public Meat (String pMeal, boolean pWantToEat, String pType, double pKilogram) {
        super(pMeal, pWantToEat);
        this.setAnimal(pType);
        this.setType("Steak");
        this.setDoneness("Rare");
        this.setKilogram(pKilogram);
    }

    //Getter and Setter Methods
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDoneness() {
        return doneness;
    }

    public void setDoneness(String doneness) {
        this.doneness = doneness;
    }

    public double getKilogram() {
        return kilogram;
    }

    public void setKilogram(double kilogram) {
        this.kilogram = kilogram;
    }

    //Methods
    public String yourChoice(){

        return "Accompanying the Main Course, a " + this.getAnimal() + " " + this.getType() + " served " + this.getDoneness() + " portion of " + this.getKilogram()  + " kg";
    }
}
