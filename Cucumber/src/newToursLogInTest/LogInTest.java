package newToursLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest 
{

	FirefoxDriver driver;
	@Given("^Open Firefox Browser and navigate to NewTours$")
	public void Open_Firefox_Browser_and_navigate_to_NewTours() throws Throwable {
	    
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("^I enter UserName and Password and click on SignIn$")
	public void I_enter_UserName_and_Password_and_click_on_SignIn() throws Throwable 
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		
	}

	@Then("^User Successfully created$")
	public void User_Successfully_created() throws Throwable 
	{
	
		driver.close();
	}

	
	
}
