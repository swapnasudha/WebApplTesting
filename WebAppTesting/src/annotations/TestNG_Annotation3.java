package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation3 {

	@BeforeMethod 
	public void BrowserLaunch()
	{
		System.out.println("Launch the browser and navigate to Application");
	}
	
	@Test
	public void ApplicationLogin()
	{
		System.out.println("Application Login");
		
	}
	
	@Test
	public void Inbox()
	{
		System.out.println("Inbox Application Testing");
	}
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("Close the Application");
	}


}
