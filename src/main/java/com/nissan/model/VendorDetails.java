package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendor_details")
public class VendorDetails {

	@Id // making as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// vendor id
	@Column(name = "vd_id")
	private Integer id;

	// vendor type
	@Column(name = "vd_type", nullable = false, length = 40)
	private String vendorType;

	// valid from
	@Column(name = "vd_from")
	private LocalDate validFrom;

	// valid to
	@Column(name = "vd_to")
	private LocalDate validTo;

	// address
	@Column(name = "vd_addr", nullable = false, length = 200)
	private String address;

	// check status of vendor
	@Column(name = "vd_active")
	private boolean isActive = true;

	// mapping to vendor table
	private int vendorId;
	@OneToOne
	@JoinColumn(name = "vendorId", insertable = false, updatable = false)
	private Vendor vendor;

	// mapping to AssetType table
	private int assetTypeId;
	@ManyToOne
	@JoinColumn(name = "assetTypeId", insertable = false, updatable = false)
	private AssetType assetType;

	public Integer getId() {
		return id;
	}

	public String getVendorType() {
		return vendorType;
	}

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public LocalDate getValidTo() {
		return validTo;
	}

	public String getAddress() {
		return address;
	}

	public boolean isActive() {
		return isActive;
	}

	public int getVendorId() {
		return vendorId;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public int getAssetTypeId() {
		return assetTypeId;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

}
