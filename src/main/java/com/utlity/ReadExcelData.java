package com.utlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static String readParticularData(int rowValue, int coloumValue, String sheetName) {
		String data = null;
		try {
			File file = new File("D:\\premium IPT DAY-5 DATA DRIVEN/data driven local.xlsx");

			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowValue);
			Cell cell = row.getCell(coloumValue);
			// DataFormatter
			DataFormatter dataFormat = new DataFormatter();
			data = dataFormat.formatCellValue(cell);
			// System.out.println(data);

		}

		catch (Exception e) {
			e.fillInStackTrace();
		}
		return data;
	}

	public static void writeData(int rowVlaue, int coloumValue, String cellValue) {

		try {
			File file = new File("D:\\\\premium IPT DAY-5 DATA DRIVEN/data driven local.xlsx");
			FileInputStream fileinput = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(fileinput);
			// book.createSheet("stars").createRow(0).createCell(0).setCellValue("money pechu");
			book.getSheet("stars").createRow(rowVlaue).createCell(coloumValue).setCellValue(cellValue);
			FileOutputStream fileoutput = new FileOutputStream(file);
			book.write(fileoutput);
			book.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}



}
