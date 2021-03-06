package Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	WebDriver driver;

	public WebDriver strartBrowser(String browserName,String URL)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty
					("user.dir")+"//src//resources//chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else
			if(browserName.equalsIgnoreCase("firefox"))
			{System.setProperty("webdriver.chrome.driver",System.getProperty
					("user.dir")+"//src//resources//geckodriver.exe");
			 driver=new FirefoxDriver();
			}
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
}
