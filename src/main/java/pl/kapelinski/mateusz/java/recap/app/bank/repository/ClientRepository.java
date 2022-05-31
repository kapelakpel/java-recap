package pl.kapelinski.mateusz.java.recap.app.bank.repository;

import pl.kapelinski.mateusz.java.recap.app.bank.ui.model.Client;

import java.util.logging.Logger;

public class ClientRepository {

    private static final Logger LOGGER = Logger.getLogger(ClientRepository.class.getName());

    public void create(Client client) {
        LOGGER.info("create(" + client + ")");
    }

    public void read() {
    }

    public void update() {
    }

    public void delete() {
    }

    public void list() {
    }
}
