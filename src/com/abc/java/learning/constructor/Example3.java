package com.abc.java.learning.constructor;

public class Example3 {

	private int var;

	public Example3(int num) {
		var = num;
	}

	public int getValue() {
		String value = "variable";
		return var;
	}

	public static void main(String args[]) {
		
		int b = 6;
		Example3 myobj = new Example3(5);
		System.out.println("value of var is: " + myobj.getValue());
	}
}
