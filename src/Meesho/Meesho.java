package Meesho;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Collections2;

import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;

public class Meesho {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LogeshwaranV\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
	List<Integer> priceList = new ArrayList<Integer>();
		Integer minprice;
		
		
		driver.get("https://meesho.com/mobiles-and-accessories/pl/9y6n7");
		
		List<WebElement> Product_Price = driver.findElements(By.xpath("//div[@class='sc-dkzDqf ProductList__GridCol-sc-8lnc8o-0 kmfTGq ZnDzz']//h5[@font-weight='bold']"));
		
		
		 for (WebElement Price : Product_Price) {
			 
			 
			String PriceText = Price.getText();
			System.out.println(PriceText);
			
//		int min=Integer.parseInt(PriceText.replace("₹"," "));
//		priceList.add(min);
			
//				
//		}
//		  minprice = Collections.min(priceList);
//		 
//		 System.out.println(minprice);
		 
		 
		
	}

}
}

