package com.udemy;

public class StringBufferExample {

    public static void main(String[] args)
    {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); //Modifies the same object


    }
}
