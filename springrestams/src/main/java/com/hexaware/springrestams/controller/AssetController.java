package com.hexaware.springrestams.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hexaware.springrestams.entity.Asset;
import com.hexaware.springrestams.service.IAssetService;

@RestController
@RequestMapping("/api/asset")
public class AssetController {
	@Autowired
	IAssetService service;
	Logger logger = LoggerFactory.getLogger(AssetController.class);
	@PostMapping("/add")
    public Asset addAsset(@RequestBody Asset asset) {
		logger.info("Asset added successfully!!");
        return service.addAsset(asset);
    }

    @PutMapping("/update")
    public Asset updateAsset(@RequestBody Asset asset) {
    	logger.info("Asset updated successfully!!");
        return service.updateAsset(asset);
        
    }

    @DeleteMapping("/delete/{assetId}")
    public String deleteAsset(@PathVariable  int assetId) {

        service.deleteAsset(assetId);
        logger.warn("Asset details removed!!!");

        return "Asset: "+assetId+" Deleted: ";
    }

    @GetMapping("/getbyid/{assetId}")
    public Asset getAssetById(@PathVariable int assetId) {

        return service.getAssetById(assetId);
    }

    @GetMapping("/getall")
    public List<Asset> getAllAsset(){
    	logger.info("All asset details returned in the list!!!");
        return service.getAllAsset();
    }
    
    @GetMapping("/getbyvaluesorted")
    public List<Asset> getAllAssetSorted(){

       return service.getAllAssetSorted();
    }
    @GetMapping("/getbyname/{assetName}")
    public List<Asset> getAssetByName(@PathVariable String assetName){

        return service.getAssetByName(assetName);
    }
    
    @GetMapping("/getbyvalue/{assetValue}")
    public List<Asset> getAssetByValue(@PathVariable Double assetValue){

        return service.getAssetByValue(assetValue);
    }
    
    @GetMapping("/getbyvaluerange/{min}/{max}")
    public List<Asset> getAssetByValueRange(@PathVariable Double min, @PathVariable Double max){

        return service.getAssetByValueRange(min, max);
    }
    @DeleteMapping("/deletebyassetname/{assetName}")
    public String deleteByAssetName(@PathVariable String assetName) {

    int count = service.deleteByAssetName(assetName);

    return count + " record deleted";

    }
    @PutMapping("/updatevalue/{assetValue}/{assetID}")
    public int updateAssetValueById(@PathVariable double assetValue, @PathVariable int assetID) {

        return service.updateAssetValueById(assetValue, assetID);
    }
    
}
