package com.udemy.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetExampleHashSet {

    public static void main(String[] args)
    {

      Set<String> fruits = new HashSet<>();

      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Mango");
      fruits.add("Apple");  //Duplicates not allowed

      System.out.println("Set: "+fruits);

    }
}
