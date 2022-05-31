package pl.kapelinski.mateusz.java.recap.app.bank.ui.controller;

import pl.kapelinski.mateusz.java.recap.app.bank.service.ClientService;
import pl.kapelinski.mateusz.java.recap.app.bank.ui.model.Client;

import java.util.logging.Logger;

public class ClientController {

    private static final Logger LOGGER = Logger.getLogger(ClientController.class.getName());
    private ClientService clientService;

//    public ClientController() {
//        this.clientService = new ClientService();
//    }

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public void create(Client client) {
        LOGGER.info("create(" + client + ")");
        //ClientService clientService = new ClientService();
        if (client.getName() != null) {
            clientService.create(client);
        }
    }

    public void read(Long id) {
        LOGGER.info("read(" + id + ")");
        //ClientService clientService = new ClientService();
        clientService.read();
    }

    public void update() {
    }

    public void delete() {
    }

    public void list() {
    }
}
