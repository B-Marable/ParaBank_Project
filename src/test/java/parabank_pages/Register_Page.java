package parabank_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Register_Page {
	
	WebDriver driver;
	
	// LOCATORS
	@FindBy(xpath="//a[contains(text(), 'Register')]")
	WebElement registerLinkBtn;
	
	@FindBy(xpath="//h1[contains(text(), 'Signing up is easy!')]")
	WebElement signUpEasyHeading;
	
	@FindBy(id="customer.firstName")
	WebElement fName;
	
	@FindBy(id="customer.lastName")
	WebElement lName;
	
	@FindBy(id="customer.address.street")
	WebElement address;
	
	@FindBy(id="customer.address.city")
	WebElement city;
	
	@FindBy(id="customer.address.state")
	WebElement state;
	
	@FindBy(id="customer.address.zipCode")
	WebElement zipCode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement phoneNum;
	
	@FindBy(id="customer.ssn")
	WebElement ssn;
	
	@FindBy(id="customer.username")
	WebElement username;
	
	@FindBy(id="customer.password")
	WebElement password;
	
	@FindBy(id="repeatedPassword")
	WebElement confirmPass;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement registerBtn;
	
	// FUNCTIONS
	public Register_Page(WebDriver w) {
		
		driver = w;
		PageFactory.initElements(driver, this); // initializes all the elements; @FindBy will work with this line
		
	}
	
	public void AssertSignUpEasyHeading() {
		
		Assert.assertTrue(signUpEasyHeading.isDisplayed());
		
	}
	
	public void RegisterUser(String fn, String ln) {
		
	}
	
	

}
