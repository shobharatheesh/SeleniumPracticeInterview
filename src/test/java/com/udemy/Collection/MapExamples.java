package com.udemy.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args)
    {
        Map<String,Integer> studentScores = new HashMap<>();

        studentScores.put("Alice", 80);
        studentScores.put("Alice", 90);
        studentScores.put("Alice", 100); //overwrites previous value

       System.out.println("Map: "+studentScores);

    }
}
