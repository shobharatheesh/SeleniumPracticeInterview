package com.udemy.TryCatch;

public class NoCatchOrFinally {

    public static void main(String[] args)
    {
        try {
            int result = 10 / 0;
        }
        finally
        {
            System.out.println("Code runs");
        }
    }
}
