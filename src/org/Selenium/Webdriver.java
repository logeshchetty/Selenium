package org.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();	
		
	     System.out.println(currentUrl);
		
	     // navigate method 
	     
	     // To 
	     
	     driver.navigate().to("https://www.instagram.com/accounts/login/");
	     
	     // back 
	     
	     driver.navigate().back();
	     
	     //forward
	     
	     driver.navigate().forward();
	     
	     // refresh
	     
	     driver.navigate().refresh();
	     
	     // close 
	     
	     driver.close();
	}

}
