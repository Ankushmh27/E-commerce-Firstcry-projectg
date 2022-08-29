package com.firstcry.PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
    WebDriver driver;
	public void LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="")
	WebElement Username;
	
	


}
