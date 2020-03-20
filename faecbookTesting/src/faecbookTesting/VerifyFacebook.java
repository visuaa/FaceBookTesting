package faecbookTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Helper.BrowserFactory;

public class VerifyFacebook {
	
	BrowserFactory ChooseBrowser=new BrowserFactory();
	@Test
	public void checkValidUser()
	{
		WebDriver driver=ChooseBrowser.strartBrowser("chrome","https://www.facebook.com/");
		
		LoginPageFactory login_page=PageFactory.initElements(driver,LoginPageFactory.class);
		
		login_page.LoginFaceBook("vishalrathi910@gmail.com", "Vishalisgood@725769725769");
		
		
	}

}
