package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CalanderOps {

	public static void main(String[] args)
	{
		String date="18/november/2017";
		String[] x=date.split("/");
		
		String day=x[0];
		String month=x[1];
		String year=x[2];
		System.out.println(day+"-----"+month+"-----"+year);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("DepartDate")).click();
		//Year selection
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		Sleeper.sleepTightInSeconds(5);
		//Month Selection
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		Sleeper.sleepTightInSeconds(5);
		//Day Selection
		List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		
		for (int i = 0; i < cols.size(); i++) 
		{
			String calday=cols.get(i).getText();
			if (calday.equals(day))
			{
				cols.get(i).click();
				break;
			}
		}
	}

}
