package com.nissan.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nissan.model.AssetMaster;



public interface IAssetMasterRepository extends CrudRepository<AssetMaster, Integer>{

	
	@Modifying
	@Query("UPDATE com.nissan.model.AssetMaster SET isActive=0 WHERE id = ?1")
	public void disableAsset(Integer id);
	
}
