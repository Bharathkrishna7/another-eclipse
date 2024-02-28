package com.pracTofindAns;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 97/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		takeScreenshot("facebook");
	}

	public static void takeScreenshot(String filename) throws IOException {
		// 1.Take ScreenShot and store it as a file format
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// 2.Now copy the screenshot to the desired location using copyfile method
		FileUtils.copyFile(file, new File("C:\\Users\\Gowtham Krishna\\eclipse-workspace2021-06\\Automati"
				+ "onPracticeSiteMvn\\src\\main\\java\\ScreenShoots\\" + filename + ".jpg"));
	}

}
