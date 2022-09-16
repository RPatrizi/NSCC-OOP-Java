package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pasta myPasta = new Pasta("Dinner",true);
        Desert myDesert = new Desert("Dinner",false);
        Plate myPlate = new Plate();
        Meat myMeat = new Meat("Dinner",true);
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(myPasta);
        foodList.add(myDesert);
        foodList.add(myMeat);


        for (Food food:foodList) {
            System.out.println(food.yourChoice());
            System.out.println(food.toString());
        }
    }
}
