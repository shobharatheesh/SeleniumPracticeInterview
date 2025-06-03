package com.udemy.AbstractClass;

abstract class Animal {

    abstract void makeSound();  //abstract methods without body

    void eat()
    {
        System.out.println("This animal eats food");  //concrete method
    }

}
