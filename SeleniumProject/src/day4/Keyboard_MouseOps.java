package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_MouseOps {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(driver);
		//Focusing on gmail link
		act.moveToElement(gmail).build().perform();
		
		//Right click on gmail
		act.contextClick().build().perform();
		
		//Clicking down arrow 3 times
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		//Click on enter
		act.sendKeys(Keys.ENTER).build().perform();
	}

}
