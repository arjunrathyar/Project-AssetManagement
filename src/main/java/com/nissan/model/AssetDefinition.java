package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asset_def")
public class AssetDefinition {

	@Id//making as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Asset Definition Id
	@Column(name = "ad_id", nullable = false)
	private int id;

	//Asset Name
	@Column(name = "ad_name", nullable = false, length = 20)
	private String assetName;

	//mapping
	@Column(name = "ad_atid", nullable = false)
	private int assetTypeId;
	@ManyToOne
	@JoinColumn(name = "assetTypeId")
	private AssetType assetType;

	@Column(name = "ad_acid", nullable = false)
	private int assetClassId;
	@ManyToOne
	@JoinColumn(name = "assetClassId")
	private AssetClass assetClass;

	//getters and setters
	public int getId() {
		return id;
	}

	public String getAssetName() {
		return assetName;
	}

	public int getAssetTypeId() {
		return assetTypeId;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public int getAssetClassId() {
		return assetClassId;
	}

	public AssetClass getAssetClass() {
		return assetClass;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public void setAssetClassId(int assetClassId) {
		this.assetClassId = assetClassId;
	}

	public void setAssetClass(AssetClass assetClass) {
		this.assetClass = assetClass;
	}

}
