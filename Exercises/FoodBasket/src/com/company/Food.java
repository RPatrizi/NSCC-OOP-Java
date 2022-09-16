package com.company;

public class Food {
    // Properties
    public String foodName;
    public String foodType;

    // Constructors
    public Food (){}

    public Food (String pFoodName, String pFoodType){
        this.foodName = pFoodName;
        this.foodType = pFoodType;
    }

    //Methods
    public String eatlt(){
        return  "You just ate the " + this.foodName;
    }

    public  String denylt(){
        return "Not eating " + this.foodName + " ! I hate " + this.foodType;
    }

}
