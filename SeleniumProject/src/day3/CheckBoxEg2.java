package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> checks=block.findElements(By.tagName("input"));
		
		System.out.println(checks.size());
		
		for (int i = 0; i < checks.size(); i++) 
		{
			String name=checks.get(i).getAttribute("value");
			System.out.println(name);
			if (!checks.get(i).isSelected()) 
			{
				checks.get(i).click();
			}
			
		}
	}

}
