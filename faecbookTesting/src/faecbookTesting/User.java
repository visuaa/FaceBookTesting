package faecbookTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class User {

	
LoginFunctionality user1=new LoginFunctionality();


@Test
public void testUser()
{
	System.setProperty("webdriver.chrome.driver", "./src/resources/chromedriver.exe");

	
	WebDriver driver=new ChromeDriver();
	

	
	user1.getFaceBook(driver);
	
	user1.enterUserName("vishalrathi910@gmail.com");
	
	user1.enterPassword("Vishalisgood@725769725769");
	
	user1.enterLogin();
	
	driver.quit();
	
}
}
