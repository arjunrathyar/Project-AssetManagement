package com.nissan.service;

import java.util.List;

import com.nissan.model.PurchaseOrder;

public interface IPurchaseOrderService {

	// list purchase order
	public List<PurchaseOrder> getPurchaseOrder();
	
	// list pending purchase order
	public List<PurchaseOrder> getPendingPurchaseOrder();

	// insert purchase order
	PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder);

	// get purchase order by id
	public PurchaseOrder getPurchaseOrder(int id);
	
	// update purchase order by id
	public PurchaseOrder updatePurchaseOrder(PurchaseOrder purchaseOrder, PurchaseOrder customer);

	// delete purchase order
	public void deletePurchaseOrder(PurchaseOrder purchaseOrder);

	

	

}
