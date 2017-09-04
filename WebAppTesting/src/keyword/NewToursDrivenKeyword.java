package keyword;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursDrivenKeyword {
	
	FirefoxDriver driver;
	 
	 @BeforeTest
	 public void setUp()
	 {
	  driver = new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com");
	  
	  driver.manage().window().maximize();
	 }
	 
	 @Test
	 public void LogInTest() throws IOException
	 {
		
		  FileInputStream file1 = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium Material\\Keywordlogin.xlsx");
		  XSSFWorkbook wb = new XSSFWorkbook(file1);
		  XSSFSheet ws = wb.getSheet("Sheet1");
		  int Rowcount = ws.getLastRowNum();
 FileInputStream file = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\SeleniumSwapna\\WebApplicationTesting\\src\\propertiesNewTours\\NewToursLogIn.properties");
		  
		  Properties pr = new Properties();
		  pr.load(file);
		 
			  for(int i=0;i<=Rowcount;i++)
				  {
				  Row r = ws.getRow(i);
				  driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys( r.getCell(0).getStringCellValue());
				  driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(r.getCell(1).getStringCellValue());
				  driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
                 System.out.println(driver.getCurrentUrl());
                 Sleeper.sleepTight(5);
				  }
		 driver.navigate().back();
	 }
	 
	 
	 
	 @AfterTest
	 public void TearDown()
	 {
		 driver.close();
	 }
}