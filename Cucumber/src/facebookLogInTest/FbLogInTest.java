package facebookLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogInTest {
	
	FirefoxDriver driver;
	
	@Given("^open a firefox and start application$")
	public void open_a_firefox_and_start_application() throws Throwable {
		
	  driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  
	}

	@When("^I enter valid useername and password$")
	public void I_enter_valid_useername_and_password() throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys("gandhisatvik@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("gandhisatvik@gmail.com");
		driver.findElement(By.id("u_0_0")).click();
		
	    
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("u_0_0")).click();
	    
	}



}
