package com.udemy.JavaPrograms;

public class SimpleCharCount {

    //Simple Java Code to Count Characters

    public static void main(String[] args) {
        String input = "hello";

        int[] count = new int[256]; // ASCII size

        // Count each character
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            count[c]++;
        }

        // Print only characters that appeared
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " => " + count[i]);
            }
        }
    }
}

