package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.AccountNumberGeneratorException;

import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private String idNumber;
    private Account account;

    public Client(String name, String surname, String idNumber) throws AccountNumberGeneratorException {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.account = new Account(BankAccountNumberGenerator.generate());
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(idNumber, client.idNumber) && Objects.equals(account, client.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, idNumber, account);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}

// TODO: 06.05.2022
//doczytac o hasCode i equals, kiedy obiekt moze nie byc taki sam
//hashCode wykorzystuje wartosc adresu obiektu w pamieci, mozemy miec dwa takie same obiekty a beda mialy rozne int (hashcode zwraca int, unikalna wartosc obiektu)
//hasCode okresla jakie atrybuty obiektu powinny zostac sprawdzone/porownane, a funkcja equals je welug tego "przepisu" sprawdza

