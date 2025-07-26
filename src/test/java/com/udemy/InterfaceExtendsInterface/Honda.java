package com.udemy.InterfaceExtendsInterface;

public class Honda implements Car
{

    public void start()
    {

        System.out.println("Car started");
    }

    public void drive()
    {
        System.out.println("car is driving");
    }

    public static void main(String[] args)
    {

        Honda h = new Honda();
        h.start();
        h.drive();


    }


}
