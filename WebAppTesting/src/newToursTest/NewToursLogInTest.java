package newToursTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setup()
	
	{
		driver = new FirefoxDriver();
	
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	
	}
	
	@Test
	public void LogInTest()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		 driver.findElement(By.name("password")).sendKeys("tutorial");
		  driver.findElement(By.name("login")).click();
	}
	@AfterTest
	 public void TearDown()
	 {
	  driver.close();
	 }
	
	
	

}
