package pl.kapelinski.mateusz.java.recap.app.bank.api.exception;

public class ClientDeleteException extends BankException {

    public ClientDeleteException(String message) {
        super(message);
    }

    public ClientDeleteException(String message, Throwable couse) {
        super(message, couse);
    }
}
