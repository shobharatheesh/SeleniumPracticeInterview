package com.udemy.Bank;

public class BankAccount {

    public String accountHolder = "John Doe"; //accessible everywhere

    private double balance = 10000.50; //accessible only within this class

    protected String bankBranch = "Mumbai"; //accessible in the same package

    String accountType = "Savings"; //default

    public void displayPublic()
    {
        System.out.println("Account Holder: " +accountHolder);
    }

    public void displayPrivate()
    {
        System.out.println("Balance: "+balance);
    }

    public void displayProtected()
    {
        System.out.println("Branch: "+bankBranch);
    }

    public void displayDefault()
    {
        System.out.println("Account Type: "+accountType);
    }

    public void showAllDetails()
    {
        displayPublic();
        displayPrivate();
        displayProtected();
        displayDefault();
    }
}
