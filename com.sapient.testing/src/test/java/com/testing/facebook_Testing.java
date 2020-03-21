package com.testing;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class facebook_Testing {

	@Test
	public void TestFacebook() {
		//System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement dropDownDay = driver.findElement(By.xpath(".//select[@name='birthday_day']"));
		
		Select day = new Select(dropDownDay);
		
		List<WebElement> options = day.getOptions();
		
		for (WebElement i : options) 
		{
			System.out.println(i.getText());
		}
		
		day.selectByValue("5");
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
	

	}

}
