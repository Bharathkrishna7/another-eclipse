package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	Properties input;
	
	public void readconfig() {
		String filepath=IConstants.env_path;
		File file=new File(filepath);
		FileInputStream fis;
	
	    prop=new Properties();
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void readinput() {
		String filepath=IConstants.input_path;
		File file=new File(filepath);
		FileInputStream fis;
	
	    input=new Properties();
		try {
			fis = new FileInputStream(file);
			input.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public String getbrowser() {
		return prop.getProperty("browser");
		}
	public String geturl() {
		return prop.getProperty("url");
	}
	public String getvalidmail() {
		return input.getProperty("valid_email");
	}
	public String getinvalidmail() {
		return input.getProperty("valid_pass");
	}
	
	
	

}
