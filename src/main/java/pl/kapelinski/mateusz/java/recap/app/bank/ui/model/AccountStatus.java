package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

public enum AccountStatus {
    INACTIVE(1, "Nieaktywne"),
    ACTIVE(2, "Aktywne"),
    SUSPENDED(3, "Zawieszone"),
    DELETED(4, "Usuniete");

    private int statusNumber;
    private String statusCode;

    AccountStatus() {
    }

    AccountStatus(int statusNumber) {
        this.statusNumber = statusNumber;
    }

    AccountStatus(int statusNumber, String statusCode) {
        this.statusNumber = statusNumber;
        this.statusCode = statusCode;
    }

    public int getStatusNumber() {
        return statusNumber;
    }

    public String getStatusCode() {
        return statusCode;
    }
}

// TODO: 06.05.2022
//uzupelnic konstruktory dla pozostalych enumow - DONE
