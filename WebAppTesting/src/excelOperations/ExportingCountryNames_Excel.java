package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.FileBackedOutputStream;

public class ExportingCountryNames_Excel {

	public static void main(String[] args) throws IOException {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();;
	List<WebElement>countryname =  driver.findElements(By.tagName("option"));

    System.out.println(countryname.size()) ;
    
	FileInputStream file = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Swapna1.xlsx");	
	XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet ws = wb.getSheet("Sheet1");
	
	
	           
	           for (int i=0; i<countryname.size();i++)
	        	   
	           {
	        	   Row r = ws.createRow(i);
	        	   Cell c =r.createCell(0);
	        	   c.setCellValue(countryname.get(i).getText());
	        	   System.out.println(countryname.get(i).getText());
	        	   FileOutputStream file2 = new FileOutputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Swapna1.xlsx");
	        	   wb.write(file2);
	
		
	}

}
}
