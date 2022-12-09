package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_EcommerceCategory {

WebDriver driver;
	
	public PO_EcommerceCategory(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	// email
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
	
	// Sign In
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']")
	WebElement SignIn;
	
	public void ClickSignIn() {
		SignIn.click();
	}
	
	// Product
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[3]/a")
	WebElement Product;
	
	public void ClickProduct() {
		Product.click();
	}
	
	// Category
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[3]/ul/li[1]/a")
	WebElement Categoty;
	
	public void ClickCategory() {
		Categoty.click();
	}
	
	// Action edit
	@FindBy(how = How.XPATH, using = "//*[@id=\"bootstrap-data-table-export\"]/tbody/tr[1]/td[6]/a[1]")
	WebElement EditIcon;
	
	public void ClickEditIcon() {
		EditIcon.click();
	}
	
	// Category Name
	@FindBy(how = How.XPATH, using = "//input[@id='category_name']")
	WebElement CategoryName;
	
	public void EnterCategoryName(String categoryname) {
		CategoryName.clear();
		CategoryName.sendKeys(categoryname);
	}
	
	// Update edit
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-primary']")
	WebElement UpdateEdit;
	
	public void ClickUpdateEdit() {
		UpdateEdit.click();
	}
	
	// Action Image
	@FindBy(how = How.XPATH, using = "//a[@class='ti-image']")
	WebElement ImageIcon;
	
	public void ClickImageIcon() {
		ImageIcon.click();
	}
	
	// Upload image
	@FindBy(how = How.XPATH, using = "//*[@id=\"inputFile-2\"]")
	WebElement UploadImage;
	
	public void PassImage(String uploadimage) {
		UploadImage.sendKeys(uploadimage);
	}
	
	// Update
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-primary']")
	WebElement Upload;
	
	public void ClickUpload() {
		Upload.click();
	}
	
	// Main admin
	@FindBy(how = How.XPATH, using = "//span[@class='user-avatar']")
	WebElement Mainadmin;
	
	public void ClickMainadmin() {
		Mainadmin.click();
	}
	
	//Logout
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/ul/li/div/div/ul/li[3]/a/span")
	WebElement Logout;
	
	public void ClickLogout() {
		Logout.click();
	}
	
	//1  valid Category name
	public void Valid_CategoryName(String email, String password, String categoryname, String uploadimage) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickProduct();
			ClickCategory();
			
			ClickEditIcon();
			EnterCategoryName(categoryname);
			ClickUpdateEdit();
			
			ClickImageIcon();
			Thread.sleep(2000);
			PassImage(uploadimage);
			ClickUpload();
			Thread.sleep(2000);
			
			ClickMainadmin();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//2 numbers in Category name
	public void NumbersIn_CategoryName(String email, String password, String categoryname, String uploadimage) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickProduct();
			ClickCategory();
			
			ClickEditIcon();
			EnterCategoryName(categoryname);
			ClickUpdateEdit();
			
			ClickImageIcon();
			Thread.sleep(2000);
			PassImage(uploadimage);
			ClickUpload();
			Thread.sleep(2000);
			
			ClickMainadmin();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//3 Special characters Category name
	public void SpecialCharactersIn_CategoryName(String email, String password, String categoryname, String uploadimage) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickProduct();
			ClickCategory();
			
			ClickEditIcon();
			EnterCategoryName(categoryname);
			ClickUpdateEdit();
			Thread.sleep(2000);
			
//			ClickImageIcon();
//			Thread.sleep(2000);
//			PassImage(uploadimage);
//			ClickUpload();
//			Thread.sleep(2000);
			
			ClickMainadmin();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//4 Blank Category name
	public void Blank_CategoryName(String email, String password, String categoryname, String uploadimage) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickProduct();
			ClickCategory();
			
			ClickEditIcon();
			EnterCategoryName(categoryname);
			ClickUpdateEdit();
			Thread.sleep(2000);
			
//			ClickImageIcon();
//			Thread.sleep(2000);
//			PassImage(uploadimage);
//			ClickUpload();
//			Thread.sleep(2000);
			
			ClickMainadmin();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//5 Alpha and numbers in Category name
	public void Alpha_NumbersIn_CategoryName(String email, String password, String categoryname, String uploadimage) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickProduct();
			ClickCategory();
			
			ClickEditIcon();
			EnterCategoryName(categoryname);
			ClickUpdateEdit();
			
			ClickImageIcon();
			Thread.sleep(2000);
			PassImage(uploadimage);
			ClickUpload();
			Thread.sleep(2000);
			
			ClickMainadmin();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//6 valid Image 
	public void Valid_Image(String email, String password, String categoryname, String uploadimage) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickProduct();
			ClickCategory();
			
			ClickEditIcon();
			EnterCategoryName(categoryname);
			ClickUpdateEdit();
			
			ClickImageIcon();
			Thread.sleep(2000);
			PassImage(uploadimage);
			ClickUpload();
			Thread.sleep(2000);
			
			ClickMainadmin();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//7 Blank in image box
	public void Blank_ImageBox(String email, String password, String categoryname, String uploadimage) {
		try {
			
			EnterEmail(email);
			EnterPassword(password);
			ClickSignIn();
			
			ClickProduct();
			ClickCategory();
			
			ClickEditIcon();
			EnterCategoryName(categoryname);
			ClickUpdateEdit();
			
			ClickImageIcon();
			Thread.sleep(2000);
			PassImage(uploadimage);
			ClickUpload();
			Thread.sleep(2000);
			
			ClickMainadmin();
			ClickLogout();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}