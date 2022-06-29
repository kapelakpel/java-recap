package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.AccountNumberGeneratorException;

import java.util.Random;

public class BankAccountNumberGenerator {
    //private static Random rand;

//    public BankAccountNumberGenerator() {
//    }

    public static String generate() throws AccountNumberGeneratorException {
        Random rand = new Random();
        String number = "";
        String outputNumber = "";
        for (int i = 0; i < 4; i++) {
            int n = rand.nextInt(10);
            number += Integer.toString(n);
        }
        if (number.length() < 5) { //I want to have four digits account number.
            outputNumber = number;
        } else {
            throw new AccountNumberGeneratorException("Account number out of bound");
        }
        return outputNumber;
    }
}

// TODO: 09.06.2022
//Rozwiazac problem z generowaniem liczb losowych
//1. Napisac test jednostkowy do metody generate - DONE
//2. moge wykrozsytac petle for zakomentowana - DONE
