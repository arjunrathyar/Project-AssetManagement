package com.nissan.service;

import com.nissan.model.AssetDefinition;
import java.util.List;

public interface AssetDefinitionService {

    List<AssetDefinition> getAllAssetDefinitions();

    AssetDefinition getAssetDefinitionById(int id);

    void addAssetDefinition(AssetDefinition assetDefinition);

    void updateAssetDefinition(int id, AssetDefinition assetDefinition);

    void deleteAssetDefinition(int id);
}

