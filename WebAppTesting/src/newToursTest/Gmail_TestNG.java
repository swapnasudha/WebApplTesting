package newToursTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Gmail_TestNG {
	
	FirefoxDriver driver;
	@BeforeTest 
	public void setup()
	{
   driver = new FirefoxDriver();
    driver.get("http://gmail.com");
    driver.manage().window().maximize();
    
}
@Test
public void GmailLinkSize()
{
List<WebElement>Link=driver.findElements(By.tagName("a"));
System.out.println(Link.size());
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

for(int i=0;i<Link.size();i++)
{
System.out.println(Link.get(i).getText());
}	
	
}




@AfterTest
public void Teardown()
{
	
	driver.close();
	
	
}
}