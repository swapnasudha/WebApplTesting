package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursRegistration_MultipleTestData {
	
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
	public void UserRegistration()
	{
		driver.findElementByName("firstName").sendKeys("Swapna");
		driver.findElementByName("lastName").sendKeys("Sudha");
		driver.findElementByName("phone").sendKeys("73477");
		driver.findElementById("userName").sendKeys("swa@gmail.com");
		driver.findElementByName("address1").sendKeys("ABC");
		driver.findElementByName("city").sendKeys("Hyderabad");
		driver.findElementByName("state").sendKeys("Telangana");
		driver.findElementByName("postalCode").sendKeys("5000");
		driver.findElementByName("country").sendKeys("India");
		driver.findElementById("email").sendKeys("Swapnaaaaa");
		driver.findElementByName("password").sendKeys("Swa123");
		driver.findElementByName("confirmPassword").sendKeys("Swa123");
		
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.name("register")).click();
		
		
		String ExpectedUserName="Swapnaaaaa";
		  
		  String ActualUserInformation=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		  
		  if(ActualUserInformation.contains(ExpectedUserName))
		  {
		   System.out.println("User Registered Successfully -- PASS");
		  }
		  else
		  {
		   System.out.println("User Not Registered Successfully -- FAIL");
		  }
		  
		 }
		
	
	
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
	
	
	
	}
	

