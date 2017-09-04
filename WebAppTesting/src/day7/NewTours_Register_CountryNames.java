package day7;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryNames {
	
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com");
	 driver.findElement(By.linkText("REGISTER")).click();
	 WebElement Country= driver.findElement(By.name("country"));
	  
	  List<WebElement>CountryName=Country.findElements(By.tagName("option"));
	  
	  System.out.println(CountryName.size());
	  
	  for(int i=0;i<CountryName.size();i++)
	  {
		  System.out.println(CountryName.get(i).getText());
	  }
	driver.close();
		
	}

}
