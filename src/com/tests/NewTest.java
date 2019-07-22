package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;


public class NewTest 
{
  
  @Test(dataProvider = "register")
  public void f(int n, String s,int o)
  {
	  System.out.println("number:"+n+ "name:"+s+ "OTP:"+o);
  }
  @DataProvider
  public Object[][] register() 
  {
    Object[][] data={
       { 1, "geeth",25},
       { 2, "geetha",65 },
      { 3,"harshi",45 }
    };
    
    
    return data;

	  
  }
  }
  

