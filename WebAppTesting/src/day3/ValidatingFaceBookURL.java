package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingFaceBookURL {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	   
		driver.get("http://Facebook.com");
	    
	    driver.getTitle();
	    
	    System.out.println(driver.getTitle());
        
	    System.out.println(driver.getCurrentUrl());	
        
        String ExpectedTitle = "Facebook - Log In or Sign Up"; 
        
        String ActualTitle = driver.getTitle();
        
        if(ActualTitle.equals(ExpectedTitle))
        {
        	System.out.println("The Title Matched ....Pass");
        }
        
        else
        	
        {
        	System.out.println("The title Mismatched...Fail");        	
		
				
        }
	 
     
       String ExpectedURL = "facebook.com";
       
       String ActualURL = driver.getCurrentUrl();
       
       if(ActualURL.contains(ExpectedURL))
    		   
       {
    	   System.out.println("The URL is Matched - PASS");
    	  }

       else
    		  
    	  {
    	   System.out.println("The URL is not Matched - FAIL");
    	  }
       
       
    
    	driver.close();
    	
	}
   
    	   
}	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
           	   
    		   
    		   
       
      