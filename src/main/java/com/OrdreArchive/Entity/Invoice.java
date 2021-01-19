package com.OrdreArchive.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long factureId;
    private  Date timestamp;
    private  double sum;
    private  Date startDate;
    private  Date endDate;
    private  String clientId;
    private  String type;
    /* @OneToMany (mappedBy="invoice",fetch= FetchType.LAZY)

     private Collection<OrdreArchive> ordreArchives;

     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "invoice_ordre",
            joinColumns = @JoinColumn(name = "factureId",referencedColumnName = "factureId"),
            inverseJoinColumns = @JoinColumn(name = "packing_slips_id",referencedColumnName ="packing_slips_id" ))
    private Collection<OrdreArchive> ordreArchives;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getFactureId() {
        return factureId;
    }

    public void setFactureId(long factureId) {
        this.factureId = factureId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Collection<OrdreArchive> getOrdreArchives() {
        return ordreArchives;
    }

    public void setOrdreArchives(Collection<OrdreArchive> ordreArchives) {
        this.ordreArchives = ordreArchives;
    }
}
