package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ReadingDataFromExcel12 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Swapna.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet2");
		
	int	rowcount = ws.getLastRowNum();
	Sleeper.sleepTight(5);
	System.out.println("The size of the Row is"+ rowcount);
	
	for(int i=0;i<=rowcount;i++)
	{
		
		Row r =ws.getRow(i);
	int	cellcount = r.getLastCellNum();
			
		
		for (int j=0;j<cellcount;j++)
		{
			Cell c =r.getCell(j);
			
			
	
	String Data =	r.getCell(j).getStringCellValue();
	
	System.out.print(Data +"   " );
		
	}
		System.out.println();
	}
		
	}

}
