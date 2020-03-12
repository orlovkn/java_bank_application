package com.ehoteam.java_bank_application;

import java.beans.Customizer;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String file = "D:\\java_bank_application\\src\\data\\original.csv";


        /*
        Checking chk1 = new Checking ("Max Check", "123456789", 3454);
        Savings save1 = new Savings ("Igor Johnson", "123432567", 5000);

        chk1.showInfo ();
        System.out.println ("*************");
        save1.showInfo ();
*/
        // read a CSV file and create new accounts based  on that data
        List<String[]> newAccountHolders = util.cav.read (file);

        for (String[] accountHolder : newAccountHolders) {
            System.out.println ("\nNEW ACCOUNT");
            System.out.println (accountHolder[0]);
            System.out.println (accountHolder[1]);
            System.out.println (accountHolder[2]);
            System.out.println (accountHolder[3]);
        }
    }
}
