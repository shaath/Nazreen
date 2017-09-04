package day4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowsHanding {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
//		String bing=driver.getWindowHandle();
//		System.out.println(bing);
		
		driver.findElement(By.linkText("MSN")).click();
		Sleeper.sleepTightInSeconds(5);
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String wid=it.next();
			System.out.println(wid);
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
			
			try
			{
				driver.findElement(By.xpath(".//*[@id='main']/div[3]/div/div/div[3]/ul/li[5]")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			}
			catch(Exception e)
			{
				System.out.println("The expected link not available in this page");
			}
			
		}
		driver.quit();

	}

}
