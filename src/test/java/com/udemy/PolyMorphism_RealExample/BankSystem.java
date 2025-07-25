package com.udemy.PolyMorphism_RealExample;

public class BankSystem {

    public static void main(String[] args) {

        MethodOverriring_BankAccounts ba = new MethodOverriring_BankAccounts();

        ba.calculateInterest(); //generic interest

        MethodOverriring_BankAccounts bc = new MethodOverriring_BankAccounts();

        bc.calculateInterest(); //overrriden in savings account

        MethodOverriring_BankAccounts ca = new MethodOverriring_BankAccounts();

        ca.calculateInterest(); //overriden in current account




    }
}
