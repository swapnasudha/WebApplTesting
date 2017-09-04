package annotations;

import org.testng.annotations.Test;

public class TestNG_Annotation1 {
	
	
	@Test(priority=1)
	public void GmailLaunch()
	{
		System.out.println("Gmail Application Launch");
	}

	@Test(priority=2)
	public void LogIn()
	{
		
		System.out.println("Gmail Application Login");
	}
	@Test(priority=3)
	public void ApplicationInbox()
	{
		System.out.println("cheking the inbox functionality");
		
	}
	
	@Test(priority=4)
	public void ComposeMail()
	{
		System.out.println("Compose Mail-Gmail");
	}
	
}
