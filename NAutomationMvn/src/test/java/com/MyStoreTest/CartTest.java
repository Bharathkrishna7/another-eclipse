package com.MyStoreTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BasePages.TestBase;
import com.MyStore.CartPage;

public class CartTest extends TestBase {
	
	CartPage cp;
	
	public CartTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		cp=new CartPage();
	}
	@Test
	public void carttest(){
		cp.mycart();
	String actual=cp.verifycart();
 Assert.assertEquals(actual, "Cart 1 Produt");
	
		
	}
	
	@AfterTest
	public void Aftemethod() {
	//	driver.quit();
	}
	

}
