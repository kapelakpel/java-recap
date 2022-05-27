package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.AccountNumberGeneratorException;

import java.util.Random;

public class BankAccountNumberGenerator {
    //private static Random rand;


    public static String generate() throws AccountNumberGeneratorException {
        Random rand = new Random();
        int numberRandom = rand.nextInt(9999);
        String number = "";
//        for (int i = 0; i < 15; i++) {
//            int n = rand.nextInt(10);
//            number += Integer.toString(n);
//        }
        if (numberRandom >= 1000) { //I want to have four digits account number.
            number = String.valueOf(numberRandom);
        } else {
            throw new AccountNumberGeneratorException("Account number out of bound");
        }
        return number;
    }
}
