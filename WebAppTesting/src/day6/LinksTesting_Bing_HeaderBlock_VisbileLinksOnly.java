package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting_Bing_HeaderBlock_VisbileLinksOnly {

	public static void main(String[] args) {
		
		
FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://bing.com");
		
  WebElement HeaderBlock = driver.findElement(By.id("sc_hdu"));	
 List<WebElement>Headerlinks = HeaderBlock.findElements(By.tagName("a"));
 
 System.out.println(Headerlinks.size());
 
 for(int i=0;i<Headerlinks.size();i++)
 {
	 if(Headerlinks.get(i).isDisplayed())
	 {
	 System.out.println(Headerlinks.get(i).getText());
 }

	}
 driver.close();
 
	}
}