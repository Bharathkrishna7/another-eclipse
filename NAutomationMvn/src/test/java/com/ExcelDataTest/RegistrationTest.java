package com.ExcelDataTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePages.TestBase;
import com.ExcelDataPages.Registrationpage;
import com.Utils.TestUtil;

public class RegistrationTest extends TestBase {

	Registrationpage rg;
	
	String sheetname="RegistrationTest";

	public RegistrationTest() {
		super();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		rg = new Registrationpage();
	}
	@DataProvider()
	public Object[][] getexceldata() {
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	@Test(dataProvider = "getexceldata")
	public void regfld(String FirstName,String LastName,String Email,String PhoneNumber) {
		//rg.Regtxt("bhar", "kris", "bhara@gmail.com", "7697068");
		rg.Regtxt(FirstName, LastName, Email, PhoneNumber);
	}
	@AfterMethod()
	public void refresh() {
		driver.quit();
	}
}
