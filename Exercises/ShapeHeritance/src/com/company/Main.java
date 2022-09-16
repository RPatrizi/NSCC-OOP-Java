package com.company;

public class Main {

    public static void main(String[] args) {
        //Declare array of Car objects (size 3)
        Shape[] myShapes = new Shape[3];

        // Instantiate
        Circle myCircle = new Circle("Black", "Dotted", 4.5);
        Square mySquare = new Square("Blue", "Double", 3.0);
        Triangle myTriangle = new Triangle("Red", "Solid", 3.0, 3.0, 3.0);

        myShapes[0] = myCircle;
        myShapes[1] = mySquare;
        myShapes[2] = myTriangle;

        for (int i = 0; i < myShapes.length; i++) {
            Shape currentShape = myShapes[i];
            System.out.println("The total area of the shape is " + currentShape.getArea());
        }
    }


}
