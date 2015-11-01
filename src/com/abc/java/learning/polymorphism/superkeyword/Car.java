package com.abc.java.learning.polymorphism.superkeyword;

public class Car extends Vehicle {

	 public void move () {
	      super. move (); // invokes the super class method
	      System.out.println ("Car is a good medium of transport ");
	    }
}
