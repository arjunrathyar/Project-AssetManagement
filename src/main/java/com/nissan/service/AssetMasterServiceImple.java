package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nissan.model.AssetMaster;
import com.nissan.repo.IAssetMasterRepository;

@Service
public class AssetMasterServiceImple implements IAssetMasterService{
	
	@Autowired
	private IAssetMasterRepository assetMasterRepo;

	
	//get assets
	@Override
	public List<AssetMaster> getNewAsset() {
	// TODO Auto-generated method stub
	return (List<AssetMaster>) assetMasterRepo.findAll();
}

	//adding new asset
	@Override
	public AssetMaster saveNewAsset(AssetMaster assetMaster) {
		// TODO Auto-generated method stub
		return assetMasterRepo.save(assetMaster);
	}

	
	//get asset by id
	@Override
	public AssetMaster getNewAsset(int id) {
		// TODO Auto-generated method stub
		return assetMasterRepo.findById(id).orElseThrow(() -> new RuntimeException("Asset not found for id" + id));
	}

	//disable assets
	@Transactional
	@Override
	public void disableAsset(int id) {
		if(assetMasterRepo.findById(id)==null) {
			throw new RuntimeException("asset not found for account number" + id);
		}
		else {
			assetMasterRepo.disableAsset(id);
		}
		
	}

	
	

	
}
