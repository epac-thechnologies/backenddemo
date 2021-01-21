package com.OrdreArchive.Dao;

import com.OrdreArchive.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ClientRepository extends JpaRepository<Client,String>
{
    ArrayList<Client> findAll();
    Client findClientByClientId(String clientId);
}
