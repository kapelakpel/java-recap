package pl.kapelinski.mateusz.java.recap.app.bank;

public class AccountTopUpException extends Exception {
    public AccountTopUpException(String message) {
        super(message);
    }

    public AccountTopUpException(String message, Throwable cause) {
        super(message, cause);
    }
}
