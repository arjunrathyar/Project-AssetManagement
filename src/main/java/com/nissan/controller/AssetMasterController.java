package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;
import com.nissan.model.AssetMaster;
import com.nissan.model.Vendor;
import com.nissan.service.IAssetMasterService;

@CrossOrigin
@RestController // Controller+@Configuration
@RequestMapping("/api")
public class AssetMasterController {
	

	@Autowired
	private APIResponse apiResponse;
	
	@Autowired
	private IAssetMasterService assetMasterService;
	
	//get details of asset created
	@GetMapping("/assets")
	public List<AssetMaster> getNewAsset(){
		return assetMasterService.getNewAsset();
	}
	
	//search by id
	@GetMapping("/asset/{id}")
	public AssetMaster getNewAsset(@PathVariable int id){
		return assetMasterService.getNewAsset(id);
	}

	//add an asset
	@PostMapping("/asset")
	public ResponseEntity<APIResponse> addNewAsset(@RequestBody AssetMaster assetMaster) {
		assetMasterService.saveNewAsset(assetMaster);
		apiResponse.setData("ASSET ADDED SUCCESSFULLY");
		apiResponse.setStatus(200);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}
	//Edit an asset
	@PutMapping("/asset")
	public ResponseEntity<APIResponse> updateEmployee(@RequestBody AssetMaster assetMaster){
		//jwtUtil.verify(auth);
		assetMasterService.saveNewAsset(assetMaster);
		
		apiResponse.setData("ASSET UPDATED SUCCESSFULLY");
		apiResponse.setStatus(200);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}
	
	// disable asset
	@DeleteMapping("/asset/disable/{id}")
	public void disableAsset(@PathVariable int id)  {
					
		assetMasterService.disableAsset(id);
	}

}
