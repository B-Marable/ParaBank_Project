package parabank_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;

	@BeforeMethod
	public void LaunchSite() {

//		String browserName = System.getProperty("Browser");
//
//		if (browserName.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		} else {
//			driver = new ChromeDriver();
//		}

		driver = new FirefoxDriver();

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@AfterMethod
	public void CloseSite() {

		driver.quit();
	}

}
