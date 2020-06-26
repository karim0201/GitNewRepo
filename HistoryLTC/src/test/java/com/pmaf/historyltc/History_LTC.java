package com.pmaf.historyltc;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pmaf.test.WebTestHelper;

public class History_LTC extends WebTestHelper{
	
	@Test(priority =1)
	public void loginToLTC()
	{
		Login login = new Login();
		Assert.assertTrue(login.login());
		
	}
}
