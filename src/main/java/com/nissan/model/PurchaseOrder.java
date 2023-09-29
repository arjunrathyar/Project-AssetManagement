package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_det")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pd_id", nullable = false)
	private int id;

	@Column(name = "pd_order", nullable = false)
	private int purchaseOrderNumber;

	@Column(name = "pd_def", nullable = false)
	private int assetDefId;
	@OneToOne
	@JoinColumn(name = "assetDefId")
	AssetDefinition assetDefinition;
	
	@Column(name = "pd_type", nullable = false)
	private int assetTypeId;
	@OneToOne
	@JoinColumn(name = "assetTypeId")
	AssetType assetType;

	@Column(name = "pd_qty", nullable = false)
	private int quantity;

	@Column(name = "pd_vid", nullable = false)
	private int vendorID;
	@OneToOne
	@JoinColumn(name = "vendorID")
	Vendor vendor;

	@Column(name = "pd_date", nullable = false)
	private LocalDate orderDate;

	@Column(name = "pd_ddate", nullable = false)
	private LocalDate deliveryDate;

	@Column(name = "pd_status", nullable = false)
	private int statusID;
	@OneToOne
	@JoinColumn(name = "statusID")
	PurchaseStatus status;
}
