package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_AddCoupon {

	WebDriver driver;
	
	public PO_AddCoupon(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	// Email
	@FindBy(how = How.XPATH, using = "//input[@id='useremail']")
	WebElement Email;
	
	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}
	
	//password
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	
	public void EnterPassword(String password) {
		Password.sendKeys(password);
	}
	
	// Sign in
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']")
	WebElement SignIn;
	
	public void ClickSignIn() {
		SignIn.click();
	}
	
	// Coupon
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[8]/a")
	WebElement Coupon;
	
	public void ClickCoupon() {
		Coupon.click();
	}
	/*
	//SearchBox
	@FindBy(how = How.XPATH, using = "//input[@class='form-control input-sm']")
	WebElement SearchBox;
	
	public void EnterSearchBox(String searchbox) {
		SearchBox.sendKeys(searchbox);
	}*/
	
	//Add Coupon
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-success btn-flat m-b-10 m-l-5']")
	WebElement AddCoupon;
	
	public void ClickAddCoupon() {
		AddCoupon.click();
	}
	
	// Coupon code
	@FindBy(how = How.XPATH, using = "//input[@id='coupon_name']")
	WebElement CouponCode;
	
	public void EnterCouponCode(String couponcode) {
		CouponCode.sendKeys(couponcode);
	}
	
	// Add
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-primary']")
	WebElement Add;
	
	public void ClickAdd() {
		Add.click();
	}
	
	//Main hub
	@FindBy(how = How.XPATH, using = "//span[@class='user-avatar']")
	WebElement Mainhub;
	
	public void ClickMainhub() {
		Mainhub.click();
	}
	
	// Logout
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/ul/li/div/div/ul/li[3]/a/span")
	WebElement Logout;
	
	public void ClickLogout() {
		Logout.click();
	}
	
	
	//1 valid data
	public void Valid_Data(String email, String password, String couponcode) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickCoupon();
			//Thread.sleep(2000);
			
			ClickAddCoupon();
			//Thread.sleep(2000);
			EnterCouponCode(couponcode);
			//Thread.sleep(2000);
			ClickAdd();
			//Thread.sleep(2000);
			
			ClickMainhub();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//2 Only numbers
	public void Only_Numbers(String email, String password, String couponcode) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickCoupon();
			//Thread.sleep(2000);
			
			ClickAddCoupon();
			//Thread.sleep(2000);
			EnterCouponCode(couponcode);
			//Thread.sleep(2000);
			ClickAdd();
			//Thread.sleep(2000);
			
			ClickMainhub();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//3 Only Special characters
	public void Only_SpecialCharacters(String email, String password, String couponcode) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickCoupon();
			//Thread.sleep(2000);
			
			ClickAddCoupon();
			//Thread.sleep(2000);
			EnterCouponCode(couponcode);
			//Thread.sleep(2000);
			ClickAdd();
			//Thread.sleep(2000);
			
			ClickMainhub();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//4 only small alpha characters
	public void Only_Small_AlphaChar(String email, String password, String couponcode) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickCoupon();
			Thread.sleep(2000);
			
			ClickAddCoupon();
			//Thread.sleep(2000);
			EnterCouponCode(couponcode);
			//Thread.sleep(2000);
			ClickAdd();
			//Thread.sleep(2000);
			
			ClickMainhub();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//5 Only Captal Alpha characters
	public void Only_Captal_AlphaChar(String email, String password, String couponcode) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickCoupon();
			//Thread.sleep(2000);
			
			ClickAddCoupon();
			//Thread.sleep(2000);
			EnterCouponCode(couponcode);
			//Thread.sleep(2000);
			ClickAdd();
			//Thread.sleep(2000);
			
			ClickMainhub();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//6 Blank data
	public void Only_Blank(String email, String password, String couponcode) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickCoupon();
			//Thread.sleep(2000);
			
			ClickAddCoupon();
			//Thread.sleep(2000);
			EnterCouponCode(couponcode);
			//Thread.sleep(2000);
			ClickAdd();
			//Thread.sleep(2000);
			
			ClickMainhub();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//7 special and alpha characters
	public void Special_AlphaChar(String email, String password, String couponcode) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickCoupon();
			//Thread.sleep(2000);
			
			ClickAddCoupon();
			//Thread.sleep(2000);
			EnterCouponCode(couponcode);
			//Thread.sleep(2000);
			ClickAdd();
			//Thread.sleep(2000);
			
			ClickMainhub();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}