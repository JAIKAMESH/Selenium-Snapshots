package com.w2a.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {

	private static FileInputStream fis;
	private static XSSFWorkbook wb;private static XSSFSheet sheet;

//	public ExcelReader(String path) throws IOException {
//		    this.path=path;
	public void Excelreader(String pathlogin) throws IOException {
		String path = pathlogin;
		fis = new FileInputStream(new File(path));
		wb = new XSSFWorkbook(fis);  sheet = wb.getSheetAt(0);
		
		int rownum = sheet.getLastRowNum();
		int columnNum;
		String s[][] = new String[2][2];

		for (int i = 1; i <= rownum; i++) {
			columnNum = sheet.getRow(i).getLastCellNum();

			for (int j = 0; j < columnNum; j++) {
			s[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
	}
}
