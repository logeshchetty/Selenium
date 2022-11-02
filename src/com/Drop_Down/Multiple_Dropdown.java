package com.Drop_Down;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Iterators;

public class Multiple_Dropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver (1).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement Multiple = driver.findElement(By.id("superheros"));
		
		Select s = new Select(Multiple);
		
		s.selectByValue("am");
		s.selectByValue("aq");
		s.selectByValue("ta");
		s.selectByValue("ca");
		s.selectByValue("ds");
		
	Iterator<WebElement>iterator = s.getAllSelectedOptions().iterator();
	
	while(iterator.hasNext())
	{
		System.out.println(iterator.next().getText());
	}
	
	
	}}