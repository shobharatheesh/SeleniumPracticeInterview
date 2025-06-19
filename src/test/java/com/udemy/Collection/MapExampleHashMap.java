package com.udemy.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExampleHashMap {

    public static void main(String[] args)
    {
        Map<String,Integer> marks = new HashMap<>();

        marks.put("Math",90);
        marks.put("Science",85);
        marks.put("Math",95); //overwrites previous value

       System.out.println("Map: "+marks);

    }
}
