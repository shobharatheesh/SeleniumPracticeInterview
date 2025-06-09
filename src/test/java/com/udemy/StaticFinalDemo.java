package com.udemy;

public class StaticFinalDemo {

    static int count =0;   //static variable

    final int MAX_VALUE = 100;

    static void displayCount()//static method
    {

        System.out.println("Count is: "+count);

    }

    void incrementCount()
    {
        count++;
    }

    public static void main(String[] args)
    {

        StaticFinalDemo  obj1 = new StaticFinalDemo();
        StaticFinalDemo  obj2 = new StaticFinalDemo();
        StaticFinalDemo  obj3 = new StaticFinalDemo();

        obj1.incrementCount();
        obj2.incrementCount();
        obj3.incrementCount();

        StaticFinalDemo.displayCount();

        System.out.println("MAX Value is : "+obj1.MAX_VALUE);


    }
}
