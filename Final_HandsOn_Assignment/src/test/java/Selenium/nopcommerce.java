package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nopcommerce {
	// WAP on nopcommerce landing from home to register url 

	public static void main(String[] args) {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.nopcommerce.com/en");	
			driver.manage().window().maximize();	
			Thread.sleep(5000);
			
			WebElement Usericon = driver.findElement(By.xpath("//ul[@class='navigation-top-menu navigation-top-menu-user-actions']/li[3]"));
			WebElement Register = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu-sublist'])[6]/li[2]"));
			
			Actions action = new Actions(driver);
			
			action.moveToElement(Usericon);
			Thread.sleep(5000);
			action.click(Register).build().perform();
			Thread.sleep(5000);
			
			//driver.quit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
