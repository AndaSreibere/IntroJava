package com.company;

public class Car {
    //define the attributes of the object
    private String color = "BLUE";
    private String model = "w1";
    private int numOfTires = 4;
    private boolean engineOn = false;

    //define their behaviours
    //start engine
    public void startEngine(boolean key){
        if (key && !engineOn) {
            System.out.println("Engine started");
            engineOn = true;
        }else{
            System.out.println("Key not in, cannot start");
        }
    }

    public void stopEngine(){
        if (engineOn){
            System.out.println("Engine turned off");
            engineOn = false;
        } else {
            System.out.println("Engine already off");
        }
    }

}
