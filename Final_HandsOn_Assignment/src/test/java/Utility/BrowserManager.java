package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {

	public static WebDriver getDriver(String browser) {
		// TODO Auto-generated method stub
		WebDriver driver = null;	//Created an Object of WebDriver
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//Object = new class
		}
		return driver;
	}
}
