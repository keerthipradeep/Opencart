package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Tc05_TestDDT extends BaseClass {

	@Test(dataProvider = "LogicData", dataProviderClass = DataProviders.class, groups = { "Regression" })
	public void TestingUsingDDT(String Username, String Password, String Result) {
		logger.info("*******Starting Testcase***********");
		LoginPage LP = new LoginPage(driver);
		LP.login(Username, Password);
		LP.test();
	}
}
