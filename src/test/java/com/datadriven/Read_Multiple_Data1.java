package com.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Multiple_Data1 {

	private static void Multiple_Data() throws IOException {

		String p = "C:\\Users\\elcot\\Desktop\\DataDriven.xlsx";

		FileInputStream fis = new FileInputStream(p);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheetAt = wb.getSheetAt(0);

		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();

		System.out.println("Header Row is :" + physicalNumberOfRows);

		for (int i = 1; i < physicalNumberOfRows; i++) {

			XSSFRow row = sheetAt.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < physicalNumberOfCells; j++) {

				XSSFCell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();

					System.out.println(value);

				}

				else if (cellType.equals(CellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();

					int data = (int) numericCellValue;

					System.out.println(data);
				}

			}
			wb.close();
		}

	}

	public static void main(String[] args) throws IOException {

		Multiple_Data();

	}

}
