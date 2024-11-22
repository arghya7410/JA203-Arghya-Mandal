package com.hexaware.springrestams.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestams.entity.Asset;
@SpringBootTest
class AssetControllerTest {
	@Autowired
	RestTemplate restTemplate;
	@Test
	@Disabled
	void testAddAsset() {
		Asset asset = new Asset(107, "Another new asset", 50000);
		ResponseEntity<Asset> response = restTemplate.postForEntity("http://localhost:8080/api/asset/add", asset, Asset.class);
		Asset a1 = response.getBody();
		assertEquals(107, a1.getAssetID());
	}

	@Test
	@Disabled
	void testUpdateAsset() {
		Asset asset = new Asset(107, "Another new asset", 60000);
		restTemplate.put("http://localhost:8080/api/asset/update", asset, Asset.class);
		ResponseEntity<Asset> response = restTemplate.getForEntity("http://localhost:8080/api/asset/getbyid/"+107, Asset.class);
		Asset a1 = response.getBody();
		assertEquals(60000, a1.getAssetValue());
		
	}

	@Test
	void testDeleteAsset() {
		restTemplate.delete("http://localhost:8080/api/asset/delete/"+107);
		try {
		ResponseEntity<Asset> response = restTemplate.getForEntity("http://localhost:8080/api/asset/getbyid/"+107, Asset.class);
		} catch (HttpClientErrorException ex) {
			assertEquals(HttpStatus.NOT_FOUND, ex.getStatusCode());
		}
		
	}

	@Test
	void testGetAssetById() {
		Asset asset = restTemplate.getForObject("http://localhost:8080/api/asset/getbyid/"+101, Asset.class);
		assertNotNull(asset);
	}

	@Test
	void testGetAssetByName() {
		
	}

	@Test
	void testGetAssetByValue() {
		
	}

}
