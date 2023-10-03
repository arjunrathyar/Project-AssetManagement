package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetType;

public interface IAssetService {

	   //list of assets
		public List<AssetType> getAssetType();
		
	    //insert
		public AssetType saveAssetType(AssetType asset);
		
		
		//search by id
		public List<AssetType> getAssetTypeById(int id);

}