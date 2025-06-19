package com.udemy.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args)
    {
        Map<String,String> marks = new HashMap<>();

        marks.put("Karnataka", "Bangalore");
        marks.put("Karnataka", "Mangalore");
        marks.put("Karnataka", "Mysore"); //overwrites previous value

       System.out.println("Map: "+marks);

    }
}
