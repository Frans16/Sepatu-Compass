package org.antikode.fileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReader {
	
	private static final String PROPERTIES_FILE = "src\\test\\config\\data.properties";
	
	private static String getProperty(String key) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(PROPERTIES_FILE));
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
	
	public static String getUrl() {
		return getProperty("pageUrl");
	}
	 
	public static String getProductName() {
		return getProperty("productName");
	}
	
	public static String getSize() {
		return getProperty("size");
	}
	
	public static String getAddressLabel() {
		return getProperty("addressLabel");
	}
	
	public static String getCountry() {
		return getProperty("country");
	}
	
	public static String getRecipientName() {
		return getProperty("recipientName");
	}

	public static String getRecipientNumber() {
		return getProperty("recipientNumber");
	}
	 
	public static String getAddress() {
		return getProperty("address");
	}
	
	public static String getCity() {
		return getProperty("city");
	}
	
	public static String getPostalCode() {
		return getProperty("postCode");
	}
	
	
	public static String getName() {
		return getProperty("name");
	}

	public static String getEmail() {
		return getProperty("email");
	}
	 
	public static String getMobileNumber() {
		return getProperty("mobileNumber");
	}
	
	public static String getDateOfBirth() {
		return getProperty("dateOfBirth");
	}
	
	public static String getPassword() {
		return getProperty("password");
	}
	
	
}
