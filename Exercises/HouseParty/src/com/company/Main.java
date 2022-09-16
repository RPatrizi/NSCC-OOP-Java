package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        House HouseOne = new House(300, 450, 111);
        House HouseTwo = new House(500, 1000, 549);
        House HouseThree = new House(170, 655, 7);

        HouseOne.welcomeMessage();
        HouseOne.printTotalArea();
        HouseTwo.printTotalArea();
        HouseThree.printTotalArea();

    }
}
