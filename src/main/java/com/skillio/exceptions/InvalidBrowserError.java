package com.skillio.exceptions;

public class InvalidBrowserError extends Error {
	private String browserName;

	public InvalidBrowserError(String browserName) {
		this.browserName = browserName;
	}

	@Override
	public String getMessage() {
		return browserName;
	}
}
