package com.udemy.JavaPrograms;

public class ReverseEachWord {

    public static void main(String[] args)
    {
        String input = "Automation is fun";
        String words[] = input.split(" ");
        String result ="";

        for(String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);

            }

            result += rev + " ";

        }
        System.out.println("Reversed Words : "+result.trim());

        }


    }

