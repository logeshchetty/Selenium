package com.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver (1).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions ac = new Actions(driver);
		
		ac.clickAndHold(drag).build().perform();
	
		
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		ac.release(drop).build().perform();
		
		System.out.println("Done");
	}
}
