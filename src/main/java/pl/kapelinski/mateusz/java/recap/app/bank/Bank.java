package pl.kapelinski.mateusz.java.recap.app.bank;

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

    public Client add(Client newClient) throws ClientAddException{
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

// TODO: 06.05.2022
//Dodac generowanie uniklanych numerow kont we wlasciwym miejscu (podczas tworzenia klienta)
//dopsiac reszte w addClient - DONE

// TODO: 11.05.2022
//Zrobic kilka commitow rozlozonych w czasie z odpowiadajacym opisem. Przeczytac sekcje collaboration - DONE

// TODO: 18.05.2022
//1. AddClient exception do poprawienie trows golniejszy wyjatek - throw new dokladniejszy wyjatek
//2. Wszystkie wyjatki rozszerzaja wyjatek BankException