package com.MouseInterractionTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LoginPage.BaseTest;
import com.LoginPage.GitLoginPage;
import com.LoginPage.GitSignOutPage;

import utils.ConfigReader;

public class GitLoginTest extends BaseTest {


	GitLoginPage lp;
	GitSignOutPage sp;
	ConfigReader cfgreader;

	@BeforeMethod()
	public void beforemethod() {
		lp = new GitLoginPage(driver);
		sp = new GitSignOutPage(driver);
		cfgreader=new ConfigReader();
	}

	@Test(description = "verify login with valid credentials", priority = 1)
	public void validLogin() {
		lp.gitlogin(cfgreader.getvalidmail(), cfgreader.getinvalidmail());

	}

	@Test(description = "verify login with empty credentials", priority = 2)
	public void EmptyLogin() {
		lp.gitlogin("", "");

	}

	@AfterMethod()
	public void Aftermethod() {
		try {
			sp.click();
			sp.outbutton();
		} catch (Exception e) {

		}

	}

}
