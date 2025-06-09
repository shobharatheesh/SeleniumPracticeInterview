package com.udemy.Polymorphism.MethodOverloading;

public class Calculator {

    //method with two int parameters

    public int add(int a ,int b)
    {
        return a+b;
    }

    //method with three int paarameters

    public int add(int a, int b, int c)
    {

       return a+b+c;
    }

   // method with two double parameters

    public double add(double a, double b)
    {
        return a+b;
    }
}
