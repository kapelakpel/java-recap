package pl.kapelinski.mateusz.java.recap.app.bank;

public class AccountWithdrawException extends Exception {

    public AccountWithdrawException(String message) {
        super(message);
    }

    public AccountWithdrawException(String message, Throwable cause) {
        super(message, cause);
    }
}
