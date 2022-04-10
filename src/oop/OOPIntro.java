package oop;

public class OOPIntro {
    //OOP - proogramming paradig. a way of viewing things
    // A class is a blueprint for describing an object
    //Car -> attributes: color, model, numOfTires, numOfSeats. Behaviour: startEngine, stopEngine, turnRight, turnLeft.
    //fields  -> used to define attributes in a Class
    // another name for the fields is global variable
    //Encapsulation - hiding data and methods from the outside world (nerāda ārpus klases). This allows to control what data is given out and received
    public static void main(String[] args) { //Static lieto tāpēc, ka daudzas instances objekti laikam?
        Car benz = new Car(); //crated new instance of existing class
        benz.startEngine(false);
        benz.stopEngine();

        System.out.println();

        Car bmw = new Car(); //another instance
        bmw.startEngine(true);
        bmw.stopEngine();

        Calculator calc = new Calculator();
        System.out.println(Calculator.add(3,4));
        System.out.println(calc.divide(3,9));

        System.out.println(person.getName());


    }
}
