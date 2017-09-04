package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Tsrtc_HeaderLinks_Click_Title {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		 driver.get("http://tsrtconline.in");
         WebElement HeaderBlock = driver.findElement(By.xpath("html/body/div[3]"));

         List<WebElement>HeaderLinks = HeaderBlock.findElements(By.tagName("a"));

          System.out.println(HeaderLinks.size());

for(int i=0;i<HeaderLinks.size();i++)
	
{
	System.out.println(HeaderLinks.get(i).getText());
	HeaderLinks.get(i).click();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().back();
	   
	   Sleeper.sleepTightInSeconds(5);
	   
	   HeaderBlock =driver.findElement(By.xpath("html/body/div[3]"));
	   HeaderLinks = HeaderBlock.findElements(By.tagName("a"));
	     
	  }
	  
	  driver.close();
	  

		 
		

	}

}
