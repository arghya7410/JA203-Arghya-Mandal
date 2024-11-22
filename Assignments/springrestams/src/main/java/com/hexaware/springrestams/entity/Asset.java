package com.hexaware.springrestams.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Asset {
	@Id
	private int assetID;
	private String assetName;
	private double assetValue;
	public Asset() {
		super();
	}
	public Asset(int assetID, String assetName, double assetValue) {
		super();
		this.assetID = assetID;
		this.assetName = assetName;
		this.assetValue = assetValue;
	}
	public int getAssetID() {
		return assetID;
	}
	public void setAssetID(int assetID) {
		this.assetID = assetID;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public double getAssetValue() {
		return assetValue;
	}
	public void setAssetValue(double assetValue) {
		this.assetValue = assetValue;
	}
	@Override
	public String toString() {
		return "Asset [assetID=" + assetID + ", assetName=" + assetName + ", assetValue=" + assetValue + "]";
	}
	
}
