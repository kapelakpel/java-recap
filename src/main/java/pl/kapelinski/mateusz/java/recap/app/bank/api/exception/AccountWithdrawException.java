package pl.kapelinski.mateusz.java.recap.app.bank.api.exception;

public class AccountWithdrawException extends BankException {

    public AccountWithdrawException(String message) {
        super(message);
    }

    public AccountWithdrawException(String message, Throwable cause) {
        super(message, cause);
    }
}
