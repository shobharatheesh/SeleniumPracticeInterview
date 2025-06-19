package com.udemy.RunTimePolymorphism;

public class TestPoly {
    public static void main(String[] args)
    {
        Animal a ;    // reference of parent


        a = new Dog();  // child object
        a.sound();

        a = new Cat();   // another child object
        a.sound();


    }
}
