package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelComeMercuryTours {
	
	
	
	// WebElement register=driver.findElement(By.linkText="REGISTER");
	 
	 @FindBy(linkText="REGISTER")
	 WebElement register;
	 
	 public void Register()
	 {
	  register.click();
	  
	 }
	 
	@FindBy(linkText="SUPPORT")
	WebElement support;
	public void Support()
	{ 
		 support.click();                 
	}
	
	
	 @FindBy(name="userName")
	 WebElement UserName;
	 
	 @FindBy(name="password")
	 WebElement Password;
	 
	 @FindBy(name="login")
	 WebElement SignIn;
	public void  FindAFlight(String u,String p)
	{
		
		UserName.sendKeys(u);
		  Password.sendKeys(p);
		  SignIn.click();
	}
	 
	 
	@FindBy(linkText="CONTACT")
	WebElement contact;
	public void Contact()
	{
		contact.click();
		
	}
	 
	 
}
	

