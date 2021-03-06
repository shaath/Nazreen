package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LoginTC1232222 
{
	@Test
	public void login_org()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.login("Admin", "admin");
		
		Sleeper.sleepTightInSeconds(3);
		
		AdminLoginPage ap=PageFactory.initElements(driver, AdminLoginPage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
