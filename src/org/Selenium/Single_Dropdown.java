package org.Selenium;

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
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		//selenium.Invalidselector Exception -- > select Exception 
		
		WebElement Single_dropdown = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		Select s = new Select(Single_dropdown);
		
		s.selectByValue("3");
		
		System.out.println("Done");
		
		
	}

}
