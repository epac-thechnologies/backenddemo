package com.OrdreArchive.Controller;

import com.OrdreArchive.Dao.ClientRepository;
import com.OrdreArchive.Entity.Client;
import com.OrdreArchive.Entity.Invoice;
import com.OrdreArchive.Entity.PageInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @CrossOrigin("*")
    @GetMapping("/clients")
    public ArrayList<Client> getallClient( )
    {
        return clientRepository.findAll();
    }
    @CrossOrigin("*")
    @GetMapping("/clients/{clientId}")
    public Client getClient(@PathVariable("clientId") String clientId)
    {
        return clientRepository.findClientByClientId(clientId);
    }
    @CrossOrigin("*")
    @GetMapping ("/deleteClient/{clientId}")
    public void deleteClient(@PathVariable("clientId") String clientId)
    {
         clientRepository.deleteById(clientId);
    }
    @CrossOrigin("*")
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client)
    {
        return clientRepository.save(client);
    }
}
