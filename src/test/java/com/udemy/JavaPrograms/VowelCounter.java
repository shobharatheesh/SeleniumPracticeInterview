package com.udemy.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class VowelCounter {

    public static void main(String[] args)
    {

       String str = "Learning automation is easy";

       // Convert to Lowercase to handle both cases

        str = str.toLowerCase();

        //Map to store vowel counts

        Map<Character , Integer> vowelMap = new HashMap<>();

        vowelMap.put('a',0);
        vowelMap.put('e',0);
        vowelMap.put('i',0);
        vowelMap.put('o',0);
        vowelMap.put('u',0);

        //iterate through the string

        for(int i =0 ; i< str.length();i++) {
            char ch = str.charAt(i);
            //check if character is a vowel

            if (vowelMap.containsKey(ch)) {
                vowelMap.put(ch, vowelMap.get(ch) + 1);
            }
        }

        //print the vowel counts
        for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
            System.out.println("Vowel '" + entry.getKey() + "' → " + entry.getValue());
        }

    }
}
