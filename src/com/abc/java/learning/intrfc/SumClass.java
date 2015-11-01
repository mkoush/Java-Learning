package com.abc.java.learning.intrfc;

public class SumClass implements SumInterface {

	public int mymethod(int num1, int num2) {
		int op = num1 + num2;
		return op;
	}

	/**
	 * Multiply nos
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiply(int a, int b) {
		
		return a*b;
	}
	
	public static void main(String args[]) {
		//Creating object of SumClass
		SumClass obj = new SumClass();
		System.out.println(obj.mymethod(2, 3));
	}
}
