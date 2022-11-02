package com.Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.util.thread.ThreadClassLoaderScope;


public class Robot_1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\LogeshwaranV\\\\eclipse-workspace\\\\Selenium_1\\\\Driver\\\\chromedriver (1).exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(10000);
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement Women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Women).build().perform();
		ac.contextClick(Women).build().perform();
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println("New tab is Opened");
		
		Thread.sleep(3000);
		
		WebElement Dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		
		Actions ac1 = new Actions(driver);
		
		ac1.moveToElement(Dress).build().perform();
		ac1.contextClick(Dress).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
    	}

}
