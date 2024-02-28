package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderDemo {
	
	public static void main(String[] args) throws IOException {
		String filepath="C:\\Users\\Gowtham Krishna\\eclipse-workspace2021-06\\KAutom"
				+ "ationMvn\\src\\test\\resources\\env_Properties";
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("platform"));
	}

}
