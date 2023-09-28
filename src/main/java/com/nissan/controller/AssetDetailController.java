package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetDetail;
import com.nissan.service.AssetDetailService;

@RestController
@RequestMapping("/assetdetail")
public class AssetDetailController {
    @Autowired
    private AssetDetailService assetDetailService;
    
    @GetMapping("/{id}")
    public AssetDetail getAssetDetailById(@PathVariable Long id) {
        return assetDetailService.getAssetDetailById(id);
    }
    
    @PostMapping("/create")
    public AssetDetail createAssetDetail(@RequestBody AssetDetail assetDetail) {
        return assetDetailService.createAssetDetail(assetDetail);
    }
    
    @PutMapping("/update/{id}")
    public AssetDetail updateAssetDetail(@PathVariable Long id, @RequestBody AssetDetail assetDetail) {
        return assetDetailService.updateAssetDetail(id, assetDetail);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteAssetDetail(@PathVariable Long id) {
        assetDetailService.deleteAssetDetail(id);
    }
    
    @GetMapping("/all")
    public List<AssetDetail> getAllAssets() {
        return assetDetailService.getAllAssets();
    }
}

