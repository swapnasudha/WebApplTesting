package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WebTableTesting1 {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]/a
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[36]/td[1]/a		
		
		
		String Part1 = "html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String Part2 = "]/td[1]/a";
		
	  for (int i=1;i<36;i++)
		{
					
	     String TableData	= driver.findElement(By.xpath(Part1+i+Part2)).getText();
		Sleeper.sleepTight(5);
		
		System.out.println(TableData);
		
		}
				
				driver.close();
	}

}
