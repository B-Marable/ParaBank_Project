package parabank_test;

import org.testng.annotations.Test;

import parabank_pages.Register_Page;

public class Register_Test extends BaseClass{
	
	@Test
	public void RegisterUser() {
		
		Register_Page rp = new Register_Page(driver);
		
	}

}
