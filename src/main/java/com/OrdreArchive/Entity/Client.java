package com.OrdreArchive.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long clientId;
    private String name;
    private String firstName;
    private  String postalAddresses;
    private String phone ;
    private String email;
    private String fiscalPosition;
    private String currency;
    private String shipmentMode;

    public Client() {
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPostalAddresses() {
        return postalAddresses;
    }

    public void setPostalAddresses(String postalAddresses) {
        this.postalAddresses = postalAddresses;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFiscalPosition() {
        return fiscalPosition;
    }

    public void setFiscalPosition(String fiscalPosition) {
        this.fiscalPosition = fiscalPosition;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getShipmentMode() {
        return shipmentMode;
    }

    public void setShipmentMode(String shipmentMode) {
        this.shipmentMode = shipmentMode;
    }
}
