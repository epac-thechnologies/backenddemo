package com.OrdreArchive.Dao;

import com.OrdreArchive.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,String>
{
}
