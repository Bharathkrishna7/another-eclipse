package com.RegistrationTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exceldata {
	// CODE
	// Specify file path -we specify the test data excel sheet location
@Test
public void test() throws IOException {
	File src = new File("C:/Users/Gowtham Krishna/Desktop/Exceldata/TestCaseData.xlsx");

	// Pass src as a parameter in the FileInputStream class
	FileInputStream fis=new FileInputStream(src); 

	// XSSFWorkbook class loads the complete excel workbook
	// Note: HSSFWorkbook should be used for .xls file
	// XSSFWorkbook is being used here as we have .xlsx file
	XSSFWorkbook wb = new XSSFWorkbook(fis);

	// XSSFSheet loads the specific sheet in your workbook, below we load sheet 1.
	XSSFSheet sheet = wb.getSheetAt(2);

	// Here we get data from specific row and column in excel sheet
	String data= sheet.getRow(2).getCell(1).getStringCellValue();

	// Print data in console to check
	System.out.println("Data collected is " + data);
	wb.close();
}
}
