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

	@Column(name = "at_id", nullable = false)
	private int assetTypeId;
	@ManyToOne
	@JoinColumn(name = "assetTypeId")
	private AssetType assetType;

	@Column(name = "ac_id", nullable = false)
	private int assetClassId;
	@ManyToOne
	@JoinColumn(name = "assetClassId")
	private AssetClass assetClass;

}
