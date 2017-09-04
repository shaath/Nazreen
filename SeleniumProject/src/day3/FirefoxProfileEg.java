package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfileEg {

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Nazreen");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.khuranatravel.com/");

	}

}
