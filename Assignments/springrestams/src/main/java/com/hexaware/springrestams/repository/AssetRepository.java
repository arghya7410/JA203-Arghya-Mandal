package com.hexaware.springrestams.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.springrestams.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Integer> {
	List<Asset> findByAssetName(String assetName);
	List<Asset> findByAssetValueGreaterThan(Double assetValue);
	@Query("select a from Asset a where a.assetValue Between ?1 and ?2")
	List<Asset> getByAssetValueRange(double min, double max);
	@Modifying
	@Query("delete from Asset a where a.assetName =?1")
	int deleteByAssetName(String assetName);
	
	@Modifying
	@Query("update Asset a set a.assetValue = :value where a.assetID = :id")
	int updateAssetValueById(double value, int id);

}
