package com.udemy.JavaPrograms;

import java.util.Arrays;

public class SortIntegerArrayAscending {

    public static void main(String[] args)
    {

        int[] numbers = {5,2,9,1,7};

        //sort array in ascending order

        Arrays.sort(numbers);

        System.out.println("Arrays in Ascending order : " +Arrays.toString(numbers));



    }
}
