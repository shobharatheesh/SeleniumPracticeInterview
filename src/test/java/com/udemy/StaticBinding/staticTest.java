package com.udemy.StaticBinding;

public class staticTest {

    static void display()
    {
        System.out.println("Static Binding -Display Method");
    }

    public static void main(String args[])
    {

        staticTest.display(); // resolved at complile time ex: Method overloading

    }
}
