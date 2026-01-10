package com.skillio.exceptions;

public class InvalidLocatorError extends Error {
	private String locatorType;
	public InvalidLocatorError(String locatorType) {
		this.locatorType = locatorType;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return locatorType;
	}
}
