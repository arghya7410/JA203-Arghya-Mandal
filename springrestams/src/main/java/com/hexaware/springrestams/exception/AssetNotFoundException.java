package com.hexaware.springrestams.exception;

public class AssetNotFoundException extends RuntimeException {
	public AssetNotFoundException(String message) {
        super(message);
    }
}
