package pl.kapelinski.mateusz.java.recap.app.bank;

import java.util.Random;

public class BankAccountNumberGenerator {
    //private static Random rand;


    public static String generate() {
        Random rand = new Random();
//        String number = "";
//        for (int i = 0; i < 15; i++) {
//            int n = rand.nextInt(10);
//            number += Integer.toString(n);
//        }

        return String.valueOf(rand.nextInt(9999));
    }
}
