package com.ehoteam.java_bank_application;

public abstract class Account implements IRate {
    // list common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;

    // constructor to set base properties and initialise the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit + 100;

        // set account number
        index++;
        this.accountNumber = setAccountNumber ();

        setRate ();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring (sSN.length ()-2, sSN.length ());
        int uniqueID = index;
        int randomNumber = (int) (Math.random () * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // list common methods - transactions
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println ("Deposing $" + amount);
        printBalance ();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println ("Withdrawing $" + amount);
        printBalance ();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println ("Transferring $" + amount + " to " + toWhere);
        printBalance ();
    }

    public void printBalance() {
        System.out.println ("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println (
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%"
        );
    }

    //

}
