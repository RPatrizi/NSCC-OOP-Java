package com.company;

public class Desert extends Food {
    //Attributes
    private String type;
    private String flavour;

    //Constructors
    public Desert (String pMeal, boolean pWantToEat){
        super(pMeal, pWantToEat);
        this.setType("Ice Cream");
        this.setFlavour("Vanilla");
    }

    public Desert (String pMeal, boolean pWantToEat, String pType, String pFlavour){
        super(pMeal, pWantToEat);
        this.setType(pType);
        this.setFlavour(pFlavour);
    }

    public Desert (String pMeal, boolean pWantToEat, String pType){
        super(pMeal, pWantToEat);
        this.setType(pType);
        this.setFlavour("Chocolate");
    }

    //Getter and Setter Methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    //Methods
    public String yourChoice(){

        return "Your Desert is a " + this.getFlavour() + " " + this.getType();
    }
}
