package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant {
	// add all code to handle data from/to the testdata excel file or properties file
	// made this method static so pom classes can access it using classname.methodname
	
	public static String getCellValue(int row, int cell) throws IOException {
		FileInputStream fis = new FileInputStream(excel_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String cellValue = wb.getSheet(excel_sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
}
