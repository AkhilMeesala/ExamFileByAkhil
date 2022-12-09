package Step_Defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.PO_AddCity;
import PO.PO_AddCountry;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_AddCountry {
	
	public WebDriver driver;
	public PO_AddCountry obj;

	@Given("User Launchs Chrome browser")
	public void user_launchs_chrome_browser() {
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
        obj = new PO_AddCountry(driver);
	
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("User  enter emails as {string} and password as {string}")
	public void user_enter_emails_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    obj.enterEmailAndPassword(string, string2);
	}
	
	@When("click on the Login")
	public void click_on_the_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickSignIn();
	}

	@When("click on the Locations")
	public void click_on_the_locations() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickLocations();
		
	}

	@When("click on Country")
	public void click_on_country() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickCountry();
	}

	@When("click on AddCountry")
	public void click_on_add_country() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickAddCountry();
	}

	@When("User enter Country as {string}")
	public void user_enter_country_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.EnterCountryBox(string);
	}

	@When("click on AddButton")
	public void click_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickAdd();
	}

	@When("Click on the  MainAdmin")
	public void click_on_the_main_admin() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickMainAdmin();
	}

	@When("Click on the Logout")
	public void click_on_the_logout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.ClickLogout();
	}
	
}
