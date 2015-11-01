package com.abc.java.learning.constructor.privatecon;

public class SingletonClass {

	// Static Class Reference
	private static SingletonClass obj = null;

	private SingletonClass() {
		/*
		 * Private Constructor will prevent the instantiation of this class
		 * directly
		 */
	}

	public static SingletonClass objectCreationMethod() {
		/*
		 * This logic will ensure that no more than one object can be created at
		 * a time
		 */
		if (obj == null) {
			obj = new SingletonClass();
		}
		return obj;
	}

	public void display() {
		System.out.println("Singleton class Example");
	}

	public static void main(String args[]) {
		// Object cannot be created directly due to private constructor
		// This way it is forced to create object via our method where
		// we have logic for only one object creation
		SingletonClass myobject = SingletonClass.objectCreationMethod();
		myobject.display();
	}
}
