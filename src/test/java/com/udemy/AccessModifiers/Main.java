package com.udemy.AccessModifiers;

public class Main {

    public static void main(String[] arg)
    {

        AccessExample obj = new AccessExample();

        //obj.privateNumber; not accessible
       // obj.showPrivate(); not accessible

        System.out.println("Default: "+ obj.defaultNumber);
        obj.showDefault();

        System.out.println("Protected: "+obj.protectedNumber);
        obj.showProtected();

        System.out.println("Public: "+obj.publicNumber);
        obj.showPublic();

        //show all from inside the class

        obj.showAll();



    }
}
