package pl.kapelinski.mateusz.java.recap.app.bank.repository;

import pl.kapelinski.mateusz.java.recap.app.bank.ui.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ClientRepository {

    private static final Logger LOGGER = Logger.getLogger(ClientRepository.class.getName());
    private List<Client> clients = new ArrayList<>();

    public Client create(Client client) {
        LOGGER.info("create(" + client + ")");
        LOGGER.info("create(...)="+client);
        clients.add(client);
        return client;
    }

    public void read() {
    }

    public void update() {
    }

    public void delete() {
    }

    public List<Client> list() {
        LOGGER.info("list()");
        return clients;
    }
}
