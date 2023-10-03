package com.nissan.service;

import java.util.List;
import com.nissan.model.VendorDetails;

public interface IVendorDetailsService {
	// list
	public List<VendorDetails> getVendor();

	// Insert
	public VendorDetails saveVendor(VendorDetails vendor);

	// update by id
	public VendorDetails getVendor(int id);

	// disable
	public void deleteVendor(int id);

	// search by name
	//public List<VendorDetails> getVendorByName(String name);

}
