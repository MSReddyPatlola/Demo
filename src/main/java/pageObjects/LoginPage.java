package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	By email =  By.xpath("//input[@id='email']");
	By password =  By.xpath("//input[@id='password']");
	By submit =  By.xpath("//input[@value='Login']");
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
		
	}
	
	
}
