package com.company;

public class OOPIntro {
    // A class is a blueprint for describing an object
    //Car -> attributes: color, model, numOfTires, numOfSeats. Behaviour: startEngine, stopEngine, turnRight, turnLeft.

    //fields  -> used to define attributes in a Class
    public static void main(String[] args) {
        Car benz = new Car(); //crated new instance of existing class
       benz.startEngine(false);
        benz.stopEngine();
    }
}
