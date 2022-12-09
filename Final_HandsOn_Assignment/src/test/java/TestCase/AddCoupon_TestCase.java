package TestCase;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_AddCoupon;
import Utility.BrowserManager;

public class AddCoupon_TestCase {

	WebDriver driver;
	JSONObject addcoupon;

	
	@BeforeClass
	public void beforeClass()throws Exception{
		InputStream details = null;
		try {
			String fileName = "data/addcoupon.json";
			details = getClass().getClassLoader().getResourceAsStream(fileName);
			JSONTokener tokener = new JSONTokener(details);
			
			addcoupon = new JSONObject(tokener);
			System.out.println("Data is "+addcoupon.toString());
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@BeforeMethod 
	@Parameters({"browser","url"})
	public void setup(String browser, String url) throws InterruptedException {
		driver = BrowserManager.getDriver(browser); 
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
	}
	//1
	@Test(description="Valid Coupon code",priority=1)
	public void ValidData() {
		try {
			
			String email = addcoupon.getJSONObject("Login").getString("Email");
			String password = addcoupon.getJSONObject("Login").getString("Password");
			
			String couponcode = addcoupon.getJSONObject("Valid").getString("Couponcode");
			
			PO_AddCoupon obj = PageFactory.initElements(driver, PO_AddCoupon.class);
			obj.Valid_Data(email, password, couponcode);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//2
	@Test(description="numbers as coupon code",priority=2)
	public void OnlyNumbers() {
		try {
			
			String email = addcoupon.getJSONObject("Login").getString("Email");
			String password = addcoupon.getJSONObject("Login").getString("Password");
			
			String couponcode = addcoupon.getJSONObject("Numbers").getString("Couponcode");
			
			PO_AddCoupon obj = PageFactory.initElements(driver, PO_AddCoupon.class);
			obj.Only_Numbers(email, password, couponcode);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//3
	@Test(description="Special characters as coupon code",priority=3)
	public void OnlySpecialCharacters() {
		try {
			
			String email = addcoupon.getJSONObject("Login").getString("Email");
			String password = addcoupon.getJSONObject("Login").getString("Password");
			
			String couponcode = addcoupon.getJSONObject("Specialcharacters").getString("Couponcode");
			
			PO_AddCoupon obj = PageFactory.initElements(driver, PO_AddCoupon.class);
			obj.Only_SpecialCharacters(email, password, couponcode);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//4
	@Test(description="Only small alphaChar as coupon code",priority=4)
	public void OnlySmallAlphaChar() {
		try {
			
			String email = addcoupon.getJSONObject("Login").getString("Email");
			String password = addcoupon.getJSONObject("Login").getString("Password");
			
			String couponcode = addcoupon.getJSONObject("SmallAlpha").getString("Couponcode");
			
			PO_AddCoupon obj = PageFactory.initElements(driver, PO_AddCoupon.class);
			obj.Only_Small_AlphaChar(email, password, couponcode);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//5
	@Test(description="Only captal alphaChar as coupon code",priority=5)
	public void OnlyCaptalAlphaChar() {
		try {
			
			String email = addcoupon.getJSONObject("Login").getString("Email");
			String password = addcoupon.getJSONObject("Login").getString("Password");
			
			String couponcode = addcoupon.getJSONObject("CaptialAlpha").getString("Couponcode");
			
			PO_AddCoupon obj = PageFactory.initElements(driver, PO_AddCoupon.class);
			obj.Only_Captal_AlphaChar(email, password, couponcode);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//6
	@Test(description="blank data as coupon code",priority=6)
	public void OnlyBlank() {
		try {
			
			String email = addcoupon.getJSONObject("Login").getString("Email");
			String password = addcoupon.getJSONObject("Login").getString("Password");
			
			String couponcode = addcoupon.getJSONObject("Blank").getString("Couponcode");
			
			PO_AddCoupon obj = PageFactory.initElements(driver, PO_AddCoupon.class);
			obj.Only_Blank(email, password, couponcode);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//7
	@Test(description="Special and alpha characters data as coupon code",priority=6)
	public void SpecialAlphaChar() {
		try {
			
			String email = addcoupon.getJSONObject("Login").getString("Email");
			String password = addcoupon.getJSONObject("Login").getString("Password");
			
			String couponcode = addcoupon.getJSONObject("Specialalpha").getString("Couponcode");
			
			PO_AddCoupon obj = PageFactory.initElements(driver, PO_AddCoupon.class);
			obj.Special_AlphaChar(email, password, couponcode);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
