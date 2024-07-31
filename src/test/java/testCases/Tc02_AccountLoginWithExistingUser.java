package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class Tc02_AccountLoginWithExistingUser extends BaseClass {

	@Test(groups = { "Sanity" })
	public void LoginPagetestcase() {
		try {
			logger.info("*******Starting Testcase***********");
			LoginPage LP = new LoginPage(driver);
			LP.login(p.getProperty("Lemail"), p.getProperty("Lpassword"));
			LP.verify();

		} catch (Exception e) {
			logger.error("Test Failed");
			logger.debug("Debug logs...");
			Assert.fail();
		}
		logger.info("*****Login Successful*******");
	}
}
