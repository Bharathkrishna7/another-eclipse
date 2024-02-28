package com.PomStepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PomPages.MxPlayerPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MxPlayerTest { 
	WebDriver driver;
	MxPlayerPage player;
	@Given("Open Chrome with mxplayer url")
	public void open_chrome_with_mxplayer_url() {
		//System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 101/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://www.mxplayer.in/");
	   
	}
  
	@Then("close chrome browser")
	public void close_chrome_browser() {
	   driver.close();
	}

	@When("move mouse to web show element")
	public void move_mouse_to_web_show_element() {
		player=new MxPlayerPage(driver);
		player.Movetoelements();
	  
	}

	@And("print sub-data from web show element")
	public void print_sub_data_from_web_show_element() {
		player.Subelements();
		
	}

	@When("click drama from web shows element")
	public void click_drama_from_web_shows_element() {
		player.clickdrama();
	}

	@And("click thriller from web shows element")
	public void click_thriller_from_web_shows_element() {
	  player.clickthriller();
	}

	@And("click reality from web shows element")
	public void click_reality_from_web_shows_element() {
	    player.clickreality();
	}

	@And("click crime from web shows element")
	public void click_crime_from_web_shows_element() {
	  player.clickcrime();
	}

	@And("click comedy from web shows element")
	public void click_comedy_from_web_shows_element() {
	   player.clickcomedy();
	}

}
