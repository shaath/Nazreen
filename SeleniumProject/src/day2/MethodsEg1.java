package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//Getting title of the page
//		String title=driver.getTitle();
//		System.out.println(title);

		//Getting the url of the page
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
		
		//Getiing the page source
		String d=driver.getPageSource();
		System.out.println(d);
		
		
	}

}
