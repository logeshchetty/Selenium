package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_task {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LogeshwaranV\\\\eclipse-workspace\\\\Selenium_1\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement flipkart = driver.findElement(By.xpath("//input[@name = 'q']"));
		
		boolean displayed = flipkart.isDisplayed();
		
		System.out.println(displayed);
		
		boolean enabled = flipkart.isEnabled();
		System.out.println(enabled);
		
		boolean selected = flipkart.isSelected();
		System.out.println(selected);
		
	
		
	}

}
