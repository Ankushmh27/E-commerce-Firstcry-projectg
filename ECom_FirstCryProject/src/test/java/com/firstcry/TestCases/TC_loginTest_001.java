package com.firstcry.TestCases;

import org.testng.annotations.Test;

import com.ecommerce.pagesObjects.LoginPage;
import com.firstcry.BaseClass.baseclass;

public class TC_loginTest_001 extends baseclass 
{
	@Test
	public void logintest() 
	{
		driver.get(baseUrl);
		LoginPage lp= new LoginPage(driver);
		
		
	}

}
