package drapAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_JQuery {

	public static void main(String[] args) {
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		 Actions at = new Actions(driver);
		// driver.switchTo().frame(0);
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target =driver.findElement(By.id("droppable"));
		
		 at.dragAndDrop(Source, Target).perform(); 
		  
		  driver.close();
		  

	}

}
