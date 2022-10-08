package com.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Multiple_Data {

	public static void main(String[] args) throws IOException {

//		File f = new File("C:\\Users\\elcot\\eclipse-workspace\\MavenProject\\Excel\\DataDriven.xlsx");

		String f = "C:\\Users\\elcot\\Desktop\\DataDriven.xlsx";
		
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		int lastRowNum = sheetAt.getLastRowNum();
		
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		System.out.println("Inclusive of header :" + physicalNumberOfRows);

		System.out.println("Num of row is: " + lastRowNum);

		short lastCellNum = sheetAt.getRow(0).getLastCellNum();

		System.out.println("Num of cell is: " + lastCellNum);

		for (int i = 1; i <= lastRowNum; i++) {
			Row row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				Cell cell = row.getCell(j);

				DataFormatter df = new DataFormatter();

				String value = df.formatCellValue(cell);

				System.out.println(value);
			}
		}

		wb.close();
	}

}
