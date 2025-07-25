package com.udemy.AccessModifiers;

public class AccessExample {

    private int privateNumber = 10; //accessible inside this class
    int defaultNumber = 20;         //accessible inside same package
    protected int protectedNumber =30; //accesible inside the same package and subclass
    public int publicNumber = 40; //accessible anywhere

    private void showPrivate()
    {
        System.out.println("Private Number: " +privateNumber);
    }

    void showDefault()
    {
        System.out.println("Default Number: "+defaultNumber);
    }

    protected void showProtected()
    {
        System.out.println("Protected Number: "+ protectedNumber);
    }

    public void showPublic()
    {
        System.out.println("Public Number: "+publicNumber);
    }

    public void showAll()
    {
        showPrivate();
        showDefault();
        showProtected();
        showPublic();
    }

}
