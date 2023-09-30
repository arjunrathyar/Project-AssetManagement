package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.AssetMaster;
import com.nissan.repo.IAssetMasterRepository;

@Service
public class AssetMasterServiceImple implements IAssetMasterService{
	
	@Autowired
	private IAssetMasterRepository assetMasterRepo;

	@Override
	public List<AssetMaster> getNewAsset() {
	// TODO Auto-generated method stub
	return (List<AssetMaster>) assetMasterRepo.findAll();
}

	@Override
	public AssetMaster saveNewAsset(AssetMaster assetMaster) {
		// TODO Auto-generated method stub
		return assetMasterRepo.save(assetMaster);
	}

	@Override
	public AssetMaster getNewAsset(int id) {
		// TODO Auto-generated method stub
		return assetMasterRepo.findById(id).orElseThrow(() -> new RuntimeException("Asset not found for id" + id));
	}

	
	

	
}
