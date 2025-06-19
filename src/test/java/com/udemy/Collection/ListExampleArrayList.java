package com.udemy.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExampleArrayList {

    public static void main(String[] args)
    {

      List<String> cities = new ArrayList<>();

      cities.add("Delhi");
      cities.add("Mumbai");
      cities.add("Chennai");
      cities.add("Delhi");  //Duplicates allowed

     System.out.println("List: "+cities);






    }
}
