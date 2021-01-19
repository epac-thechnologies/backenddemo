package com.OrdreArchive.Entity;

import java.util.ArrayList;
import java.util.Date;

public class Ordre {
    private Integer ordreid;
    private String orderNum;
    private String shippingstatus;
    private String assemblystatus;
    private Date dueDate;
    private Integer quantity;
    private Integer quantityMax;
    private Integer quantityMin;
    private Integer produced;
    private String clientId;
    private String packagingType;

    private Integer oldOrdreid;
    private String partId;
    private String isbn;

    public Ordre() {
    }

    public Integer getOrdreid() {
        return ordreid;
    }

    public void setOrdreid(Integer ordreid) {
        this.ordreid = ordreid;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getShippingstatus() {
        return shippingstatus;
    }

    public void setShippingstatus(String shippingstatus) {
        this.shippingstatus = shippingstatus;
    }

    public String getAssemblystatus() {
        return assemblystatus;
    }

    public void setAssemblystatus(String assemblystatus) {
        this.assemblystatus = assemblystatus;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantityMax() {
        return quantityMax;
    }

    public void setQuantityMax(Integer quantityMax) {
        this.quantityMax = quantityMax;
    }

    public Integer getQuantityMin() {
        return quantityMin;
    }

    public void setQuantityMin(Integer quantityMin) {
        this.quantityMin = quantityMin;
    }

    public Integer getProduced() {
        return produced;
    }

    public void setProduced(Integer produced) {
        this.produced = produced;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public Integer getOldOrdreid() {
        return oldOrdreid;
    }

    public void setOldOrdreid(Integer oldOrdreid) {
        this.oldOrdreid = oldOrdreid;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}

