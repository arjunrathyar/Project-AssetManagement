package com.nissan.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.Vendor;
@Repository
public interface IVendorRepository extends CrudRepository<Vendor, Integer>{
	//disable vendor
	@Modifying
	@Query("UPDATE com.nissan.model.Vendor SET isActive=0 WHERE id=?1")
	public void deleteVendorById(Integer id);

	// search by vendor name

	// custom methods using JPQL query
//	@Query("from Vendor WHERE employeeName like %?1%")
//	public List<Vendor> findByVendorName(String name);

}
