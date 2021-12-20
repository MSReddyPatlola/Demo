package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;
	By login =  By.xpath("//a[text()='Login']");
	
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public LoginPage login()
	{
		driver.findElement(login).click();
		LoginPage lop = new LoginPage(driver);
		return lop;
	}
	
	
}
