package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_types {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver (1).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		//Simple alert 
		
		WebElement Simple = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		Simple.click();
		
		driver.switchTo().alert().accept();
		
		//Confirm alert
		
		WebElement Confirm = driver.findElement(By.id("confirm"));
	    Confirm.click();

	   driver.switchTo().alert().dismiss();
	
		//Prompt alert
		
		WebElement Prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
		Prompt.click();
		
		driver.switchTo().alert().sendKeys("Logesh");
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
		WebElement Modern = driver.findElement(By.xpath("//button[@id='modern']"));
		Modern.click();
		
		
	}

}
