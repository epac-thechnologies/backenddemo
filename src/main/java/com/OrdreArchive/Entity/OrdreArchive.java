package com.OrdreArchive.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class OrdreArchive implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long packing_slips_id;
	private Date shipDate;
	private String notes;
	private long ordreid;
	private String PoNumber;
	private  String pnlNumber;
	private String status;
	private Date dueDate;
	private Integer quantity;
	private Integer produced;
	private Integer oldOrdreid;
	private double price;
	private String isbn;
	private String title;
	private  String author;
	private long numberOfBoxes;
	private  long qtyPerBox;
	private  double boxWeight;
	private  double palletWeight;
	private String clientId;
	private String AccountName;
	private String AccountManager;
	private String shippingAdress;
	private String billingAdress;
	private  double weight;
	//private  String packingInfo;

	/*@ManyToOne
	@JoinColumn(name = ("factureId"))
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Invoice invoice;

	 */
	@ManyToMany(mappedBy = "ordreArchives",fetch= FetchType.LAZY)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Collection<Invoice> invoices;

	public Collection<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(Collection<Invoice> invoices) {
		this.invoices = invoices;
	}

	public long getPacking_slips_id() {
		return packing_slips_id;
	}

	public void setPacking_slips_id(long packing_slips_id) {
		this.packing_slips_id = packing_slips_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public long getOrdreid() {
		return ordreid;
	}

	public void setOrdreid(long ordreid) {
		this.ordreid = ordreid;
	}

	public String getPnlNumber() {
		return pnlNumber;
	}

	public void setPnlNumber(String pnlNumber) {
		this.pnlNumber = pnlNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Integer getProduced() {
		return produced;
	}

	public void setProduced(Integer produced) {
		this.produced = produced;
	}

	public Integer getOldOrdreid() {
		return oldOrdreid;
	}

	public void setOldOrdreid(Integer oldOrdreid) {
		this.oldOrdreid = oldOrdreid;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getNumberOfBoxes() {
		return numberOfBoxes;
	}

	public void setNumberOfBoxes(long numberOfBoxes) {
		this.numberOfBoxes = numberOfBoxes;
	}

	public String getPoNumber() {
		return PoNumber;
	}

	public void setPoNumber(String poNumber) {
		PoNumber = poNumber;
	}

	public long getQtyPerBox() {
		return qtyPerBox;
	}

	public void setQtyPerBox(long qtyPerBox) {
		this.qtyPerBox = qtyPerBox;
	}

	public double getBoxWeight() {
		return boxWeight;
	}

	public void setBoxWeight(double boxWeight) {
		this.boxWeight = boxWeight;
	}

	public double getPalletWeight() {
		return palletWeight;
	}

	public void setPalletWeight(double palletWeight) {
		this.palletWeight = palletWeight;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public String getAccountManager() {
		return AccountManager;
	}

	public void setAccountManager(String accountManager) {
		AccountManager = accountManager;
	}

	public String getShippingAdress() {
		return shippingAdress;
	}

	public void setShippingAdress(String shippingAdress) {
		this.shippingAdress = shippingAdress;
	}

	public String getBillingAdress() {
		return billingAdress;
	}

	public void setBillingAdress(String billingAdress) {
		this.billingAdress = billingAdress;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
