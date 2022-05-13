package pl.kapelinski.mateusz.java.recap.app.bank;

import java.math.BigDecimal;
import java.util.Objects;


public class Account {
    private String number;
    private BigDecimal balance;
    private int state;
    private AccountStatus accountStatus;
    //private BankAccountNumberGenerator bankAccountNumberGenerator;

    public Account() {
        //this.number = generateNumber();
        this.balance = new BigDecimal("0");
    }

    public Account(String generatedNumber) {
        this.number = generatedNumber;
        this.balance = new BigDecimal("0");
    }

    public BigDecimal withdraw(double amount) {
        System.out.println("withdraw(" + amount + ")");
        //BigDecimal outputValue = BigDecimal.ZERO;
        BigDecimal outputValue = balance.subtract(BigDecimal.valueOf(amount));
        this.balance = outputValue;
        return outputValue;
    }

    public BigDecimal topUp(double amount) {
        BigDecimal outputValue = new BigDecimal("0");
        outputValue = balance.add(BigDecimal.valueOf(amount));
        this.balance = outputValue;
        return outputValue;
    }

    public void printStatus(){
//        switch(AccountStatus.ACTIVE.getStatusNumber()){
//            case 1:
//                System.out.println("Twoje konto jest NIEAKTYWNE");
//            case 2:
//                System.out.println("Twoje konto jest AKTWYNE");
//            case 3:
//                System.out.println("Twoje konto jest ZAWIESZONE");
//            case 4:
//                System.out.println("Twoje konto jest USUNIETE");
//        }
        switch (this.accountStatus) {
            case ACTIVE:{
                System.out.println("Twoje konto jest aktywne");
                break;
            }
            default:{
                System.out.println("Nieznany status konta");
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return state == account.state && Objects.equals(number, account.number) && Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance, state);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

//    public String generate() {
//        rand = new Random();
//        String number = "";
//        for (int i = 0; i < 15; i++) {
//            int n = rand.nextInt(10);
//            number += Integer.toString(n);
//        }
//        return number;
//    }

}

// TODO: 06.05.2022
//Stworzyc metode, ktora ladnie wydrukuje status konta bedacego enum, do wydrukowania statusu uzyc switch/case w polaczeniu z enum - DONE

// TODO: 11.05.2022
//Kazda metoda publiczna powinna rzucac wyjatek.
//Stworzyc wlasne wyajtki biznesowe np. AccountWithdrawException
