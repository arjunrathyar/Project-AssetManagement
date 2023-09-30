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
@Table(name = "purchase_order")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "po_id", nullable = false)
	private int id;

	@Column(name = "po_orderNo", nullable = false)
	private int assetPurchaseOrderNumber;

	@Column(name = "po_def", nullable = false)
	private int assetDefId;
	@OneToOne
	@JoinColumn(name = "assetDefId")
	AssetDefinition assetDefinition;

	@Column(name = "po_type", nullable = false)
	private int assetTypeId;
	@OneToOne
	@JoinColumn(name = "assetTypeId")
	AssetType assetType;

	@Column(name = "po_qty", nullable = false)
	private int assetQuantity;

	@Column(name = "po_vid", nullable = false)
	private int assetVendorID;
	@OneToOne
	@JoinColumn(name = "assetVendorID")
	Vendor vendor;

	@Column(name = "po_date", nullable = false)
	private LocalDate assetOrderDate;

	@Column(name = "po_ddate", nullable = false)
	private LocalDate assetDeliveryDate;

	@Column(name = "po_status", nullable = false)
	private int assetStatusID;
	@OneToOne
	@JoinColumn(name = "assetStatusID")
	PurchaseStatus status;
	
	private boolean isActive = true;

	public int getId() {
		return id;
	}

	public int getAssetPurchaseOrderNumber() {
		return assetPurchaseOrderNumber;
	}

	public int getAssetDefId() {
		return assetDefId;
	}

	public AssetDefinition getAssetDefinition() {
		return assetDefinition;
	}

	public int getAssetTypeId() {
		return assetTypeId;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public int getAssetQuantity() {
		return assetQuantity;
	}

	public int getAssetVendorID() {
		return assetVendorID;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public LocalDate getAssetOrderDate() {
		return assetOrderDate;
	}

	public LocalDate getAssetDeliveryDate() {
		return assetDeliveryDate;
	}

	public int getAssetStatusID() {
		return assetStatusID;
	}

	public PurchaseStatus getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAssetPurchaseOrderNumber(int assetPurchaseOrderNumber) {
		this.assetPurchaseOrderNumber = assetPurchaseOrderNumber;
	}

	public void setAssetDefId(int assetDefId) {
		this.assetDefId = assetDefId;
	}

	public void setAssetDefinition(AssetDefinition assetDefinition) {
		this.assetDefinition = assetDefinition;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public void setAssetQuantity(int assetQuantity) {
		this.assetQuantity = assetQuantity;
	}

	public void setAssetVendorID(int assetVendorID) {
		this.assetVendorID = assetVendorID;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public void setAssetOrderDate(LocalDate assetOrderDate) {
		this.assetOrderDate = assetOrderDate;
	}

	public void setAssetDeliveryDate(LocalDate assetDeliveryDate) {
		this.assetDeliveryDate = assetDeliveryDate;
	}

	public void setAssetStatusID(int assetStatusID) {
		this.assetStatusID = assetStatusID;
	}

	public void setStatus(PurchaseStatus status) {
		this.status = status;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
