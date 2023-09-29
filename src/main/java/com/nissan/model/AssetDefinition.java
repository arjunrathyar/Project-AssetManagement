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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ad_id", nullable = false)
	private int id;

	@Column(name = "ad_name", nullable = false, length = 20)
	private String assetName;

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
