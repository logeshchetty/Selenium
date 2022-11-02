package com.Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement Single = driver.findElement(By.id("fruits"));
		
		Select s = new Select(Single);
		
		s.selectByIndex(2);
		s.selectByValue("3");
		s.selectByVisibleText("Apple");
		



	}

}
