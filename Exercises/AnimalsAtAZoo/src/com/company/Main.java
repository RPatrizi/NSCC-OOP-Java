package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal myCow = new Animal("Cow",500,"Farm",false);
        System.out.println(myCow);
        Animal myLion = new Animal("Lion",600,"Jungle",true);
        System.out.println(myLion.toString());
        Animal myDog = new Animal();
        //    Step 7:
//    Add the three Animals to the Zoo(Object Array).
//    Step 8:
//    Let’s interact with our objects, to test their functionality. Create a loop to take
//    each Animal out of the Zoo and call its methods.
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(myCow);
        animalList.add(myDog);
        animalList.add(myLion);

        for (Animal animal:animalList) {
            System.out.println(animal.toString());
            System.out.println(animal.feedAnimal());
            System.out.println(animal.makeSound());
        }
    }





}
