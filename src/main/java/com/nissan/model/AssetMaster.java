package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asset_master")
public class AssetMaster {
	//asset master id
	@Id
	@Column(name="am_id")
	private int id;
	
	//asset master type
	@Column(name="am_type",nullable=false,length=40)
	private String type;
	
	//asset master make
	@Column(name="am_make",nullable=false,length=40)
	private String make;
	
	//asset master model 
	@Column(name="am_model",nullable=false,length=40)
	private String model;
	
	//serial number
	@Column(name="am_snumber",nullable=false,length=20)
	private String serialNo;
	
	//Year of manufacture
	@Column(name="am_myear",nullable=false,length=10)
	private String yearOfManufacture;
	
	//Purchase date
	@Column(name="am_pdate")
	private LocalDate purchaseDate;
	
	//warranty years
	@Column(name="am_warranty",nullable=false,length=1)
	private String warranty;
	
	//warranty from
	@Column(name="am_from")
	private LocalDate warrantyFrom;
	
	//warranty to
	@Column(name="am_to")
	private String warrantyTo;
	
	
	public AssetMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public LocalDate getWarrantyFrom() {
		return warrantyFrom;
	}

	public void setWarrantyFrom(LocalDate warrantyFrom) {
		this.warrantyFrom = warrantyFrom;
	}

	public String getWarrantyTo() {
		return warrantyTo;
	}

	public void setWarrantyTo(String warrantyTo) {
		this.warrantyTo = warrantyTo;
	}
	

	@Override
	public String toString() {
		return "AssetMaster [id=" + id + ", type=" + type + ", make=" + make + ", model=" + model + ", serialNo="
				+ serialNo + ", yearOfManufacture=" + yearOfManufacture + ", purchaseDate=" + purchaseDate
				+ ", warranty=" + warranty + ", warrantyFrom=" + warrantyFrom + ", warrantyTo=" + warrantyTo + "]";
	}

	

	
	
}
