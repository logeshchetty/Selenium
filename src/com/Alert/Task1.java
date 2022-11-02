package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement Alert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		
		Alert.click();
		
		WebElement One = driver.findElement(By.xpath("(//button[@onclick='alertbox()'])"));
		
		One.click();
		
		driver.switchTo().alert().accept();
		
		// -----
		WebElement two = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		two.click();
		
		WebElement dismiss = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		
		dismiss.click();
		
		driver.switchTo().alert().dismiss();
		
		//-----
		WebElement Three = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		
		Three.click();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		
		prompt.click();
		
		driver.switchTo().alert().sendKeys("Logesh");
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		System.out.println("Done");
		
		
	}

}
