package day5;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting1_FindingTotalNumberOfLinks {

	public static void main(String[] args) {
		
		
		FirefoxDriver  driver = new FirefoxDriver();
		driver.get("http://Facebook.com");
		
		List<WebElement>links  = driver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
	}

}
