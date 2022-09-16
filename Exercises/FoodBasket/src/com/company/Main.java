package com.company;

public class Main {

    public static void main(String[] args) {
        //Declare array of Car objects (size 3)
        Food[] picnicBasket = new Food[3];

        //Create objects
        Food foodOne = new Food("Brocolis", "Vegetables");
        Food foodTwo = new Food("Lasagna", "Pasta");
        Food foodThree = new Food("Ice Cream", "Desert");

        picnicBasket[0] = foodOne;
        picnicBasket[1] = foodTwo;
        picnicBasket[2] = foodThree;

        for (int i = 0; i < picnicBasket.length; i++) {
            Food currentFood = picnicBasket[i];
            if (currentFood.foodType == "Vegetables"){
                System.out.println(currentFood.denylt());
            }
            else{
                System.out.println(currentFood.eatlt());
                }
        }


    }
}
