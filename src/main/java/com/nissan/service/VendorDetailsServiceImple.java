package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nissan.common.Validation;
import com.nissan.model.VendorDetails;
import com.nissan.repo.IVendorRepository;

@Service
public class VendorDetailsServiceImple implements IVendorDetailsService {

	@Autowired
	private IVendorRepository vendorRepo;

	@Autowired
	private Validation validation;

	@Override
	public List<VendorDetails> getVendor() {
		return (List<VendorDetails>) vendorRepo.findAll();
	}

	@Override
	public VendorDetails saveVendor(VendorDetails vendor) {
		if (validation.isNameValid(vendor.getVendor().getVendorName())) {
			return vendorRepo.save(vendor);
		}
		return null;
	}

	@Override
	public VendorDetails getVendor(int id) {
		return vendorRepo.findById(id).orElseThrow(() -> new RuntimeException("vendor not found for id" + id));
	}

	@Transactional
	@Override
	public void deleteVendor(int id) {
		vendorRepo.deleteVendorById(id);
	}

//	@Override
//	public List<VendorDetails> getVendorByName(String name) {
//		
//		return vendorRepo.findByVendorName(name);
//	}

}
