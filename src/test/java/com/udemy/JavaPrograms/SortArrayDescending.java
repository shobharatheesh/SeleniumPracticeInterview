package com.udemy.JavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {

    public static void main(String[] args)
    {
        Integer[] numbers = { 5,2,9,1,7};

        //sort in decending order

        Arrays.sort(numbers, Collections.reverseOrder());

        //print the sorted array

        System.out.println("Array in Decending order : "+Arrays.toString(numbers));
    }
}
