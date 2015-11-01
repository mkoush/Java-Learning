package com.abc.java.learning.control;

public class WhileloopDemo {

	public static void main(String args[]) {
		int i = 10;
		while (i > 1) {
			System.out.println(i);
			i--;
		}

		// iterate array
		int arr[] = { 2, 11, 45, 9 };
		// i starts with 0 as array index starts with 0 too
		i = 0;
		while (i < 4) {
			System.out.println(arr[i]);
			i++;
		}

		// Infinite While

		i = 10;
		while (i > 1) {
			System.out.println(i);
			i++;
		}

		// Another Infinite

		while (true) {
			// statement(s);
		}
	}
}