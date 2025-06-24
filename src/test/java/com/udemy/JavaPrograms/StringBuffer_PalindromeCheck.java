package com.udemy.JavaPrograms;

public class StringBuffer_PalindromeCheck {

    public static void main(String[] args)
    {

        String original ="madam";

        StringBuffer sb = new StringBuffer(original);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed String: "+reversed);

        if(original.equals(reversed))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }


    }
}
