package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.*;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //private Address.AddressBuilder address;
    private List<Client> clients;


    public Bank() {
        this.clients = new ArrayList<>();
        //this.address = new Address.AddressBuilder("Ciechocinek", "87-720").street("Sw Brata Alberta").apartmentNumber("12");
    }

    public void withdraw(Account account, double amount) throws AccountWithdrawException {
        System.out.println("withdraw()");
        account.withdraw(amount);
    }

    public void topUp(Account account, double amount) throws AccountTopUpException {
        System.out.println("topUp(" + account + ")");
        for (Client client : clients) {
            if (client.getAccount() == account) {
                System.out.println("Account found");
                client.getAccount().topUp(amount);
            }
        }
    }

    public Client add(Client newClient) throws ClientException {
        System.out.println("add(" + newClient + ")");
        if (clients.contains(newClient)) {
           throw new ClientAddException("Already in system");
        } else {
            clients.add(newClient);
            return newClient;
        }
    }

    public boolean deleteClient(Client existingClient) throws ClientDeleteException {
        System.out.println("delete(" + existingClient + ")");
        boolean confirmation = false;
        if (clients.contains(existingClient)) {
            clients.remove(existingClient);
            return true;
        } else {
            throw new ClientDeleteException("Client does not exists");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clients=" + clients +
                '}';
    }
}



// TODO: 18.05.2022
// dla kazdego modelu dziedziny np. account stworzyc np. AccountRepository, AccountService, AccountController, a modele przeniesc

// TODO: 27.05.2022
// Dodać refaktoryzacje zmian nazw exception na zwiazane z bankiem