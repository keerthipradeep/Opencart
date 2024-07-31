package testCases;

import org.testng.annotations.Test;

import pageObjects.SignUpPage;
import testBase.BaseClass;

public class Tc01_AccountSignupTest extends BaseClass {

	@Test(groups = { "Sanity" })
	public void accountsignuptest() {
		SignUpPage sp = new SignUpPage(driver);
		sp.setFirstname(randomeString().toUpperCase());
		sp.setEmail(randomeString() + "@gmail.com");
		sp.setTitle("Mr");
		sp.setPassword("Newpass12#");
		sp.setDate();
		sp.setfName(randomeString().toUpperCase(), randomeString().toUpperCase());
		sp.setAddress(randomAlphaNumeric().toUpperCase(), "India", "xyz", "dfges", "SL5TUY");
		sp.setNumber(randomeNumber().toUpperCase());
		sp.getConfirmationMessage();

	}
}
