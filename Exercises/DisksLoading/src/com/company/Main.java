package com.company;

public class Main {

    public static void main(String[] args) {
        //Declare array of Car objects (size 3)
        Circle[] myCircles = new Circle[3];

        //Create objects
        Circle circleOne = new Circle();
        Circle circleTwo = new Circle(5.0);
        Circle circleThree = new Circle(5.5, "Orange");

        myCircles[0] = circleOne;
        myCircles[1] = circleTwo;
        myCircles[2] = circleThree;

        for (int i = 0; i < myCircles.length; i++) {
            Circle currentCircle = myCircles[i];
            System.out.println(currentCircle.toString());
        }
    }
}

