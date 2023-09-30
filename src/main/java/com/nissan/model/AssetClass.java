package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset_class")
public class AssetClass {

	@Id//making as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Asset Class Id
	@Column(name = "ac_id", nullable = false)
	private int id;

	//Asset Class
	@Column(name = "ac_name", nullable = false, length = 10)
	private String assetClass;

	//getters and setters
	public int getId() {
		return id;
	}

	public String getAssetClass() {
		return assetClass;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

}
