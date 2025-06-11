package com.udemy.UncheckedException;

import org.testng.annotations.Test;

public class UncheckedExceptionTest {

    @Test
    public void divideNumbersTest() {

        int numerator = 100;
        int denominator = 0;

        try {
            int result = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero :" + e.getMessage());
        }
    }


    }




