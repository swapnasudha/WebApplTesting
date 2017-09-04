package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursRegistration_MultipleTestData1 {
	
	
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
				
	}

	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	
	@Test(priority=2)
	 public void UserRegistration() throws IOException
	 {
		
	 
	  FileInputStream file = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium Material\\Data1.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(file);
	  XSSFSheet ws = wb.getSheet("Sheet1");
	  int RowCount= ws.getLastRowNum();
	  for(int i=0;i<=RowCount;i++)
	  {
	   Row r =ws.getRow(i);
	   driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
	   driver.findElementByName("lastName").sendKeys(r.getCell(1).getStringCellValue());
	   
	   double d = r.getCell(2).getNumericCellValue();
	   long l = (long)d;
	   String PhoneNumner=Long.toString(l);
	   
	   driver.findElement(By.name("phone")).sendKeys(PhoneNumner);
	   driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
	   driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
	   driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
	   driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
	   
	   double n= r.getCell(7).getNumericCellValue();
	   long p= (long)n;
	   String PostalCode=Long.toString(p);
	   
	   driver.findElement(By.name("postalCode")).sendKeys(PostalCode);
	   driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
	   driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
	   driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
	   driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
	   
	   Sleeper.sleepTightInSeconds(10);
	   
	   driver.findElement(By.name("register")).click();
	   
	   String ExpectedUserName=r.getCell(9).getStringCellValue();
	   String ActualUserInformation=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	   
	   
	   if(ActualUserInformation.contains(ExpectedUserName))
	   {
	    System.out.println("User Registered Successfully -- PASS");
	    r.createCell(12).setCellValue("User Registered Successfully -- PASS");
	   }
	   else
	   {
	    System.out.println("User Not Registered Successfully -- FAIL");
	    r.createCell(12).setCellValue("User Not Registered Successfully -- FAIL");
	   }
	   
	   driver.navigate().back();
	   FileOutputStream file1 = new FileOutputStream("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium Material\\ResultData1.xlsx");   
	  wb.write(file1);
	  
	   
	   
}
	 }
	
	@AfterTest
	public void teardown()
	
	{
		driver.close();
	}
}
	
	
	

	
	
