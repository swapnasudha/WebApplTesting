package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_SearchForAText {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://bing.com");
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");		
		driver.findElement(By.id("sb_form_go")).click();
		driver.close();
		
		
	}

}
