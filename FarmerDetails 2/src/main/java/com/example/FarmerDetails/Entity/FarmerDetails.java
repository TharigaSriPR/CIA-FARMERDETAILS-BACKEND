package com.example.FarmerDetails.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Farmerdetail")
public class FarmerDetails {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="FarmerName")
	private String FarmerName;
	
	@Column(name="Crop")
	private String Crop;
	
	@Column(name="SoilType")
	private String SoilType;
	
	@Column(name="Revenue")
	private int Revenue;
	
	@Column(name="FarmEquipment")
	private String FarmEquipment;
	
	@Column(name="Product")
	private String Product;
	
	@Column(name="Livestock")
	private String Livestock;
	
	public FarmerDetails(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFarmerName() {
		return FarmerName;
	}

	public void setFarmerName(String farmerName) {
		FarmerName = farmerName;
	}

	public String getCrop() {
		return Crop;
	}

	public void setCrop(String crop) {
		Crop = crop;
	}

	public String getSoilType() {
		return SoilType;
	}

	public void setSoilType(String soilType) {
		SoilType = soilType;
	}

	public int getRevenue() {
		return Revenue;
	}

	public void setRevenue(int revenue) {
		Revenue = revenue;
	}

	public String getFarmEquipment() {
		return FarmEquipment;
	}

	public void setFarmEquipment(String farmEquipment) {
		FarmEquipment = farmEquipment;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getLivestock() {
		return Livestock;
	}

	public void setLivestock(String livestock) {
		Livestock = livestock;
	}

	public FarmerDetails(int id, String farmerName, String crop, String soilType, int revenue, String farmEquipment,
			String product, String livestock) {
		super();
		this.id = id;
		this.FarmerName = farmerName;
		this.Crop = crop;
		this.SoilType = soilType;
		this.Revenue = revenue;
		this.FarmEquipment = farmEquipment;
		this.Product = product;
		this.Livestock = livestock;
	}
	
	
	
	

}
