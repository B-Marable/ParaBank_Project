package parabank_test;

import org.testng.annotations.Test;

import parabank_pages.Login_Page;

public class Login_Test extends BaseClass {

	@Test
	public void LoginSucessTest() {

		Login_Page lp = new Login_Page(driver);

		String usernameVal = "sampleTest";
		String passwordVal = "sampleTest";

		lp.AssertLoginPageHeading();
		lp.Login(usernameVal, passwordVal);
		lp.AssertAccountOverviewHeading();

	}

	@Test
	public void LoginFailureTest() {

		Login_Page lp = new Login_Page(driver);

		String usernameVal = "test";
		String passwordVal = "test";

		lp.AssertLoginPageHeading();
		lp.Login(usernameVal, passwordVal);
		lp.AssertLoginError();;

	}

}
