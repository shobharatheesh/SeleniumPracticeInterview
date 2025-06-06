package com.udemy.JavaPrograms;

import java.util.Arrays;

public class SortPrimitiveDescending {

    public static void main(String[] args)
    {
       int[] numbers = {5 ,2,9, 1, 7};

       //sort in ascending order first

        Arrays.sort(numbers);

        System.out.println("Sorted arrays ascending : " +Arrays.toString(numbers));

        //reverse the array manually

        System.out.println("Sorted array in decending order: ");

        for(int i = numbers.length-1; i>=0; i--) {
            System.out.println(numbers[i] + " ");
        }

    }
}
