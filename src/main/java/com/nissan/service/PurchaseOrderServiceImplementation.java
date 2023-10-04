package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.PurchaseOrder;
import com.nissan.repo.IPurchaseOrderRepository;

@Service
public class PurchaseOrderServiceImplementation implements IPurchaseOrderService {

	@Autowired
	private IPurchaseOrderRepository purchaseOrderRepo;

//	@Autowired
//	private Validation validation;

	// Create Purchase Order
	@Override
	public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder) {
//		if (validation.isNameValid(purchaseOrder.getPurchaseOrderName())
//				&& validation.isMobileValid(Long.toString(purchaseOrder.getMobileNumber()))) {
//			return purchaseOrderRepo.save(purchaseOrder);
//		}
//		return null;

		return purchaseOrderRepo.save(purchaseOrder);
	}

	// Read All Purchase Orders
	@Override
	public List<PurchaseOrder> getPurchaseOrder() {
		return (List<PurchaseOrder>) purchaseOrderRepo.findAll();
	}

	// Read Purchase Order by Purchase order ID
	@Override
	public PurchaseOrder getPurchaseOrder(int poID) {
		return purchaseOrderRepo.findById(poID)
				.orElseThrow(() -> new RuntimeException("PurchaseOrder Not Found with pNo: " + poID));
	}
 
	// Update Purchase Order
	@Override
	public PurchaseOrder updatePurchaseOrder(PurchaseOrder purchaseOrder, PurchaseOrder purchaseOrder2) {
//		if (validation.isMobileValid(Long.toString(purchaseOrder2.getMobileNumber()))) {
//			purchaseOrder.setMobileNumber(purchaseOrder2.getMobileNumber());
//			purchaseOrder.setEmailId(purchaseOrder2.getEmailId());
//			return purchaseOrderRepo.save(purchaseOrder);
//		} 
		return null;

	}

	// Delete Purchase Order
	@Override
	public void deletePurchaseOrder(PurchaseOrder purchaseOrder) {
		purchaseOrder.setActive(false);
		purchaseOrderRepo.save(purchaseOrder);
	}

}
