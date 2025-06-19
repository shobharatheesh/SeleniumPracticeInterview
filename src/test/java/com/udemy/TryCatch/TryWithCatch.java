package com.udemy.TryCatch;

public class TryWithCatch {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");

        }
    }
}
