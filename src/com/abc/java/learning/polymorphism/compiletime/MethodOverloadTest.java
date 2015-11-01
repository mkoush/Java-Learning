package com.abc.java.learning.polymorphism.compiletime;


public class MethodOverloadTest {

	public static void main (String args [])
    {
		MethodOverloading Obj = new MethodOverloading();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    }
}
