package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFacebook {
	
	WebDriver driver;

	By email = By.xpath(".//input[@type='email']");

	By password = By.xpath(".//input[@type='password']");

	By Login = By.xpath(".//input[contains(@value,'Log')]");
	
	public void OpenFacebook(WebDriver driver)
	{   
		this.driver=driver;
		driver.get("https://www.facebook.com/");
	}
	
	public void enterUserName(String userName)
	{
		driver.findElement(email).sendKeys(userName);
	}
	
	public void enterPassword(String pass_word)
	{
		driver.findElement(password).sendKeys(pass_word);
	}
	
	public void loginIntoApplication()
	{
		driver.findElement(Login).click();
	}
	
	
	

}