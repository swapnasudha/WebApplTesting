package packagemouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Wipro_MouseHoverOpertaion_Consulting {
	public static void main(String[] args) {
		
		FirefoxDriver webdriver  = new FirefoxDriver();
		webdriver.get("http://wipro.com");
		webdriver.manage().window().maximize();
		Actions act = new Actions(webdriver);
		WebElement Services = webdriver.findElement(By.xpath(".//*[@id='menu-item-43']/a/span"));
		act.moveToElement(Services).perform();
		webdriver.findElementByXPath(".//*[@id='menu-item-50']").click();
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
		
		webdriver.close();
		
		

		
		
		
		
	}

}
