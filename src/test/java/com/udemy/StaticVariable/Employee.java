package com.udemy.StaticVariable;

public class Employee {

    int id;

    String name;

    static String company =" Infosys";

    Employee(int id , String name)
    {
        this.id = id;
        this.name = name;

    }

    void display()
    {
        System.out.println(id + " " + name + " " + company);

    }

}
