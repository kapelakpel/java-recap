package pl.kapelinski.mateusz.java.recap.app.bank;

public class AccountNumberGeneratorException extends Exception {

    public AccountNumberGeneratorException(String message) {
        super(message);
    }

    public AccountNumberGeneratorException(String message, Throwable cause) {
        super(message, cause);
    }
}
