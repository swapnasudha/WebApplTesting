package facebook;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;


public class Facebook_CaptureTitle {
	
	
	@Test
	public void ApplicationLaunch()
	
	{
		//System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\iexplore.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Selenium Material\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		Sleeper.sleepTight(10);
		driver.close();
		
	}

}
