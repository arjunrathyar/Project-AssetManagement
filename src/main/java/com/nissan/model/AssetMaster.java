package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@Entity
@Table(name="asset_master")
public class AssetMaster {
	//asset master id
	@Id
	@Column(name="am_id")
	private int id;
	
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
	
	//check the status of Asset
	@Column(name="am_active")
	private boolean isActive=true;
	
	//mapping
	
		//mapping to AssetType
		private Integer assetTypeId;
		@OneToOne
		@JoinColumn(name="assetTypeId",insertable=false,updatable=false)
		private AssetType assetType;
		
		//mapping to Vendor
		private Integer vendorId;
		@OneToOne
		@JoinColumn(name="vendorId",insertable=false,updatable=false)
		private Vendor vendor;
	
		//mapping to AssetDefinition
		private Integer assetDefId;
		@OneToOne
		@JoinColumn(name="assetDefId",insertable=false,updatable=false)
		private AssetDefinition assetDefinition;
	//default constructor
	
	public AssetMaster() {
		super();
		
	}
	//getter of isActive
	public boolean isActive() {
		return isActive;
	}

	//setter of isActive
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	//getter of id
	public int getId() {
		return id;
	}

	//setter of id
	public void setId(int id) {
		this.id = id;
	}


	
	//getter of make
	public String getMake() {
		return make;
	}

	//setter of make
	public void setMake(String make) {
		this.make = make;
	}
	
	
	//getter of model
	public String getModel() {
		return model;
	}

	//setter of model
	public void setModel(String model) {
		this.model = model;
	}

	//getter of serial number
	public String getSerialNo() {
		return serialNo;
	}

	//setter of serial number
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	//getter of year of manufacture
	public String getYearOfManufacture() {
		return yearOfManufacture;
	}

	//setter of year of manufacture
	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	//getter of purchase date
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	//setter of purchase date
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	//getter of warranty
	public String getWarranty() {
		return warranty;
	}

	//setter of warranty
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	//getter of warranty from date
	public LocalDate getWarrantyFrom() {
		return warrantyFrom;
	}

	//setter of warranty from date
	public void setWarrantyFrom(LocalDate warrantyFrom) {
		this.warrantyFrom = warrantyFrom;
	}

	//getter of warranty to date
	public String getWarrantyTo() {
		return warrantyTo;
	}

	//setter of warranty to date
	public void setWarrantyTo(String warrantyTo) {
		this.warrantyTo = warrantyTo;
	}
	
	//toString
	@Override
	public String toString() {
		return "AssetMaster [id=" + id + ", make=" + make + ", model=" + model + ", serialNo=" + serialNo
				+ ", yearOfManufacture=" + yearOfManufacture + ", purchaseDate=" + purchaseDate + ", warranty="
				+ warranty + ", warrantyFrom=" + warrantyFrom + ", warrantyTo=" + warrantyTo + ", isActive=" + isActive
				+ ", assetTypeId=" + assetTypeId + ", assetType=" + assetType + ", vendorId=" + vendorId + ", vendor="
				+ vendor + ", assetDefId=" + assetDefId + ", assetDefinition=" + assetDefinition + "]";
	}
	

	

	

	
	
}
