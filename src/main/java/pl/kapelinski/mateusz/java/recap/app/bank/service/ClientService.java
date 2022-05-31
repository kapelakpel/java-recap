package pl.kapelinski.mateusz.java.recap.app.bank.service;

import pl.kapelinski.mateusz.java.recap.app.bank.repository.ClientRepository;
import pl.kapelinski.mateusz.java.recap.app.bank.ui.model.Client;

import java.util.logging.Logger;

public class ClientService {

    private static final Logger LOGGER = Logger.getLogger(ClientService.class.getName());
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void create(Client client) {
        LOGGER.info("create(" + client + ")");
        //if(ClientChecker.noDept()){}
        clientRepository.create(client);
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
