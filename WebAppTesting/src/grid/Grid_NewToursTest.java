package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid_NewToursTest {
	
	@Parameters("Browser")
	
	
	@Test
	
	public void NewToursLaunch(String b) throws MalformedURLException
	{
		
       System.out.println(b);
		
		DesiredCapabilities cap=null;
		

		if(b.equals("firefox"))
		{
			cap= DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		
		else
			if(b.equals("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.ANY);
			}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.10.134:4444/wd/hub"),cap);
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	
	

}
