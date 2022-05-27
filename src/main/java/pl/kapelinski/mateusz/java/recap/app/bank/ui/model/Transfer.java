package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.AccountTopUpException;
import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.AccountWithdrawException;

public class Transfer {

    public void transfer(Account from, Account to, double amount) throws AccountWithdrawException, AccountTopUpException {
        System.out.println("transfer()");
        from.withdraw(amount);
        to.topUp(amount);
    }
}
