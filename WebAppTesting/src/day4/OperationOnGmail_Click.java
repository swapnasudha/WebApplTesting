package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OperationOnGmail_Click {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.linkText("Gmail")).click(); 
		
		WebElement link = driver.findElement(By.linkText("Gmail"));
		 link.click();
		
		
		  
	}

}
