package com.udemy.Polymorphism.MethodOverloading;

public class Test {

    public static void main(String[] args)
    {

        Calculator calc = new Calculator();

        int a =calc.add(5,10);
        int b = calc.add(5,10,15);
        double c=calc.add(5.5, 10.5);

      System.out.println(a);
      System.out.println(b);
      System.out.println(c);

    }
}
