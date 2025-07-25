package com.udemy.PolyMorphism_RealExample;

public class MethodOverriring_BankAccounts {

    public void calculateInterest() {
        System.out.println("Calculating interest for generic account number");
    }
}

class SavingsAccount extends MethodOverriring_BankAccounts
{
    @Override
    public void calculateInterest() {

        System.out.println("calculating interest for savings Account : 4% per annum");
    }
}

class CurrentAccount extends MethodOverriring_BankAccounts{
    @Override
    public void calculateInterest()
    {
        System.out.println("No ineterest for current Account");
    }
}


