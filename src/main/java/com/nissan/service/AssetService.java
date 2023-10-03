package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.AssetType;
import com.nissan.repo.IAssetRepository;

@Service
public class AssetService implements IAssetService {
	
	@Autowired
	private IAssetRepository assetRepo;

	@Override
	public List<AssetType> getAssetType() {
		return (List<AssetType>)assetRepo.findAll();
	}

	//insert
	@Override
	public AssetType saveAssetType(AssetType asset) {
		
			return assetRepo.save(asset);
	}


	@Override
	public List<AssetType> getAssetTypeById(int id) {
		return (List<AssetType>) assetRepo.findById(id);
	}
	
			

}
