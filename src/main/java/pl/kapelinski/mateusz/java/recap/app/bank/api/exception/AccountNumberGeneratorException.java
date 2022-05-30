package pl.kapelinski.mateusz.java.recap.app.bank.api.exception;

public class AccountNumberGeneratorException extends BankException {

    public AccountNumberGeneratorException(String message) {
        super(message);
    }

    public AccountNumberGeneratorException(String message, Throwable cause) {
        super(message, cause);
    }
}
