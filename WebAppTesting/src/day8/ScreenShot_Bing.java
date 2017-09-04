package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ScreenShot_Bing 
{
 public static void main(String[] args) throws IOException, InterruptedException 
 {
  
  FirefoxDriver driver = new FirefoxDriver();
  driver.get("http://bing.com");
  
  // Thread.sleep(10000);

  System.out.println(driver.getCurrentUrl());
  System.out.println(driver.getTitle());
  
  File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(srcFile,new File("C:\\Users\\IBM_ADMIN\\Desktop\\Bing.png"));
		 driver.close();
		
	}

}
