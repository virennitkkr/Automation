package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;

	private final String propertyFilePath = "config\\configration.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));

			properties = new Properties();

			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String driverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public String url() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL not specified in the Configuration.properties file.");
	}

	public String userID() {
		String userID = properties.getProperty("userID");
		if (userID != null)
			return userID;
		else {
			throw new RuntimeException("User ID not specified in the Configuration.properties file.");
		}

	}

	public String emilId() {
		String emailid = properties.getProperty("emailId");
		if (emailid != null)
			return emailid;
		else {
			throw new RuntimeException("Email ID not specified in the Configuration.properties file.");
		}

	}

	public String password() {
		String password = properties.getProperty("Password");
		if (password != null)
			return password;
		else {
			throw new RuntimeException("password not specified in the Configuration.properties file.");
		}

	}

}