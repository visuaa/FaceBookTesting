package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class user1 {

	public static void main(String[] args) throws InterruptedException {
		
		LoginFacebook user1=new LoginFacebook();
		
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		
		
		user1.OpenFacebook(driver);
		
		user1.enterUserName("vishalrathi910@gmail.com");
		
		user1.enterPassword("Vishalisgood@725769725769");
		
		user1.loginIntoApplication();
		
		Thread.sleep(100);
		
		driver.quit();
		
		

	}

}
