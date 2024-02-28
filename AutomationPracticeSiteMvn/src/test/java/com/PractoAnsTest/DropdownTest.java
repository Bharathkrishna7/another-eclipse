package com.PractoAnsTest;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BasePages.TestBase;
import com.pracTofindAns.Dropdown;

public class DropdownTest extends TestBase {
	Dropdown dd;
	//Screenshots sh;
	public DropdownTest() {
		super();
	}
	@BeforeMethod()
	public void setup() {
		initialization();
		dd = new Dropdown();
	//	sh=new Screenshots();
	}
	@Test()
	public void register() throws IOException {
		dd.ddownS();
	//	Screenshots.takeScreenshot("skills");
		//dd.ddownC();
		//dd.ddownC1();
	//dd.Language(prop.getProperty("Languages"));
		//dd.ddownDOB();
	}
	

}
