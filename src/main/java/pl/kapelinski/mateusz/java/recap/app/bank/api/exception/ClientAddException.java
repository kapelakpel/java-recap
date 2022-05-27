package pl.kapelinski.mateusz.java.recap.app.bank.api.exception;

public class ClientAddException extends ClientException {

    public ClientAddException(String message) {
        super(message);
    }

    public ClientAddException(String message, Throwable couse) {
        super(message, couse);
    }
}
