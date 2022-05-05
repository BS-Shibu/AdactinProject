package com.PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader 
{
	public static Properties p;
	public ConfigurationReader() throws Throwable {
		File f = new File ("C:\\Users\\HP\\eclipse-workspace\\AdactinHotel\\src\\main\\java\\com\\PropertyFile\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);	
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getccnum() {
		String ccnum = p.getProperty("ccnum");
		return ccnum;
	}
}
