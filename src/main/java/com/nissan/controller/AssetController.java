package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;
import com.nissan.model.AssetType;
import com.nissan.service.IAssetService;


@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class AssetController {
	@Autowired
	private IAssetService assetService;

	@Autowired
	private APIResponse apiResponse;

	// list
	@GetMapping("/assettype")
	public List<AssetType> getAsset() {
		return assetService.getAssetType();
	}

	@PostMapping("/assettype")
	public ResponseEntity<APIResponse> addAssetDefinition(@RequestBody AssetType asset) {
		if (assetService.saveAssetType(asset) == null) {
			apiResponse.setData("Name can have only alphabets!!");
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid Name");

			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Assets added successfully");
		apiResponse.setStatus(200);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}

	// search by id
	@GetMapping("/assettype/{id}")
	public List<AssetType> getAssetById(@PathVariable int id) {
		return (List<AssetType>) assetService.getAssetTypeById(id);
	}


}