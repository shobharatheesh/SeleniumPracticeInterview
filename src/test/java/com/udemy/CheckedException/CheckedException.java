package com.udemy.CheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args)
    {

     try{

         FileReader file = new FileReader("D:\\practice\\SeleniumPracticeInterview\\SeleniumPracticeInterview\\src\\test\\java\\com\\udemy\\CheckedException\\data.txt");
         System.out.println("File Found : " + file);
     }
     catch(FileNotFoundException e)
     {
         System.out.println("File not Found Exception: "+e.getMessage());
     }


    }
}
