package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HandlingAlert_Tsrtc {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchBtn")).click();
		Alert alt = driver.switchTo().alert();
		
		 Sleeper.sleepTightInSeconds(5);
		 System.out.println(alt.getText());
		 alt.accept();
		 driver.close();
		
	}

}
