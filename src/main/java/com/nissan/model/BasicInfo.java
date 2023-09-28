package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BasicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nid;
    
    private String name;
    
    @OneToOne(mappedBy = "basicInfo")
    private AssetDetail assetDetail;
    
    // Getters and setters

	public Long getNid() {
		return nid;
	}

	public void setNid(Long nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AssetDetail getAssetDetail() {
		return assetDetail;
	}

	public void setAssetDetail(AssetDetail assetDetail) {
		this.assetDetail = assetDetail;
	}
    
    
    
    
}
