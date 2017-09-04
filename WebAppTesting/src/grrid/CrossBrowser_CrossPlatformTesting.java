package grrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_CrossPlatformTesting 
{

	@Parameters("Browser")
	
	@Test
	public void FaceBookLaunch(String b) throws MalformedURLException
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
		
		driver.get("http://facebook.com");
				
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
		
	}
	
	
}
