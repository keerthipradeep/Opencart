package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement LoginEmail;	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement LoginPassword;	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement LoginButton;	
	@FindBy(xpath="//li[10]//a[1]")
	WebElement loginname;
	@FindBy(xpath="//a[normalize-space()='Logout']") 
	WebElement logout;
	
	public void login(String Lemail,String Lpassword)
	{
	LoginEmail.sendKeys(Lemail);	
	LoginPassword.sendKeys(Lpassword);
	LoginButton.click();
	} 
	public void verify()
	{
	String text=loginname.getText();
	System.out.println(text);
	String name=text.substring(13, 21);
	System.out.println(name);
	if(name.equals("remadevi"))
	{
		System.out.println("Test Passed");
	}
	}
	public void invalid()
	{
		String message=driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")).getText();
		System.out.println(message);
	}
	
public void test()
{
	if (loginname.isDisplayed())
	{
		System.out.println("test is passed");
		logout.click();
	}
		else
		{
			System.out.println("invalid test");
			
	}
}
}
