package com.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver (1).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(Women).build().perform();
		
		WebElement Dress = driver.findElement(By.xpath("//a[@title='Evening Dresses']"));
		
		Dress.click();
		
		System.out.println("Done");
		
		
		
	}

}
