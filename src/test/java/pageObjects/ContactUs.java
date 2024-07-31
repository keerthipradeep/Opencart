package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends BasePage {

	public ContactUs(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[normalize-space()='Contact us']")
	WebElement contactus;
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement ContactName;
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement ContactEmail;
	@FindBy(xpath="//textarea[@id='message']")
	WebElement ContactMessage;
	@FindBy(xpath="//input[@placeholder='Subject']")
	WebElement ContactSubject;
	@FindBy(xpath="//input[@name='upload_file']")
	WebElement upload;
	@FindBy(xpath="//input[@name='submit']")
	WebElement Submit;
	
	public void CForm() throws IOException, InterruptedException
	{
		contactus.click();
		ContactName.sendKeys("Keerthi");
		ContactEmail.sendKeys("KK3@GMAIL.COM");
        ContactSubject.sendKeys("test");
        ContactMessage.sendKeys("This is for testing purpose");
       // upload.click();
        Thread.sleep(20000); // wait for page load    
      //  Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\API\\Employee.json");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Submit.click();
        driver.switchTo().alert().accept();
	}
	
}
	
	
