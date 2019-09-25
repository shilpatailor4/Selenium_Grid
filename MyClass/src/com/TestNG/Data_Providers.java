package com.TestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Providers {
	
  @DataProvider(name = "Reg_Data_Provider")
  public static Object[][] getRegData() {
	  
	  Object data[][] = new Object[2][3];
	  
	  data[0][0] = "U1";
	  data[0][1] = "P1";
	  data[0][2] = "abc@gmail.com";
	  
	  data[1][0] = "U2";
	  data[1][1] = "U2";
	  data[1][2] = "cde@gmail.com";
	  
	  return data;
  }
  
	
  @DataProvider(name = "Login_Data_Provider")
  public static Object[][] getLoginData() {
	  
	  Object data[][] = new Object[2][2];
	  
	  data[0][0] = "U1";
	  data[0][1] = "P1";
	 
	  
	  data[1][0] = "U2";
	  data[1][1] = "U2";
	  
	  return data;
  }
  
  @DataProvider(name = "Sample_Data_Provider")
  public static Object[][] sampleData(Method m){
	  
	  Object data[][] = null;
	  
	  if(m.getName() == "testA")
	  {
		  
		  data = new Object[2][3];
		  data[0][0] = "user1";
		  data[0][1] = "pass1";
		  
		  data[1][0] = "user2";
		  data[1][1] = "pass2";
		 
	  }
	  
	  else if(m.getName().equals("testA")) 
	  {
		  data = new Object[2][3];
		  
		  data[0][0] = "U1";
		  data[0][1] = "P1";
		  data[0][2] = "abc@gmail.com";
		  
		  data[1][0] = "U2";
		  data[1][1] = "U2";
		  data[1][2] = "cde@gmail.com";
		  
		 
	  }
	  
	  return data;
  }
}
