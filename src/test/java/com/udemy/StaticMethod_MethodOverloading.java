package com.udemy;

public class StaticMethod_MethodOverloading {

    //static method 1

    public static int mutilply(int a , int b)
    {
        return a * b;
    }

    //overloaded static method 2

    public static double mutilply(double a , double b)
    {
        return a * b;
    }

    //overloaded static method 3

    public static int multiply(int a, int b, int c)
    {
        return a * b * c;
    }

    public static void main(String[] args)
    {

        System.out.println(StaticMethod_MethodOverloading.mutilply(5,2));
        System.out.println(StaticMethod_MethodOverloading.mutilply(2.5,4.0));
        System.out.println(StaticMethod_MethodOverloading.multiply(2,3,4));

    }
}
