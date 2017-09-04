package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL_FaceBook {

	public static void main(String[] args) {
		
		FirefoxDriver Driver = new FirefoxDriver();
		
		Driver.navigate().to("http://Facebook.com");
		Driver.getTitle();
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		Driver.close();
		

	}

}
