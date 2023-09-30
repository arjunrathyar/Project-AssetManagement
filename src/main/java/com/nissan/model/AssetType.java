package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset_type")
public class AssetType {

	@Id//making as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Asset Type id
	@Column(name = "at_id", nullable = false)
	private int id;

	//Asset Type
	@Column(name = "at_type", nullable = false, length = 15)
	private String assetType;

	//getters and setters
	public int getId() {
		return id;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

}
