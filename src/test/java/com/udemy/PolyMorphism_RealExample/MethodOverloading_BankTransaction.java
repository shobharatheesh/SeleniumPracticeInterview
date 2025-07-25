package com.udemy.PolyMorphism_RealExample;

public class MethodOverloading_BankTransaction {

    //deposit Cash

    public void deposit(double amount)
    {
        System.out.println("Deposited cash: Rs" +amount);
    }

    //deposit with cash and account number

    public void deposit(double amount , String accountNumber)
    {
        System.out.println("Deposited rs " + amount + " to Account: " +accountNumber);
    }

    public void deposit(String chequeNumber , double amount)
    {
        System.out.println("Deposited rs "+ amount + " via cheque: " + chequeNumber);
    }

    public static void main(String[] args)
    {
        MethodOverloading_BankTransaction bt = new MethodOverloading_BankTransaction();

        bt.deposit(5000);
        bt.deposit(10000, "ACEIONG");
        bt.deposit("SDEGTHYJUK",30000);
    }
}
