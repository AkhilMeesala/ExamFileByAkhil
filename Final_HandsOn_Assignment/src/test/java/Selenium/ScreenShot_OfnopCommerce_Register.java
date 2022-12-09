package Selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_OfnopCommerce_Register {

	public static void main(String[] args) {
		try {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");	
			driver.manage().window().maximize();	
			Thread.sleep(5000);
			
			WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
			WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
			WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
			WebElement ConfirmEmail = driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
			WebElement Username = driver.findElement(By.xpath("//input[@id='Username']"));
			WebElement check_availability_button = driver.findElement(By.xpath("//input[@id='check-availability-button']"));
			

			WebElement TimeZoneId = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
			WebElement CheckBox = driver.findElement(By.xpath("//label[@for='Newsletter']"));
			WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
			WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
			WebElement Details_CompanyIndustryId = driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
			WebElement register_button = driver.findElement(By.xpath("//input[@id='register-button']"));
			
			FirstName.sendKeys("Venkata");
			Thread.sleep(2000);
			LastName.sendKeys("akhil");
			Thread.sleep(2000);
			Email.sendKeys("emailid09876@gmail.com");
			Thread.sleep(2000);
			ConfirmEmail.sendKeys("emailid09876@gmail.com");
			Thread.sleep(2000);
			Username.sendKeys("Akhilvenkat09876");
			Thread.sleep(2000);
			check_availability_button.click();
			Thread.sleep(3000);
			Select CountryId = new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
			CountryId.selectByVisibleText("India");
			Thread.sleep(3000);
			TimeZoneId.sendKeys("(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi");
			Thread.sleep(2000);
			
			if(CheckBox.isEnabled()) {
				CheckBox.click();
			}
			Thread.sleep(2000);
			Password.sendKeys("12345678990");
			Thread.sleep(2000);
			ConfirmPassword.sendKeys("12345678990");
			Thread.sleep(2000);
			Details_CompanyIndustryId.sendKeys("I am student");
			Thread.sleep(2000);
			register_button.click();
			Thread.sleep(10000);
			
			File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
        	FileUtils.copyFile(screenShotFile, new File(".//Screenshots/NopCommerceRegisterScreenShot.png"));
			
			//driver.quit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
