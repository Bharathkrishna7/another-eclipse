
package com.RegistrationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BasePages.TestBase;
import com.RegistrationPages.Registration;

public class Registationtest extends TestBase {

	Registration rg;

	public Registationtest() {
		super();
	}

	@BeforeMethod()
	public void setup() {
		initialization();
		rg = new Registration();
	} 

	@Test
	public void regtext() {
		rg.registrationtxt(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"),
				prop.getProperty("phone"));
		rg.radiobutton();
		rg.checkbox();
		// rg.Language(prop.getProperty("Languages"));
		rg.ddownS();
		// rg.ddownC();
		rg.ddownDOB();
		rg.pass(prop.getProperty("password"), prop.getProperty("confirmpassword"));
	}

	@Test
	public void Regtext() {
		rg.registrationtxt(prop.getProperty("faname"), prop.getProperty("laname"), prop.getProperty("Email"),
				prop.getProperty("pho"));
		rg.rbutton();
		rg.Hcheckbox();
		rg.skilldown();
		rg.ddownDOB();
		rg.pass(prop.getProperty("pswd"), prop.getProperty("confirmpswd"));

	}

	@AfterMethod()
	public void Aftermethod() {
		rg.refresh();
	}

}
