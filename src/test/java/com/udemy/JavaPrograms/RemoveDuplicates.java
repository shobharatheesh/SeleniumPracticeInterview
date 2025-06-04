package com.udemy.JavaPrograms;

public class RemoveDuplicates {

    //Very Simple Java Program to Remove Duplicate Characters:

    public static void main(String[] args)
    {

        String input ="hello";
        String output = "";

        for(int i =0 ; i<input.length();i++) {

            char c = input.charAt(i);
            System.out.println(c);

            // Check if character is already in output

            if (output.indexOf(c) == -1) {
                output = output + c;
            }

        }

     System.out.println("Original: "+input);
     System.out.println("Without duplicates : "+output);





    }
}
