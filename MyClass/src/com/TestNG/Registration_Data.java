package com.TestNG;

import org.testng.annotations.Test;

public class Registration_Data {
	
	@Test(dataProviderClass = Data_Providers.class, dataProvider = "Reg_Data_Provider")
	public void doRegister(String uname, String password, String email)
	{
		
	}

}
