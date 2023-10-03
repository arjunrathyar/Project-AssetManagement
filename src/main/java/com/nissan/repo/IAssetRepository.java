package com.nissan.repo;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.AssetType;

@Repository
public interface IAssetRepository extends CrudRepository<AssetType, Integer> {

	// search by id
	// create custom method using JPQL query

	@Query("from AssetType WHERE at_id like ?1")
	public List<AssetType> findById(int id);


}