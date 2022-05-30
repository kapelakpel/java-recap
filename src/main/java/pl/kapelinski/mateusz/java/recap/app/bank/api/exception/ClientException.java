package pl.kapelinski.mateusz.java.recap.app.bank.api.exception;

public class ClientException extends BankException{

    public ClientException(String message) {
        super(message);
    }

    public ClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
