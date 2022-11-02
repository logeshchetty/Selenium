package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver (1).exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement login = driver.findElement(By.name("login"));
		
		String text = login.getText();
		System.out.println(text);
//		
		String attribute = login.getAttribute("name");
        System.out.println(attribute);
        
//        boolean displayed = login.isDisplayed();
//		System.out.println(displayed);
//		
//		boolean enabled = login.isEnabled();
//		System.out.println(enabled);
//		
//		boolean selected = login.isSelected();
//		System.out.println(selected);
		
		System.out.println("Login successfull");
		
		
	}

}
