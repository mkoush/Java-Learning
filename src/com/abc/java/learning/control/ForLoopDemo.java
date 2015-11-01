package com.abc.java.learning.control;

public class ForLoopDemo {

	public static void main(String args[]) {
		
		for (int i = 10; i > 1; i--) {
			System.out.println("The value of i is: " + i);
		}
		
		int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
        for(int i=0; i<4; i++){
             System.out.println(arr[i]);
        }
        
		for(int i=1; i>1; i++){
            System.out.println("The value of i is: "+i);
       }
		
		for ( ; ; ) {
		    // statement(s)
		}
		
	}
}
