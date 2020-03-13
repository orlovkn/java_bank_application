package com.ehoteam.java_bank_application;

import java.beans.Customizer;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Account> accounts = new LinkedList<Account> ();

        // read a CSV file and create new accounts based  on that data
        String file = "D:\\java_bank_application\\src\\data\\original.csv";
        List<String[]> newAccountHolders = util.cav.read (file);

        for (String[] accountHolder : newAccountHolders) {
            System.out.println ("\nNEW ACCOUNT");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble (accountHolder[3]);

            System.out.println (name + " " + sSN + " " + accountType + " $" + initDeposit);
            if (accountType.equals ("Savings")) {
                accounts.add (new Savings(name, sSN, initDeposit));
            } else if (accountType.equals ("Checking")) {
                accounts.add(new Checking (name, sSN, initDeposit));
            } else {
                System.out.println ("ERROR READING ACCOUNT TYPE");
            }
        }

//        accounts.get(5).showInfo ();
        for (Account acc : accounts) {
            System.out.println ("\n*********************");
            acc.showInfo ();
        }
    }




        /*
        Checking chk1 = new Checking ("Max Check", "123456789", 3454);
        Savings save1 = new Savings ("Igor Johnson", "123432567", 5000);

        chk1.showInfo ();
        System.out.println ("*************");
        save1.showInfo ();
*/
}
