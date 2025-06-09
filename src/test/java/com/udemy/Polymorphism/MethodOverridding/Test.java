package com.udemy.Polymorphism.MethodOverridding;

public class Test {

    public static void main(String[] args)
    {

       Animal myAnimal = new Animal();
       Animal mydog = new Dog();
       Animal mycat = new Cat();

       //calling method in parent and child class

        myAnimal.sound();
        mydog.sound();
        mycat.sound();






    }
}
