package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Wait_types {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/signin");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("logesh@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		login.click();
		
		//Explicit wait
		
		WebElement toast = driver.findElement(By.id("toast-container"));
		wait.until(ExpectedConditions.visibilityOf(toast));
		System.out.println(toast.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(toast));
		
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		signup.click();
		
		System.out.println("Done");
		
	}
}
