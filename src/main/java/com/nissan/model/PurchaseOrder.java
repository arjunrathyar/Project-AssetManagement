package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "purchaseOrderNumber", nullable = false)
	private int purchaseOrderNumber;

	@Column(name = "assetType", nullable = false, length = 60)
	private String assetType;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "vendorName", nullable = false, length = 60)
	private String vendorName;

	@Column(name = "orderDate", nullable = false)
	private LocalDate orderDate;

	@Column(name = "deliveryDate", nullable = false)
	private LocalDate deliveryDate;

	@Column(name = "Status", nullable = false, length = 60)
	private String Status;

	public int getId() {
		return id;
	}

	public int getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public String getAssetType() {
		return assetType;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getVendorName() {
		return vendorName;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPurchaseOrderNumber(int purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
