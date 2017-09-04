package day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakesScreenshotEg {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Nazreen\\Nazreen\\SeleniumProject\\src\\screenshots\\Facebook.png"));

	}

}
