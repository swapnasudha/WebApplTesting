package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class NewTours_LinksTesting_ClickAllLinks_CaptureTitle_And_CurrentURL {

	private static final String Title = null;

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			System.out.println(links.get(i).getText());
		    links.get(i).click();
		    System.out.println(driver.getTitle());
		    System.out.println(driver.getCurrentUrl());
		    Sleeper.sleepTight(5);
		    driver.navigate().back();
		    links=driver.findElements(By.tagName("a"));
		}
		    
		driver.close();
		    
		}

		
		
		
		
	}


