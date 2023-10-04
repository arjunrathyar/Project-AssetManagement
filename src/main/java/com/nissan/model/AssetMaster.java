package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="asset_master")
public class AssetMaster {
	//asset master id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Auto generate id
	@Column(name="am_id")
	private int id;
	
	//Model Name
	@Column(name="am_model",nullable=false,length=20)
	private String modelName;
	
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
	private LocalDate warrantyTo;
	
	//check the status of Asset
	@Column(name="am_active")
	private boolean isActive=true;
	
	//mapping
	
//		//mapping to AssetType
//		private Integer assetTypeId;
//		@OneToOne
//		@JoinColumn(name="assetTypeId",insertable=false,updatable=false)
//		private AssetType assetType;
		
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

	
	
	public LocalDate getWarrantyTo() {
		return warrantyTo;
	}
	public void setWarrantyTo(LocalDate warrantyTo) {
		this.warrantyTo = warrantyTo;
	}
	public Integer getAssetDefId() {
		return assetDefId;
	}
	public void setAssetDefId(Integer assetDefId) {
		this.assetDefId = assetDefId;
	}
	public AssetDefinition getAssetDefinition() {
		return assetDefinition;
	}
	public void setAssetDefinition(AssetDefinition assetDefinition) {
		this.assetDefinition = assetDefinition;
	}
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	//toString
	@Override
	public String toString() {
		return "AssetMaster [id=" + id + ", modelName=" + modelName + ", serialNo=" + serialNo + ", yearOfManufacture="
				+ yearOfManufacture + ", purchaseDate=" + purchaseDate + ", warranty=" + warranty + ", warrantyFrom="
				+ warrantyFrom + ", warrantyTo=" + warrantyTo + ", isActive=" + isActive + ", vendorId=" + vendorId
				+ ", vendor=" + vendor + ", assetDefId=" + assetDefId + ", assetDefinition=" + assetDefinition + "]";
	}
	
	

	
}
