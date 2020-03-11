package com.ehoteam.java_bank_application;

public class Main {

    public static void main(String[] args) {

        Checking chk1 = new Checking ("Max Check", "123456789", 3454);

        Savings save1 = new Savings ("Igor Johnson", "123432567", 5434);

        chk1.showInfo ();
        System.out.println ("*************");
        save1.showInfo ();

        save1.deposit (4000);
        save1.withdraw (400);
        save1.transfer ("Cach", 300);

        // read a CSV file and create new accounts based  on that data


    }
}
