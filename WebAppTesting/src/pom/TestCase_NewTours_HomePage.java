package pom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase_NewTours_HomePage {
	
	@Test
	public void HomePage()
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  driver.manage().window().maximize();
		  
		  WelComeMercuryTours WMT = PageFactory.initElements(driver, WelComeMercuryTours.class);

		  WMT.Register();
		  driver.navigate().back();
		  Sleeper.sleepTight(5);
		  
		  WMT.Support();
		  driver.navigate().back();
		  Sleeper.sleepTight(5);
		  
		  WMT.Contact();
		  driver.navigate().back();
		  Sleeper.sleepTight(5);
		  
		  WMT.FindAFlight("tutorial", "tutorial");
		  driver.navigate().back();
		  Sleeper.sleepTight(5);
		  
		
		  
		  
	
	
	
	}

}
