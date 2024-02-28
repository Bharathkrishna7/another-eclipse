package com.LoginPageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BasePages.TestBase;
import com.LoginPage.GitLoginPage;
import com.LoginPage.GitSignOutPage;

public class GitLoginTest extends TestBase {


	GitLoginPage lp;
	GitSignOutPage sp;
	
	public GitLoginTest() {
		super();
	}
	

	@BeforeMethod()
	public void setup() {
		initialization();
		lp = new GitLoginPage();
		sp = new GitSignOutPage();
		
	}

	@Test(description = "verify login with valid credentials", priority = 1)
	public void validLogin() {
      lp.gitlogin(prop.getProperty("valid_email"),prop.getProperty("valid_pass"));

	}

/*	@Test(description = "verify login with empty credentials", priority = 2)
	public void EmptyLogin() {
		lp.gitlogin("", "");

	}*/

	@AfterMethod()
	public void Aftermethod() {
		try {
			sp.click();
			sp.outbutton();
		} catch (Exception e) {

		}

	}

}
