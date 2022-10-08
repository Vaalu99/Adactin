package com.datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Multiple_Data_2 {

	private static void readdata() throws IOException {
         
		String p = "C:\\Users\\elcot\\Desktop\\DataDriven.xlsx";
		
		FileInputStream fis = new FileInputStream(p);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		System.out.println("Number of Rows is :" + numberOfRows);
		
		for (int i = 1; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if(cellType.equals(CellType.STRING)) {
					
					String stringCellValue = cell.getStringCellValue();
					
					System.out.println(stringCellValue);
					
				}
				
				else if (cellType.equals(CellType.NUMERIC)) {
					
					double numericCellValue = cell.getNumericCellValue();
					
					int data = (int) numericCellValue;
					
					System.out.println(data);
					
				}
				
			}
			
			
			
		}	
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		readdata();
	}
}
