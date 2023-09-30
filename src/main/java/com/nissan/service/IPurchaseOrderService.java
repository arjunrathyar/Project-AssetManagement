package com.nissan.service;

import java.util.List;

import com.nissan.model.PurchaseOrder;

public interface IPurchaseOrderService {

	PurchaseOrder getPurchaseOrder(int id);

	Object savePurchaseOrder(PurchaseOrder purchaseOrder);

	void deletePurchaseOrder(int id);

	List<PurchaseOrder> getPurchaseOrder();

}
