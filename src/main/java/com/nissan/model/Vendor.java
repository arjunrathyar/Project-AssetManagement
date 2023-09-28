package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendor")
public class Vendor {
	@Id //making as primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vd_id")
	private Integer id;
	
	@Column(name="vd_name",nullable=false,length=100)
	private String vendorName;
	
	@Column(name="vd_type",nullable=false,length=40)
	private String vendorType;
	
	private String assetType;
	
	@Column(name="vd_from")
	private LocalDate validFrom;
	
	@Column(name="vd_to")
	private LocalDate validTo;
	
	@Column(name="vd_addr",nullable=false,length=200)
	private String address;

	public Vendor() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
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

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
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

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", vendorName=" + vendorName + ", vendorType=" + vendorType + ", assetType="
				+ assetType + ", validFrom=" + validFrom + ", validTo=" + validTo + ", address=" + address + "]";
	}
	
	

}
