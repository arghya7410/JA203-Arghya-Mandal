package com.hexaware.springrestams.service;

import java.util.List;

import com.hexaware.springrestams.entity.Asset;

public interface IAssetService {
	public Asset addAsset(Asset asset);
	public Asset updateAsset(Asset asset);
	public void deleteAsset(int assetId);
	public Asset getAssetById(int assetId);
	public List<Asset> getAllAsset();
	public List<Asset> getAllAssetSorted();
	public List<Asset> getAssetByName(String assetName);
	public List<Asset> getAssetByValue(Double assetValue);
	public List<Asset> getAssetByValueRange(double min, double max);
	public int deleteByAssetName(String assetName);
	public int updateAssetValueById(double assetValue, int assetID);
}
