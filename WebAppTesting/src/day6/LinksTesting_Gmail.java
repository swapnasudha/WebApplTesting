package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting_Gmail {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://gmail.com");
		
		List<WebElement>GmailHomepageLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(GmailHomepageLinks.size());
		
		for(int i=0;i<GmailHomepageLinks.size();i++)
			
		{
			System.out.println(GmailHomepageLinks.get(i).getText());
		}
		
		
		driver.close();
		
		
		
		
	}

}
