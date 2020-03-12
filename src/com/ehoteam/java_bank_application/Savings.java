package com.ehoteam.java_bank_application;

public class Savings extends Account {
    // list properties specific savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // constructor to initialise settings for the savings properties

    public Savings(String name, String sSN, double initDeposit) {
        super (name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate () - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random () * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random () * Math.pow(10, 4));
    }

    // list any methods specific to savings account
    public void showInfo(){
        super.showInfo ();
        System.out.println (
                " Your Savings account features:" +
                "\n Safety Deposit Box ID: "+safetyDepositBoxID +
                "\n Safety Deposit Box Key: "+safetyDepositBoxKey
        );
    }
}
