package com.udemy.RunTimePolymorphism;

public class TestPolymorphism {

    public static void main(String[] args)
    {

        Animal a = new Dog();
        Animal b = new Cat();

        a.sound();
        b.sound();

    }
}
