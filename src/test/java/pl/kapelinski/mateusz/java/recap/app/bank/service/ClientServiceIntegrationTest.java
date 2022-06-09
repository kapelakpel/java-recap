package pl.kapelinski.mateusz.java.recap.app.bank.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.AccountNumberGeneratorException;
import pl.kapelinski.mateusz.java.recap.app.bank.repository.ClientRepository;
import pl.kapelinski.mateusz.java.recap.app.bank.ui.model.Client;

class ClientServiceIntegrationTest {

    @Test
    void givenClientService_whenCreate_thenCreatedClientNotNull() throws AccountNumberGeneratorException {
        //GIVEN
        ClientRepository clientRepository = new ClientRepository();
        ClientService clientService = new ClientService(clientRepository);
        Client client = new Client("Mateusz","Kapelinski","1");

        //WHEN
        Client createdClient = clientService.create(client);

        //THEN
        Assertions.assertNotNull(createdClient,"createdClient is null");
    }

    @Test
    void givenClientService_whenCreate_thenClientsListSizeEquals() throws AccountNumberGeneratorException {
        //GIVEN
        ClientRepository clientRepository = new ClientRepository();
        ClientService clientService = new ClientService(clientRepository);
        Client client = new Client("Mateusz","Kapelinski","1");

        //WHEN
        int sizeBefore = clientService.list().size();
        Client createdClient = clientService.create(client);
        int sizeAfter = clientService.list().size();

        //THEN
        Assertions.assertEquals(sizeBefore+1,sizeAfter,"clientService.list() wrong size");
    }
}

// TODO: 31.05.2022
//Dodac kolejny test jednostkowy sprawdzajacy czy po utworzeniu klienta metoda list bedzie miala odpowiedni rozmiar
//NOTE : wyjasnic assertAll, unitTest versus integrationTest,
//assertAll  -
//unitTest -
//integrationTest -