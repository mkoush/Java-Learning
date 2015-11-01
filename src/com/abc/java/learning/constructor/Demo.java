package com.abc.java.learning.constructor;

public class Demo {

	public Demo()
    {
        System.out.println("This is a default constructor");
    }
	
	public Demo(int num, String str)
    {
         System.out.println("This is a parameterized constructor. Args: " + num + ", " + str);
    }
	
	public void demoMethod()
    {
            System.out.println("hello");
    }
	
    public static void main(String args[])
    {
            Demo obj = new Demo();
            obj.demoMethod();
            
            Demo objParams = new Demo(5, "param");
            objParams.demoMethod();
    }
}
