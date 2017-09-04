package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class NewToursApplication_SignIn {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorail");
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
		
		
		

	}

}
