package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_FaceBook {

	public static void main(String[] args) {
	
		FirefoxDriver Driver = new FirefoxDriver();
		
		Driver.navigate().to("http://facebook.com");
		Driver.getTitle();
		System.out.println(Driver.getTitle());
		
      Driver.close();
	
	}

}
