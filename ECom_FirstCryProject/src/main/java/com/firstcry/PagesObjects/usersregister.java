package com.firstcry.PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usersregister 
{
	public void registerform(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[@class='anch poplogin_main poplogin R12_61']")
	WebElement EnterTologin;

	@FindBy(id = "lemail")
	WebElement emailID;
	

}
