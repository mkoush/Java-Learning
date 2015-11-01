package com.abc.java.learning.constructor;

public class Assessment {

	private int var;
    public Assessment()
    {
           //code for default one
           var = 10;
    }
    public Assessment(int num)
    {
           //code for parameterized one
           var = num;
    }
    public int getValue()
    {
            return var;
    }
    public static void main(String args[])
    {
            Assessment obj2 = new Assessment();
            System.out.println("var is: "+obj2.getValue());
            
            Assessment obj3 = new Assessment(5);
            System.out.println("var is: "+ obj3.getValue());
    }
}
