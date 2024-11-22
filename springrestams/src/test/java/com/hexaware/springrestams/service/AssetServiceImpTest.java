package com.hexaware.springrestams.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestams.entity.Asset;
@SpringBootTest
class AssetServiceImpTest {
	@Autowired
	IAssetService service;
	

	@Test
	void testAddAsset() {
		Asset a1 = new Asset(106,"New Asset", 90000);
		Asset a2 = service.addAsset(a1);
		assertNotNull(a2);
	}
	@Test
	void testGetAssetById() {
		Asset a1 = service.getAssetById(106);
		assertEquals("New Asset", a1.getAssetName());
	}

	@Test
	void testUpdateAsset() {
		Asset a1 = new Asset(106,"New Asset", 80000);
		Asset a2 = service.updateAsset(a1);
		assertEquals(80000, a2.getAssetValue());
	}
//
//	@Test
//	void testDeleteAsset() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteByAssetName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateAssetValueById() {
//		fail("Not yet implemented");
//	}

}
