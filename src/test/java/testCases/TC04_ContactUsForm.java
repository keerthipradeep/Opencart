package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import testBase.BaseClass;

public class TC04_ContactUsForm extends BaseClass {

	@Test(groups = { "Sanity" })
	public void contactusform() throws IOException, InterruptedException {
		ContactUs CS = new ContactUs(driver);
		CS.CForm();
	}

}
