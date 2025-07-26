package com.udemy.Method_Hiding;

public class TestStatic {

    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        obj1.show();
        obj2.show();

    }
}
