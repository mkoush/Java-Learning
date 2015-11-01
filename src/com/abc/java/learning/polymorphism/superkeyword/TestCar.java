package com.abc.java.learning.polymorphism.superkeyword;

public class TestCar {

	public static void main (String args []){
        Vehicle b = new Car (); // Vehicle reference but Car object
        b.move (); //Calls the method in Car class
    }
}
