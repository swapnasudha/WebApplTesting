package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipKart_Search_Dell {

	public static void main(String[] args) {
		
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	
	System.out.println( driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("Dell");
	driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button")).click();
List<WebElement>Links	= driver.findElementsByTagName("a");
System.out.println( Links.size());
	
	driver.close();
	}

}
