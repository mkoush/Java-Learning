package com.abc.java.learning.constructor.defaultcon;

public class NoteBook {

	/*This is my default constructor. A constructor does
	    * not have a return type and it's name
	    * should exactly same as class name
	    */
	
	   public void mymethod()
	   {
	      System.out.println("Void method of the class");
	   }
	   
	   public int multiply(int a, int b) {
		   
		   return a* b;
		   
	   }
	   
	   public static void main(String args[]){
		/* Creating object of class using default constructor
	         * (new NoteBook()) so default constructor would be 
	         * invoked 
	         */
		NoteBook myfirstObject = new NoteBook();
		myfirstObject.mymethod();
		
		NoteBook obj2 = new NoteBook();
		int result = obj2.multiply(3, 6);
		System.out.println("result: " + result);
	   }
}
