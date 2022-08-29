package com.firstcry.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseclass 
{
	public String baseUrl="https://www.firstcry.com/";
	public String Usename="";
	public String password="";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		System.setProperty("", ""); 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankush Mhala\\Desktop\\My Data\\E-commerce\\MyEcommerceProject\\ECom_FirstCryProject\\Driver\\chromedriver.exe");

		//Creating an object of ChromeDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void teardown() 
	{
		driver.quit();
	}
	

}
