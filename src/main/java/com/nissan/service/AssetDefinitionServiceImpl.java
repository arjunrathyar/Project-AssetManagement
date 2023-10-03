package com.nissan.service;

import com.nissan.model.AssetDefinition;
import com.nissan.repo.AssetDefinitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetDefinitionServiceImpl implements AssetDefinitionService {

    @Autowired
    private AssetDefinitionRepository assetDefinitionRepository;

    // Retrieve all asset definitions
    @Override
    public List<AssetDefinition> getAllAssetDefinitions() {
        return assetDefinitionRepository.findAll();
    }

    // Retrieve a specific asset definition by its ID
    @Override
    public AssetDefinition getAssetDefinitionById(int id) {
        return assetDefinitionRepository.findById(id).orElse(null);
    }

    // Add a new asset definition
    @Override
    public void addAssetDefinition(AssetDefinition assetDefinition) {
        assetDefinitionRepository.save(assetDefinition);
    }

    // Update an existing asset definition
    @Override
    public void updateAssetDefinition(int id, AssetDefinition updatedAssetDefinition) {
        // Retrieve the existing asset definition
        AssetDefinition existingAssetDefinition = getAssetDefinitionById(id);

        // If the asset definition exists, update its properties
        if (existingAssetDefinition != null) {
            existingAssetDefinition.setAssetName(updatedAssetDefinition.getAssetName());
            existingAssetDefinition.setAssetTypeId(updatedAssetDefinition.getAssetTypeId());
            existingAssetDefinition.setAssetType(updatedAssetDefinition.getAssetType());
            existingAssetDefinition.setAssetClassId(updatedAssetDefinition.getAssetClassId());
            existingAssetDefinition.setAssetClass(updatedAssetDefinition.getAssetClass());

            // Save the updated asset definition
            assetDefinitionRepository.save(existingAssetDefinition);
        }
    }

    // Delete an asset definition by its ID
    @Override
    public void deleteAssetDefinition(int id) {
        assetDefinitionRepository.deleteById(id);
    }
}
