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

	// add purchaseOrder
	@PostMapping("/purchaseorders")
	public ResponseEntity<APIResponse> addPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verifyAdmin(auth);

//		if (purchaseOrderService.savePurchaseOrder(purchaseOrder) == null) {
//			apiresponse.setData("Recheck Name and Mobile No. Details!!");
//			apiresponse.setStatus(500);
//			apiresponse.setError("Invalid Details!!");
//			return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
//		}

		purchaseOrderService.savePurchaseOrder(purchaseOrder);
		apiresponse.setData("PurchaseOrder added successfully!!");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
	}

    // search all purchaseOrders
	@GetMapping("/purchaseorders")
	public List<PurchaseOrder> getPurchaseOrder(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException {
		// jwtUtil.verifyAdmin(auth);
		return purchaseOrderService.getPurchaseOrder();
	}

	// search purchaseOrder by purchaseOrder ID
	@GetMapping("/purchaseorders/{poID}")
	public PurchaseOrder getPurchaseOrder(@PathVariable int poID,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verifyAdmin(auth);
		return purchaseOrderService.getPurchaseOrder(poID);
	}

	// update purchaseOrder
	@PutMapping("/purchaseorders/{poID}")
	public ResponseEntity<APIResponse> updatePurchaseOrder(@PathVariable int poID,
			@RequestBody PurchaseOrder purchaseOrder,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verifyAdmin(auth);
		
		
//		if (purchaseOrderService.updatePurchaseOrder(purchaseOrderService.getPurchaseOrder(poID),
//				purchaseOrder) == null) {
//			apiresponse.setData("Check Mobile No. Details!!");
//			apiresponse.setStatus(500);
//			apiresponse.setError("Invalid Details!!");
//			return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
//		}
		
		purchaseOrderService.updatePurchaseOrder(purchaseOrderService.getPurchaseOrder(poID), purchaseOrder);
		apiresponse.setData("PurchaseOrder updated successfully!!");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);

	}

	// disable purchaseOrder
	@DeleteMapping("/purchaseorders/{poID}")
	public ResponseEntity<APIResponse> deletePurchaseOrder(@PathVariable int poID,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verifyAdmin(auth);
		purchaseOrderService.deletePurchaseOrder(purchaseOrderService.getPurchaseOrder(poID));
		apiresponse.setData("PurchaseOrder deleted successfully!!");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
	}

}
