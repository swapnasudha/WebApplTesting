package day8;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Bing_HeaderLinks_Click_ScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://bing.com");
		WebElement HeaderBlock = driver.findElement(By.id("sc_hdu"));	
		 List<WebElement>Headerlinks = HeaderBlock.findElements(By.tagName("a"));
		 
		 System.out.println(Headerlinks.size());
		 
		 for(int i=0;i<Headerlinks.size();i++)
		 {
			 if(Headerlinks.get(i).isDisplayed())
			 {
			 Sleeper.sleepTight(10);
				 System.out.println(Headerlinks.get(i).getText());
		 
			 
			 String HeaderLinkName = Headerlinks.get(i).getText();
	 
	 Headerlinks.get(i).click();
	
	 Sleeper.sleepTight(5);
	 File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(srcFile,new File("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium Material\\Bing\\"+HeaderLinkName+".png"));
	 
	 
	 driver.navigate().back();
	 HeaderBlock = driver.findElement(By.id("sc_hdu"));
	 
	 Headerlinks= HeaderBlock.findElements(By.tagName("a"));

		

 
 }
		 }
		 
		 driver.close();
 
	}
}
