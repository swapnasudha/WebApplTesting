package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_HomePage_LinksTesting {
	//private static final String Rowcount = null;
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	 {
	  driver = new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com");
	  
	  driver.manage().window().maximize();
	 }
	  
	 
	@Test
	public void LinksTesting() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium Material\\Tesrlinkdata.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(file);
		XSSFSheet ws    = wb.getSheet("Sheet1");
	int RowCount   = ws.getLastRowNum();
	
	for(int i=1;i<=RowCount;i++)
	{
	
		Row r = ws.getRow(i);
		String linkName=r.getCell(0).getStringCellValue();
		driver.findElement(By.linkText(linkName)).click();
		String ActualUrl=driver.getCurrentUrl();
		   r.createCell(2).setCellValue(ActualUrl);
		 		   {
		   
		   if(ActualUrl.contains(r.getCell(1).getStringCellValue()))		     
		   {
			    r.createCell(3).setCellValue("URL Matched- PASS");
			    
			   }
			   else
			   {
			    r.createCell(3).setCellValue("URL not Matched - FAIL");
			   }
		   
		  
		   
		   driver.navigate().back();
		   
		   FileOutputStream file1 = new FileOutputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium Material\\RestTestlinkdata.xlsx");
	
	wb.write(file1);
	
	}
	}
	}
	@AfterTest
	public void TearDown()
	{
	
	driver.close();
	
	
	

	}

}
