package Step_Defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.PO_AddCity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_AddCity {
	
	public WebDriver driver;
	public PO_AddCity obj;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		try {
			
			WebDriverManager.chromedriver().setup();
			//System.setProperty("web.driver.chromedriver","C:\\Users\\MU69842\\eclipse-workspace1\\Arcadia-project\\chromedriver.exe");
	        driver = new ChromeDriver();
	        Thread.sleep(1000);
	        driver.manage().window().maximize();
	        Thread.sleep(1000);
            
        } 
		catch (Exception ex) 
		{
            
            ex.printStackTrace();
        }
        obj = new PO_AddCity(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User  enters Emails as {string} and password as {string}")
	public void user_enters_emails_as_and_password_as(String string, String string2) {
		obj.enterEmailAndPassword(string, string2);
	}

	@When("click on Login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickLogin();
	}

	@When("click on Locations")
	public void click_on_locations() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		try {
			
			obj.clickLocation();
			Thread.sleep(2000);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@When("click on City")
	public void click_on_city() {
		obj.ClickCity();
	}

	@When("click on AddCity")
	public void click_on_add_city() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickAddCity();
	}

	@When("User enters City as {string}")
	public void user_enters_city_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.EnterCitybox(string);
	}

	@When("click on Add")
	public void click_on_add() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickAdd();
	}

	@When("Click on MainAdmin")
	public void click_on_main_admin() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		try {
			
			obj.ClickMainAdmin();
			Thread.sleep(2000);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@When("Click on Logout")
	public void click_on_logout() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    obj.ClickLogout();
	}

	
}
