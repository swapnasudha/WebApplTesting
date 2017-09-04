package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData_Excel {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Swapna1.xlsx");
	
	XSSFWorkbook wb = new XSSFWorkbook(file);
	
	XSSFSheet ws   =  wb.getSheet("Sheet2");
	Row r = ws.createRow(0);
	Cell c = r.createCell(0);
	
	c.setCellValue("Swapna");
	FileOutputStream file1= new FileOutputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Swapna1.xlsx");
	
	wb.write(file1);
	
	
	
	
	
	
	
	
	
	
	
	}

}
