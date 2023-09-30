package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.Validation;
import com.nissan.model.PurchaseOrder;
import com.nissan.repo.IPurchaseOrderRepository;

@Service
public class PurchaseOrderServiceImplementation implements IPurchaseOrderService{

	@Autowired
	private IPurchaseOrderRepository purchaseOrderRepo;

	//@Autowired
	//private Validation validation;

	@Override
	public List<PurchaseOrder> getPurchaseOrder() {
		return (List<PurchaseOrder>) purchaseOrderRepo.findAll();
	}

	@Override
	public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder) {
		return purchaseOrderRepo.save(purchaseOrder);
	}

	@Override
	public PurchaseOrder getPurchaseOrder(int id) {
		return purchaseOrderRepo.findById(id).orElseThrow(() -> new RuntimeException("PurchaseOrder Not Found with id: " + id));
	}
	
	@Override
	public void deletePurchaseOrder(int id) {
		PurchaseOrder pOrder = getPurchaseOrder(id);
		//pOrder.setActive(false);
		purchaseOrderRepo.save(pOrder);
	}


}
