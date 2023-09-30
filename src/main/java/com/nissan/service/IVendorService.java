package com.nissan.service;

import java.util.List;
import com.nissan.model.Vendor;

public interface IVendorService {
	// list
	public List<Vendor> getVendor();

	// Insert
	public Vendor saveVendor(Vendor vendor);

	// update by id
	public Vendor getVendor(int id);

	// delete
	public void deleteVendor(int id);

	// search by name
	public List<Vendor> getVendorByName(String name);

}
