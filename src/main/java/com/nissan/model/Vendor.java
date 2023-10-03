package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {
	@Id // making as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// vendor id
	@Column(name = "vd_id")
	private Integer id;

	// vendor name
	@Column(name = "vd_name", nullable = false, length = 100)
	private String vendorName;

	//vendor type
	@Column(name="vd_type",nullable=false,length=40)
	private String vendorType;
	
	//valid from
	@Column(name="vd_from")
	private LocalDate validFrom;
	
	//valid to
	@Column(name="vd_to")
	private LocalDate validTo;
	
	//address
	@Column(name="vd_addr",nullable=false,length=200)
	private String address;
		
	//check status of vendor
	@Column(name="vd_active")
	private boolean isActive=true;
	
	//mapping
	private Integer assetTypeId;
	@ManyToOne
	@JoinColumn(name="assetTypeId",insertable=false,updatable=false)
	private AssetType assetType;

	//default constructor
	public Vendor() {
	}

	//getters and setters
	

	public String getVendorName() {
		return vendorName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDate getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(Integer assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", vendorName=" + vendorName + ", vendorType=" + vendorType
				+ ", validFrom=" + validFrom + ", validTo=" + validTo + ", address=" + address + ", isActive="
				+ isActive + ", assetTypeId=" + assetTypeId + ", assetType=" + assetType + "]";
	}
	
	
	
	
}
