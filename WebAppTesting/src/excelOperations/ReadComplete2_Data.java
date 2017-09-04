package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadComplete2_Data {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Swapna.xlsx");
		XSSFWorkbook WB = new XSSFWorkbook(file);
		XSSFSheet WS =WB.getSheet("Sheet1");
		int Rowcount = WS.getLastRowNum();
		
			for(int i=0;i<=Rowcount;i++)
				
			{
				Row r =WS.getRow(i);
				
				int cellcount =r.getLastCellNum();
			
					for(int j=0;j<cellcount;j++)
					{
						Cell c = r.getCell(j);
						
						String Data = c.getStringCellValue();
						System.out.print(Data +"   ");
					}
					System.out.println();
					
				}
				
		}
		
	}


