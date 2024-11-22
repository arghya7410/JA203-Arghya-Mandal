package com.hexaware.springrestams.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.hexaware.springrestams.entity.Asset;
import com.hexaware.springrestams.exception.AssetNotFoundException;
import com.hexaware.springrestams.repository.AssetRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class AssetServiceImp implements IAssetService {
	@Autowired
	AssetRepository repo;
	Logger logger = LoggerFactory.getLogger(AssetServiceImp.class);
	@Override
	public Asset addAsset(Asset asset) {
		logger.info("Asset added!");
		return repo.save(asset);
	}

	@Override
	public Asset updateAsset(Asset asset) {
		logger.info("Asset updated!");
		return repo.save(asset);
	}

	@Override
	public void deleteAsset(int assetId) {
		logger.warn("Asset deleted!");
		repo.deleteById(assetId);
	}

	@Override
	public Asset getAssetById(int assetId) {
		// TODO Auto-generated method stub
		return repo.findById(assetId).orElseThrow(() -> new AssetNotFoundException("Asset not found with ID: " + assetId));
	}

	@Override
	public List<Asset> getAllAsset() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Asset> getAllAssetSorted() {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by(Order.desc("assetValue")));
	}

	@Override
	public List<Asset> getAssetByName(String assetName) {
		// TODO Auto-generated method stub
		return repo.findByAssetName(assetName);
	}

	@Override
	public List<Asset> getAssetByValue(Double assetValue) {
		// TODO Auto-generated method stub
		return repo.findByAssetValueGreaterThan(assetValue);
	}

	@Override
	public List<Asset> getAssetByValueRange(double min, double max) {
		// TODO Auto-generated method stub
		return repo.getByAssetValueRange(min, max);
	}

	@Override
	public int deleteByAssetName(String assetName) {
		// TODO Auto-generated method stub
		return repo.deleteByAssetName(assetName);
	}

	@Override
	public int updateAssetValueById(double assetValue, int assetID) {
		// TODO Auto-generated method stub
		return repo.updateAssetValueById(assetValue, assetID);
	}

}
