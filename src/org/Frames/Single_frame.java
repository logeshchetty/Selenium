package org.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver (1).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement Single_Frame = driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(Single_Frame);
		
		WebElement Single = driver.findElement(By.xpath("//input[@type='text'][1]"));
		
		Single.sendKeys("Welcome to Frame");
		
		driver.switchTo().defaultContent();
		
		
		
		// Multiple 

		WebElement Move = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		Move.click();
		
		WebElement First_Frame = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 300px;width:600px'])"));
		driver.switchTo().frame(First_Frame);
		
		WebElement Second_Frame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(Second_Frame);
		
		WebElement Input = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        Input.sendKeys("Hello");
		
        System.out.println("Done");
	}
}
