package faecbookTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {
	
	WebDriver driver;
	
	public LoginPageFactory(WebDriver driver)
	{
		this.driver = driver;
	}

   @FindBy
   (id="email")  @CacheLookup WebElement Username;
    
   @FindBy
   (how=How.XPATH,using="//*[@id='pass']")  @CacheLookup WebElement Password;
   
   @FindBy
   (how=How.XPATH,using="//input[@value='Log In']")  @CacheLookup WebElement LogIN_Button;
   
   public void LoginFaceBook(String Uname,String pass)
   {
	   Username.sendKeys(Uname);
	   
	   Password.sendKeys(pass);
	   
	   LogIN_Button.click();
   }

}
