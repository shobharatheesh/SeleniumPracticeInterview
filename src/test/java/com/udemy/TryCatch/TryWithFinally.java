package com.udemy.TryCatch;

public class TryWithFinally {

    public static void main(String[] args)
    {
       try {
           int result = 10 / 0;
       }
       finally {

           System.out.println("Cleanup code here...."); // This will throw the exception after running finally block

       }


    }
}
