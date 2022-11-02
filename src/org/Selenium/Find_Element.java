package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("8489577364");
		
        WebElement password = driver.findElement(By.id("pass"));
	   password.sendKeys("Logesh@3298");
	   
	   WebElement login = driver.findElement(By.name("login"));
   login.click();
	   
	   System.out.println("Login is completed");
		
		
	}

}
