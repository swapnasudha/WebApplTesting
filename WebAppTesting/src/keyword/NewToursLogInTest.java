package keyword;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest {
	


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
	  FileInputStream file = new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\SeleniumSwapna\\WebApplicationTesting\\src\\propertiesNewTours\\NewToursLogIn.properties");
	  
	  Properties pr = new Properties();
	  
	  pr.load(file);
	  
	  driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
	  driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
	  driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
	  
	  
	 }
	 
	 @AfterTest
	 public void tearDown()
	 {
	  driver.close();
	 }
	 
	 
	 
	}


