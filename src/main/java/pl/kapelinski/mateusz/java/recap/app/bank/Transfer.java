package pl.kapelinski.mateusz.java.recap.app.bank;

public class Transfer {

    public void transfer(Account from, Account to, double amount) throws AccountWithdrawException, AccountTopUpException {
        System.out.println("transfer()");
        from.withdraw(amount);
        to.topUp(amount);
    }
}
