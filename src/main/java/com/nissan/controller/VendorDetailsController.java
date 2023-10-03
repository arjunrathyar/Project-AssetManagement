package com.nissan.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;
import com.nissan.model.VendorDetails;
import com.nissan.service.IVendorDetailsService;

@CrossOrigin
@RestController // @Controller+@Configuration
@RequestMapping("/api")
public class VendorDetailsController {
	
	@Autowired
	private APIResponse apiResponse;

	@Autowired
	private IVendorDetailsService vendorService;

	// list vendors
	@GetMapping("/vendors")
	public List<VendorDetails> getVendor() {
		return vendorService.getVendor();
	}

	// search vendors by id
	@GetMapping("/vendors/{id}")
	public VendorDetails getVendor(@PathVariable int id) {
		return vendorService.getVendor(id);
	}

	// add vendors
	@PostMapping("/vendors")
	public ResponseEntity<APIResponse> addVendor(@RequestBody VendorDetails vendor) {

		if (vendorService.saveVendor(vendor) == null) {
			apiResponse.setData("Name can have only alphabets!");
			apiResponse.setStatus(500);
			apiResponse.setError("INVALID NAME");

			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

		}
		apiResponse.setData("VENDOR ADDED SUCCESSFULLY");
		apiResponse.setStatus(200);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}

	// update VendorDetails
	@PutMapping("/vendors")
	public void updateVendor(@RequestBody VendorDetails vendor) {

		vendorService.saveVendor(vendor);

	}

	// disable vendor
	@DeleteMapping("/vendors/{id}")
	public void deleteVendor(@PathVariable int id) {
		vendorService.deleteVendor(id);

	}

	// search by name
//	@GetMapping("/vendors/search/{name}")
//	public List<VendorDetails> getAllVendorsByName(@PathVariable String name) {
//		return vendorService.getVendorByName(name);
//	}

}
