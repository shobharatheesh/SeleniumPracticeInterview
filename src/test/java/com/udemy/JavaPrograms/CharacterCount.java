package com.udemy.JavaPrograms;

public class CharacterCount {

    public static void main(String[] args) {
        String str = "automation";

        char target = 'a';
        int count = 0;

        System.out.println("Length of the string: " +str.length());

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Character '" + target + "' occurred: " + count + " times");
    }
}
