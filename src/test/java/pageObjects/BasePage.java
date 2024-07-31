package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
			
		WebDriver driver;
		
		public BasePage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}

	}


