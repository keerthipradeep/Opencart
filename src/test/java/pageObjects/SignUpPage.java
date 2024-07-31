package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
@FindBy(xpath="//input[@placeholder='Name']")
WebElement SignupName;

@FindBy(xpath="//input[@data-qa='signup-email']")
WebElement SignupEmail;

@FindBy(xpath="//button[normalize-space()='Signup']")
WebElement SignupButton;

@FindBy(xpath="//input[@id='id_gender2']")
WebElement Title;
@FindBy(xpath="//input[@id='password']")
WebElement Password;
@FindBy(xpath="//select[@id='days']")
WebElement Day;
@FindBy(xpath="//select[@id='months']")
WebElement Month;
@FindBy(xpath="//select[@id='years']")
WebElement Year;

@FindBy(xpath="//input[@id='first_name']")
WebElement FirstName;
@FindBy(xpath="//input[@id='last_name']")
WebElement LastName;
@FindBy(xpath="//input[@id='address1']")
WebElement Address;
@FindBy(xpath="//select[@id='country']")
WebElement Country;
@FindBy(xpath="//input[@id='state']")
WebElement State;
@FindBy(xpath="//input[@id='city']")
WebElement City;
@FindBy(xpath="//input[@id='zipcode']")
WebElement ZipCode;
@FindBy(xpath="//input[@id='mobile_number']")
WebElement MobileNumber;
@FindBy(xpath="//b[normalize-space()='Account Created!']")
WebElement ConfirmMessage;


public void setFirstname(String fname) {
	
	SignupName.sendKeys(fname);
}
public void setEmail(String email) {
	SignupEmail.sendKeys(email);
	SignupButton.click();
}
public void setTitle(String title)
{
	if(Title.getText().equals(title))
	{
		Title.click();
	}
}
public void setPassword(String password)
{
	Password.sendKeys(password);
}
public void setDate()
{
	Select DayCal=new Select(Day);
	DayCal.selectByVisibleText("5");
	Select MonthCal=new Select(Month);
	MonthCal.selectByVisibleText("November");
	Select YearCal=new Select(Year);
	YearCal.selectByVisibleText("1998");
}
public void setfName(String firstname,String lastname)
{
	FirstName.sendKeys(firstname);
	LastName.sendKeys(lastname);
}
public void setAddress(String address,String country,String state,String city,String postcode)
{
	Address.sendKeys(address);
	Select CountryDrop=new Select(Country);
	CountryDrop.selectByVisibleText(country);
	State.sendKeys(state);
	City.sendKeys(city);
	ZipCode.sendKeys(postcode);
}
public void setNumber(String number)
{
	MobileNumber.sendKeys(number);
	WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].click();", button);
}
public void getConfirmationMessage() {
	String text=ConfirmMessage.getText();
	System.out.println(text);
	if (text.equals("ACCOUNT CREATED!"))
			{
		System.out.println("Test passed");
			}
	else
	{
		System.out.println("Test Failed");
	}
}
	
	
}
