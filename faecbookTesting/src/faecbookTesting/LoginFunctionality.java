package faecbookTesting;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFunctionality {
	
	WebDriver driver;
	
	
	By username=By.xpath(".//input[@id='email']");
	
	By password=By.cssSelector("input[id='pass']");
	
	By LoginButton=By.xpath(".//input[@value='Log In']");
	
	
	public void getFaceBook(WebDriver driver)
	{
		this.driver=driver;
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void enterUserName(String username)
	{
		driver.findElement(this.username).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(this.password).sendKeys(password);
	}
	
	public void enterLogin()
	{
		driver.findElement(LoginButton).click();
	}
    
	
}
