package com.TestNG;

import org.testng.annotations.Test;

//Multiple Test --- Same Data-Provider
	  // Multiple Test --- Different data --- Data-Provider

public class TestCases {
	
	@Test(dataProviderClass = Data_Providers.class, dataProvider = "Sample_Data_Provider")
	public void testA(String u, String p)
	{
		
	}
	
	@Test(dataProviderClass = Data_Providers.class, dataProvider = "Sample_Data_Provider")
	
	public void testB(String u, String p, String e)
	{
		
	}

}
