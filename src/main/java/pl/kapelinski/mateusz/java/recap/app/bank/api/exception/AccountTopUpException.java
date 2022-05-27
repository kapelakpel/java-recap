package pl.kapelinski.mateusz.java.recap.app.bank.api.exception;

public class AccountTopUpException extends BankException {
    public AccountTopUpException(String message) {
        super(message);
    }

    public AccountTopUpException(String message, Throwable cause) {
        super(message, cause);
    }
}
