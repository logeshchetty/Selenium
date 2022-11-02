package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver.exe");

	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='username']")); 
		
		System.out.println("Done");
		
		
		
		
		
	}
	

}
