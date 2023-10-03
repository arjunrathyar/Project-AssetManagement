package com.nissan.repo;

import org.springframework.data.repository.CrudRepository;

import com.nissan.model.PurchaseOrder;

public interface IPurchaseOrderRepository extends CrudRepository<PurchaseOrder, Integer>{

}
