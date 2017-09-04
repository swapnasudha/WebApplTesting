package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation2 {
	
	
	@BeforeTest 
	public void BrowserLaunch()
	{
		System.out.println("Launch the browser and navigate to Application");
	}
	
	@Test
	public void ApplicationLogin()
	{
		System.out.println("Application Login");
	}
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("Close the Application");
	}

}
