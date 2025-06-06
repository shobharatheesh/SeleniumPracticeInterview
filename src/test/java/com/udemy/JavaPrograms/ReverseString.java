package com.udemy.JavaPrograms;

public class ReverseString {

    public static void main(String[] args)
    {

        String input = "Hello";

        String reversed= "";

     //Iterating the string in reverse order

    for(int i = input.length()-1 ; i>=0;i--)
    {
        reversed += input.charAt(i);
    }

    System.out.println("Reversed String :"+reversed);

    }
}
