package com.firstcry.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro ;
	public  ReadConfig()
	{
		File src = new File("./E_commerceProjectV1/Configuration/config.properties");
		try {
			FileInputStream fis =new FileInputStream(src);
			pro.load(fis);	
		} catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	public String getApplictionURL() 
	{
		//read data from prp file
		String URL = pro.getProperty("baseURL");
		return URL;	
		
	}
	public String getUsername() 
	{
		String username = pro.getProperty("username");
		return username;	
		
	}
	public String getPassword() 
	{
		String password = pro.getProperty("password");
		return password;	
		
	}
	
}
