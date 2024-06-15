package com.technology;
/*
* 01. Create an abstract class with abstract and non-abstract methods.
* 02. Create a subclass for an abstract class. Create an object in the child class for the
* abstract class and access the non-abstract methods
* 03. Create an instance for the child class in child class and call abstract methods
* 04. Create an instance for the child class in child class and call non-abstract methods
*/


public abstract class Airport {
    // Abstract method which must be implemented by subclasses
    abstract void takeoff();

    // Concrete method that can be used by subclasses
    public void onBoard() {
        System.out.println("Flying to onBoarding");
    }
}

class Airasia extends Airport {

    @Override
    public void takeoff() {
        // Implementation of the abstract method
        System.out.println("Flight is ready to start to takeoff");
    }

    public static void main(String[] args) {
        // Creating an instance of Airasia and referring it as Airport type
        Airport a = new Airasia();
        a.takeoff();  // Calling the implemented takeoff method
        a.onBoard();  // Calling the inherited onBoard method
    }
}
