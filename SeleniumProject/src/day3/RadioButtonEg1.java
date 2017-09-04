package day3;

import java.util.List;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonEg1 {

	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Nazreen");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.cleartrip.com/");
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		List<WebElement> radios=block.findElements(By.tagName("input"));
		
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String text=radios.get(i).getAttribute("value");
			System.out.println(text);
			if (text.equalsIgnoreCase("RoundTrip"))
			{
				radios.get(i).click();
				break;
			}
		}
		

	}

}
