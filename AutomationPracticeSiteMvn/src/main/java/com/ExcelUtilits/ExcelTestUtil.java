package com.ExcelUtilits;

import java.util.ArrayList;

public class ExcelTestUtil {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try { // "Object[]" it's an object array which can store different types of values.
	reader = new Xls_Reader(System.getProperty("C:/Users/Gowtham Krishna/Desktop/Exceldata/TestCaseData.xlsx"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("Registration"); rowNum++) {

			String FirstName = reader.getCellData("Registration", "FirstName", rowNum);
			String laststname = reader.getCellData("Registration", "LastName", rowNum);
			String mail = reader.getCellData("Registration", "Email", rowNum);
			String phonenum = reader.getCellData("Registration", "PhoneNumber", rowNum);
			String pwd = reader.getCellData("Registration", "Password", rowNum);
			String cmpwd = reader.getCellData("Registration", "ConfirmPassword", rowNum);

			Object ob[] = { FirstName, laststname, mail, phonenum, pwd, cmpwd };

			mydata.add(ob);

		}

		return mydata;
	}

}
