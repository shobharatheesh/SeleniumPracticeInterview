package com.udemy.Polymorphism.MethodOverridding;

public class Cat extends Animal{

    @Override

    public void sound()
    {
        System.out.println("Cat does meow");
    }
}
