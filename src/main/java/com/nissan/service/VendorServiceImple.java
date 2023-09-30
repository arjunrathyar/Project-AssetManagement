package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nissan.common.Validation;
import com.nissan.model.Vendor;
import com.nissan.repo.IVendorRepository;

@Service
public class VendorServiceImple implements IVendorService {
	
	@Autowired
	private IVendorRepository vendorRepo;
	
	@Autowired
	private Validation validation;

	@Override
	public List<Vendor> getVendor() {
		
		return (List<Vendor>) vendorRepo.findAll();
	}

	@Override
	public Vendor saveVendor(Vendor vendor) {
		if(validation.isNameValid(vendor.getVendorName())) {
			return vendorRepo.save(vendor);
		}
		return null;
	}

	@Override
	public Vendor getVendor(int id) {
		
		return vendorRepo.findById(id).orElseThrow(()->new RuntimeException("vendorRepo not found for id"+id));
	}

	@Transactional
	@Override
	public void deleteVendor(int id) {
		vendorRepo.deleteById(id);
	}

	@Override
	public List<Vendor> getVendorByName(String name) {
		
		return vendorRepo.findByVendorName(name);
	}

}
