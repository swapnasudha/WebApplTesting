package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class WebTesting3_DynamicWebTable {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();	
	  
	WebElement Table= driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
	  List<WebElement>rows= Table.findElements(By.tagName("tr"));
	  for(int i=0;i<rows.size();i++)
	  {
	   List<WebElement>cols= rows.get(i).findElements(By.tagName("td"));
	   for(int j=0;j<cols.size();j++)
	   {
	    System.out.print(cols.get(j).getText()+"    ");
	   	
	   }
		 System.out.println();
	  }
  driver.close();
	

	}
}
