package com.company;

public abstract class Food {
    //Attributes
    private Plate typeOfPlate;
    private String typeOfFood;
    private String meal;
    private boolean wantToEat;

    //Constructors
    public Food (){
       // this.typeOfFood = "Pasta";
        this.setMeal("Lunch");
        this.setWantToEat(true);
    }

    public Food (String pMeal, boolean pWantToEat){
        this.setMeal(pMeal);
        this.setWantToEat(pWantToEat);
    }

    public Food (String pType){
        this.setWantToEat(false);
    }

    // Getter and Setter Methods
    public Plate getTypeOfPlate() {
        return typeOfPlate;
    }

    public void setTypeOfPlate(Plate typeOfPlate) {
        this.typeOfPlate = typeOfPlate;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public boolean isWantToEat() {
        return wantToEat;
    }

    public void setWantToEat(boolean wantToEat) {
        this.wantToEat = wantToEat;
    }

    // Methods
    public abstract String yourChoice();

    public String toString() {
        String wantMeal = "don't want to eat it in";
        if (this.isWantToEat()) {
            wantMeal = "want to eat it in";
        }
        return String.format("and you %s your %s", wantMeal, this.getMeal());
    }
}
