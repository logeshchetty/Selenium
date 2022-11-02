package org.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Facebook_task {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver (1).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Screenshot\\login.png");
		
		FileUtils.copyFile(source, dest);
		
		WebElement Signup = driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]"));
		Signup.click();
		
		
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("logeshwaran");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Lastname.sendKeys("Veerichetty");
		
		WebElement Phonenumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Phonenumber.sendKeys("8489577364");
		
		WebElement Password = driver.findElement(By.id("password_step_input"));
		Password.sendKeys("abc@12345");
		
		WebElement DateofBrith = driver.findElement(By.name("birthday_day"));
		
		Select s = new Select(DateofBrith);
		
		s.selectByValue("3");
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		
		Select s1 = new Select(Month);
		
		
		s1.selectByValue("2");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		
		Select s2 = new Select(Year);
		
		s2.selectByVisibleText("1998");
		
		WebElement Sex = driver.findElement(By.xpath("//label[text()='Male']"));
		
		Sex.click();
		
		TakesScreenshot ts1 =(TakesScreenshot) driver;
		File Source = ts1.getScreenshotAs(OutputType.FILE);

		File Dest = new File("C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Screenshot\\CreateAccount.png");
		
		FileUtils.copyFile(Source, Dest);
		
		
		System.out.println("done");
		
	}

}
