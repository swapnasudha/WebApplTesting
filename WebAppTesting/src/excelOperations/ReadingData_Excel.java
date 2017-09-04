package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData_Excel 
{
	public static void main(String[] args) throws IOException

	{
	  FileInputStream file =  new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Swapna.xlsx");
	  XSSFWorkbook wb   = new XSSFWorkbook(file);
	  XSSFSheet ws     = wb.getSheet("sheet2");
	  Row r = ws.getRow(0);
	  Cell c = r.getCell(0);

	  
	String Data = c.getStringCellValue();
	  
	  System.out.println(Data);
	  
	  
	
	  
	  
	}
}