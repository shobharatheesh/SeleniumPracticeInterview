package com.udemy.JavaPrograms;

public class VowelCountSimple {

    public static void main(String[] args)
    {

        String str = "Learning automation is easy";

        str = str.toLowerCase();

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j =0 ;j<str.length() ; j++)
        {
           char ch = str.charAt(j);

           if(ch =='a')
           {
               a++;
           }
           else if(ch =='e')
           {
               e++;
           }
           else if(ch =='i')
           {
               i++;
           }
           else if(ch =='o')
           {
               o++;
           }
           else if(ch == 'u')
           {
               u++;
           }
        }

        System.out.println("Count of 'a': " +a);
        System.out.println("Count of 'e': " +e);
        System.out.println("Count of 'i': " +i);
        System.out.println("Count of 'o:  " +o);
        System.out.println("Count of 'u': " +u);




    }
}
