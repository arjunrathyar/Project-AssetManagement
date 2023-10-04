package com.nissan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nissan.model.PurchaseOrder;

public interface IPurchaseOrderRepository extends CrudRepository<PurchaseOrder, Integer>{
	
	@Query("SELECT pOrder FROM PurchaseOrder pOrder WHERE pOrder.assetStatusID = 4")
	public List<PurchaseOrder> getPendingPurchaseOrder();
	
	
	@Query("SELECT pOrder FROM PurchaseOrder pOrder WHERE pOrder.isActive = true")
	public List<PurchaseOrder> getPurchaseOrder();

}
