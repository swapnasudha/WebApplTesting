package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingCompletData_Excel {
	
	
		public static void main(String[] args) throws IOException
		
		{
			
			FileInputStream file = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Swapna.xlsx");
			
	     XSSFWorkbook wb = new XSSFWorkbook(file);
	     XSSFSheet ws = wb.getSheet("Sheet1");
	     
	     int RowCount = ws.getLastRowNum();
	     
	     for(int i=0;i<=RowCount;i++)
	     {
	      Row r = ws.getRow(i);
	      
	      int ColCount= r.getLastCellNum();
	      
	      for(int j=0;j<ColCount;j++)
	      {
	       Cell c = r.getCell(j);
	       
	       String Data= c.getStringCellValue();
	       
	       System.out.print(Data+"   ");
	      }
	      
	      System.out.println();
			}
		}
	     
	     }
	     
	     


