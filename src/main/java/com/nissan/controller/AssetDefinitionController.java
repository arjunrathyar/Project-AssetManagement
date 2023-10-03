package com.nissan.controller;

import com.nissan.model.AssetDefinition;
import com.nissan.service.AssetDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class AssetDefinitionController {

    @Autowired
    private AssetDefinitionService assetDefinitionService;

    // Get all asset definitions
    @GetMapping("/assetdefinitions")
    public List<AssetDefinition> getAllAssetDefinitions() {
        return assetDefinitionService.getAllAssetDefinitions();
    }

    // Get a specific asset definition by ID
    @GetMapping("/assetdefinitions/{id}")
    public AssetDefinition getAssetDefinitionById(@PathVariable int id) {
        return assetDefinitionService.getAssetDefinitionById(id);
    }

    // Add a new asset definition
    @PostMapping("//assetdefinitions")
    public void addAssetDefinition(@RequestBody AssetDefinition assetDefinition) {
        assetDefinitionService.addAssetDefinition(assetDefinition);
    }

    // Update an existing asset definition
    @PutMapping("/assetdefinitions/{id}")
    public void updateAssetDefinition(@PathVariable int id, @RequestBody AssetDefinition assetDefinition) {
        assetDefinitionService.updateAssetDefinition(id, assetDefinition);
    }

    // Delete an asset definition by ID
    @DeleteMapping("/assetdefinitions/{id}")
    public void deleteAssetDefinition(@PathVariable int id) {
        assetDefinitionService.deleteAssetDefinition(id);
    }
}

