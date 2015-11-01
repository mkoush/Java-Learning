package com.abc.java.learning.constructor.chain;

public class ChainingChild extends ChainingBase {

	public ChainingChild() {
		s2 = "Child class";
	}

	public void disp() {
		System.out.println("String 1 is: " + s1);
		System.out.println("String 2 is: " + s2);
	}

	public static void main(String args[]) {
		ChainingChild obj = new ChainingChild();
		obj.disp();
	}
}
