package com.abc.java.learning.control;

public class DoWhileLoopDemo {

	public static void main(String args[]) {
		int i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i > 1);

		// Iterate array
		int arr[] = { 2, 11, 45, 9 };
		// i starts with 0 as array index starts with 0 too
		int j = 0;
		do {
			System.out.println(arr[j]);
			j++;
		} while (j < 4);

	}
}
