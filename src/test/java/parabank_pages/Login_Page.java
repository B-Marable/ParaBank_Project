package parabank_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login_Page {
	
	WebDriver driver;
	
	// LOCATORS
	@FindBy(tagName="h2")
	WebElement customerLoginHeading;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//h1[contains(text(), 'Accounts Overview')]")
	WebElement accountOverviewHeading;
	
	@FindBy(xpath="//p[contains(text(), 'The username and password could not be verified.')]")
	WebElement errorMsgLogin;
	
	//FUNCTIONS
	
	public Login_Page(WebDriver w) {
		
		driver = w;
		PageFactory.initElements(driver, this); // initializes all the elements; @FindBy will work with this line
	
	}
	
	public void AssertLoginPageHeading() {
		
		Assert.assertTrue(customerLoginHeading.isDisplayed());
		
	}
	
	public void Login(String uname, String pass) {
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		
		loginBtn.click();
	}
	
	public void AssertAccountOverviewHeading() {
		
		Assert.assertTrue(customerLoginHeading.isDisplayed());
		
	}
	
	public void AssertLoginError() {
		
		Assert.assertTrue(errorMsgLogin.isDisplayed());
	}
	
	
	

}
