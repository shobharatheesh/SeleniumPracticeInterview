package com.udemy.JavaPrograms;

public class StringBuilder_ReverseString {

    public static void main(String[] args)
    {

        String input = "Automation";

        StringBuilder sb = new StringBuilder(input); //creates a new object and modifies the same

        String reversed = sb.reverse().toString();

        System.out.println("Reversed: "+reversed);




    }
}
