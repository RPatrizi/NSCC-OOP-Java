package com.company;

public class House {
    public double Width;
    public double Length;
    public Integer HouseNum;
    public double TotalArea;

    //Constructor
    public House(double pWidth, double pLength, Integer pHouseNum){
        this.Width = pWidth;
        this.Length = pLength;
        this.HouseNum = pHouseNum;
        this.TotalArea = this.Width * this.Length;
    }

    //Methods
    public void welcomeMessage() {
        System.out.println("Welcome to the House Party!");
    }

    public void printTotalArea(){
        System.out.println("The house number " + this.HouseNum + " has " + this.TotalArea + " of total square footage.");
    }
}
