package com.skillio.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropHandler {

	public String get(String key, String filePath) throws IOException {
		FileInputStream fis = null;
		String value = null;
		fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		value = prop.getProperty(key);
		
		return value;
	}
}
