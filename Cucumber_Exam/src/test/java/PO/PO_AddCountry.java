package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_AddCountry {

	public WebDriver driver;
	
	public PO_AddCountry(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//email
	@FindBy(xpath = "//input[@id='useremail']")
	@CacheLookup
	WebElement Email;
	
	
	// password
	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement Password;
	
	public void enterEmailAndPassword(String username, String password) {
		try {
			Email.sendKeys(username);
			Password.sendKeys(password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// SignIn
	@FindBy(xpath = "//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']")
	@CacheLookup
	WebElement SignIn;
	
	public void ClickSignIn() {
		SignIn.click();
	}
	
	// Location
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement Locations;
	
	public void ClickLocations() {
		Locations.click();
	}
	
	// Country
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[1]/a")
	@CacheLookup
	WebElement Country;
	
	public void ClickCountry() {
		Country.click();
	}
	
	// Add Country
	@FindBy(xpath = "//a[@class='btn btn-success btn-flat m-b-10 m-l-5']")
	@CacheLookup
	WebElement AddCountry;
	
	public void ClickAddCountry() {
		AddCountry.click();
	}
	
	// Enter country
	@FindBy(xpath = "//input[@id='Country']")
	@CacheLookup
	WebElement CountryBox;
	
	public void EnterCountryBox(String countrybox) {
		CountryBox.sendKeys(countrybox);
	}
	
	// Add 
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary']")
	@CacheLookup
	WebElement Add;
	
	public void ClickAdd() {
		Add.click();
	}
	
	//Main Admin
	@FindBy(xpath = "//span[@class='user-avatar']")
	@CacheLookup
	WebElement MainAdmin;
	
	public void ClickMainAdmin() {
		MainAdmin.click();
	}
	
	// Logout
	@FindBy(xpath = "/html/body/div[2]/div[2]/ul/li/div/div/ul/li[3]/a/span")
	@CacheLookup
	WebElement Logout;
	
	public void ClickLogout() {
		Logout.click();
	}
	
}
