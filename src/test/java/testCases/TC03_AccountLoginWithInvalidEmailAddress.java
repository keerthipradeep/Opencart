package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC03_AccountLoginWithInvalidEmailAddress extends BaseClass {

	@Test(groups = { "Regression" })
	public void loginwithinvalid() {
		LoginPage LP = new LoginPage(driver);
		LP.login("Test@1213", "test123");
		LP.invalid();
	}
}
