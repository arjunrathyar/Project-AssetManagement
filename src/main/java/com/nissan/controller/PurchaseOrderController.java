package com.nissan.controller;

import java.nio.file.AccessDeniedException;
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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;
import com.nissan.model.PurchaseOrder;
import com.nissan.service.IPurchaseOrderService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PurchaseOrderController {

	@Autowired
	private IPurchaseOrderService purchaseOrderService;

	@Autowired
	private APIResponse apiresponse;

	@GetMapping("/purchaseOrders")
	public List<PurchaseOrder> getPurchaseOrder(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException {
		// jwtUtil.verify(auth);
		return purchaseOrderService.getPurchaseOrder();
	}

	@GetMapping("/purchaseOrders/{id}")
	public PurchaseOrder getPurchaseOrder(@PathVariable int id,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		return purchaseOrderService.getPurchaseOrder(id);
	}

	@PostMapping("/purchaseOrders")
	public ResponseEntity<APIResponse> addPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		if (purchaseOrderService.savePurchaseOrder(purchaseOrder) == null) {
			apiresponse.setData("Name can have only alphabets!!");
			apiresponse.setStatus(500);
			apiresponse.setError("Invalid Name");

			return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
		}
		apiresponse.setData("PurchaseOrder added successfully!!");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
	}

	@PutMapping("/purchaseOrders")
	public ResponseEntity<APIResponse> updatePurchaseOrder(@RequestBody PurchaseOrder purchaseOrder,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		if (purchaseOrderService.savePurchaseOrder(purchaseOrder) == null) {
			apiresponse.setData("Name can have only alphabets!!");
			apiresponse.setStatus(500);
			apiresponse.setError("Invalid Name");

			return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
		}
		apiresponse.setData("PurchaseOrder added successfully!!");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);

	}

	@DeleteMapping("/purchaseOrders/{id}")
	public void deletePurchaseOrder(@PathVariable int id,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		purchaseOrderService.deletePurchaseOrder(id);
	}

}
