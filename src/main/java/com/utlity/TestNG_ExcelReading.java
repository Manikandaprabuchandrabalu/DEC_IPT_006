package com.utlity;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestNG_ExcelReading {
	public static Object[][] getExcelData(String filePath, String sheetName) {
        Object [][] data = null;
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workBook = new XSSFWorkbook(fileInputStream)) {
            Sheet sheet = workBook.getSheet(sheetName);
            int totalRows = sheet.getLastRowNum();
            int totalCals = sheet.getRow(0).getLastCellNum();
            data = new Object[totalRows][totalCals];
            for (int i = 1; i <= totalRows; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < totalCals; j++) {
                    Cell cell = row.getCell(j);
                    data [i-1][j] = (cell == null) ? "" : cell.toString();
                }
            }
        } catch (Exception e) {
        }
        return data;
    }

}
