package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {
	@Id // making as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// vendor id
	@Column(name = "vd_id")
	private Integer vendorId;

	// vendor name
	@Column(name = "vd_name", nullable = false, length = 100)
	private String vendorName;

	public Integer getVendorId() {
		return vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

}
