package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetMaster;

public interface IAssetMasterService {
	//list
			public List<AssetMaster> getNewAsset();
			
			//insert
			public AssetMaster saveNewAsset(AssetMaster assetMaster);
			
			//search by id
			public AssetMaster getNewAsset(int id);
			
			

}
