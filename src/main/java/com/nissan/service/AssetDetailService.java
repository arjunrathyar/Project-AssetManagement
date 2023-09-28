package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.AssetDetail;
import com.nissan.repo.AssetDetailRepository;

@Service
public class AssetDetailService {
    @Autowired
    private AssetDetailRepository assetDetailRepository;
    
    public AssetDetail getAssetDetailById(Long id) {
        return assetDetailRepository.findById(id).orElse(null);
    }
    
    public AssetDetail createAssetDetail(AssetDetail assetDetail) {
        return assetDetailRepository.save(assetDetail);
    }
    
    public AssetDetail updateAssetDetail(Long id, AssetDetail assetDetail) {
        AssetDetail existingDetail = getAssetDetailById(id);
        if (existingDetail != null) {
            existingDetail.setType(assetDetail.getType());
            existingDetail.setAssetClass(assetDetail.getAssetClass());
            return assetDetailRepository.save(existingDetail);
        }
        return null;
    }
    
    public void deleteAssetDetail(Long id) {
        assetDetailRepository.deleteById(id);
    }
    
    public List<AssetDetail> getAllAssets() {
        // Implementation to retrieve all assets
        return assetDetailRepository.findAll(); // Assuming you have a repository for assets
    }
}
