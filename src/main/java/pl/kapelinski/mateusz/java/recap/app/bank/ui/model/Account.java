package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.AccountTopUpException;
import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.AccountWithdrawException;

import java.math.BigDecimal;
import java.util.Objects;


public class   Account {
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

    public BigDecimal withdraw(double amount) throws AccountWithdrawException {
        System.out.println("withdraw(" + amount + ")");
        //BigDecimal outputValue = BigDecimal.ZERO;
        if (amount > 0) {
//            if ((balance.subtract(BigDecimal.valueOf(amount))).intValue() >= 0) {
            if ((balance.subtract(BigDecimal.valueOf(amount))).compareTo(BigDecimal.ZERO)>=0) {
                BigDecimal outputValue = balance.subtract(BigDecimal.valueOf(amount));
                this.balance = outputValue;
                return outputValue;
            } else {
                throw new AccountWithdrawException("Insufficient funds");
            }
        } else {
            throw new AccountWithdrawException("Cannot withdraw negative amount");
        }
    }

    public BigDecimal topUp(double amount) throws AccountTopUpException {
        System.out.println("topUp(" + amount + ")");
        if (amount > 0) {
            BigDecimal outputValue = new BigDecimal("0");
            outputValue = balance.add(BigDecimal.valueOf(amount));
            this.balance = outputValue;
            return outputValue;
        } else {
            throw new AccountTopUpException("Negative topup amount");
        }

    }

    public void printStatus() {
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
            case ACTIVE: {
                System.out.println("Twoje konto jest aktywne");
                break;
            }
            case INACTIVE: {
                System.out.println("Twoje konto jest nieaktywne");
                break;
            }
            case DELETED: {
                System.out.println("Twoje konto jest usuniete");
                break;
            }
            case SUSPENDED: {
                System.out.println("Twoje konto jest zawieszone");
                break;
            }
            default: {
                System.out.println("Nieznany status konta");
                break;
            }
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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
}

// TODO: 06.05.2022
//Stworzyc metode, ktora ladnie wydrukuje status konta bedacego enum, do wydrukowania statusu uzyc switch/case w polaczeniu z enum - DONE

// TODO: 11.05.2022
//Kazda metoda publiczna powinna rzucac wyjatek.
//Stworzyc wlasne wyajtki biznesowe np. AccountWithdrawException

