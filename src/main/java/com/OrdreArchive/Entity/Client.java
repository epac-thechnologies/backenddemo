package com.OrdreArchive.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client
{
    @Id
    private  String clientId;

    public Client() {
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
