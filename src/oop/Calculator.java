package oop;

public class Calculator {
    // instance variable is a variable whose values are attached to particular instance object
    // instance methid is a method that is attached to a particular instance of an object
    public static int add (int smallNumber, int bigNumber){
        return smallNumber + bigNumber;
    }

    public static int subtract (int smallNumber, int bigNumber){
        return bigNumber - smallNumber;
    }

    public static int multiply (int smallNumber, int bigNumber){
        return bigNumber * smallNumber;
    }

    public float divide (float smallNumber, float bigNumber){
        return bigNumber / smallNumber;
    }


}
