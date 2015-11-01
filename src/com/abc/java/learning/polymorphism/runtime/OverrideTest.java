package com.abc.java.learning.polymorphism.runtime;

public class OverrideTest {

	public static void main (String args []) {
        // BaseClass reference and object
        MethodOverridingBase obj1 = new MethodOverridingBase(); 
        // BaseClass reference but DerivedClass object
        MethodOverridingSub obj2 = new MethodOverridingSub(); 
        // Calls the method from BaseClass class
        obj1.methodToOverride(); 
        //Calls the method from DerivedClass class
        obj2.methodToOverride(); 
     }
}
