package com.udemy.JavaPrograms;

public class StringBuilder_RemoveDuplicates {

    public static void main(String[] args)
    {
        String input ="Programming";

        StringBuilder result = new StringBuilder();
        //result.reverse();
        // System.out.println(result);
        //System.out.println(input.length());

        for(int i=0 ;i<input.length();i++)
        {
            char ch = input.charAt(i);

            if(result.indexOf(String.valueOf(ch)) == -1)
            {
                result.append(ch);
            }


        }

        System.out.println("After removing duplicates: " +result.toString());

    }
}
