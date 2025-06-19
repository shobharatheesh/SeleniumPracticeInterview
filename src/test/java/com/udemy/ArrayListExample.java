package com.udemy;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");

        // Access element quickly by index
        System.out.println("First city: " + cities.get(0));
    }
}