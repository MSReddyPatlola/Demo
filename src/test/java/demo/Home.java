package demo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class Home extends Base{
	WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@Test
	public void validateTitle() throws IOException
	{
		log.info("Driver is initialized");
		driver = intializeDriver();
		log.info("Navigated to URL");
		driver.get(prop.getProperty("url"));
		String expected = driver.getTitle();
		String actual = "Rahul Shetty Academ";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(dataProvider="getData")
	public void login(String Username, String Password) throws IOException
	{
		log.info("Driver is initialized");
		driver = intializeDriver();
		log.info("Navigated to URL");
		driver.get(prop.getProperty("url"));
		log.info("On Landing Page");
		LandingPage lp = new LandingPage(driver);
		log.info("On Login Page");
		LoginPage lop = lp.login();
		lop.email().sendKeys(Username);
		lop.password().sendKeys(Password);
		lop.submit().click();
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "pmrreddypmr@gmail.com";
		data[0][1] = "Powertrain@10";
		
		data[1][0] = "pmrreddypmr@gmail.com";
		data[1][1] = "Powertrain@20";
		return data;
		
	}
	

}
