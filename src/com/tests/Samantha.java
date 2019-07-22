package com.tests;

import org.testng.annotations.Test;

public class Samantha {
	@Test(priority=1)
	public void testGoogle()
	{
		System.out.println("in test google");
	}
	
	@Test(priority=2)
	public void testTwitter()
	{
		System.out.println("in test twitter");
	}
	@Test(priority=3,enabled=false)
	public void testFacebook()
	{
		System.out.println("in test facebook");
	}

}
