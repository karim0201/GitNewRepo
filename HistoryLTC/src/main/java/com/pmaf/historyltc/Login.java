package com.pmaf.historyltc;

import com.pmaf.listeners.PMReport;
import com.pmaf.test.PMLogger;

//import com.pmaf.test.PMLogger;
//import com.pmaf.test.PMReport;

public class Login extends LoginPage 
{

	public boolean login() 
	{
		// Fetching the data from excel file

		userName = testDataUtil.getTestData("Sheet1", "UserName");
		password = testDataUtil.getTestData("Sheet1", "Password");
		txtPolicy = testDataUtil.getTestData("Sheet1", "Ltc_Policy");
		txtPrpsdFacility = testDataUtil.getTestData("Sheet1", "Proposed_Initial");
		txtElimination = testDataUtil.getTestData("Sheet1", "Proposed_EliminationDays");
		txtBenefit = testDataUtil.getTestData("Sheet1", "Benefit_Period");
		
		//URL from Login Page
		webUtil.get(url);

		//Enter User name
		if (webUtil.sendKeys(txtUserName, userName)) 
		{
			PMReport.pass("Username entered", true);
		} 
		else 
		{
			PMReport.fail("Username not entered", true);
			return false;
		}
		
		//Enter Password
		if(webUtil.sendKeys(txtPassword, password))
		{
			PMReport.pass("Password has been set", true);
		}
		else
		{
			PMReport.fail("Failed to set Password", true);
			return false;
			
		}

		//Clicked on login button
		webUtil.click(btnLogin);
		PMLogger.info("Login is successful");
		
		if(webUtil.driver.getCurrentUrl().equals("https://pmapps01t/webauth/loginpolicy.jsp"))
		{
			webUtil.click(rdoButton);
			PMLogger.info("Login policy accepted successfully");
			
			webUtil.click(btnAccept);
			PMLogger.info("Clicked on submit after clicked on accept radio button");
		}
		
		//Click on ltchistory1 link
			webUtil.click(linkTest1);
			PMLogger.info("Clicked on Test1ltchistory");

			//Click on Premium Quote link
			webUtil.click(linkPQuote);
			PMLogger.info("Clicked on Premium Quote link");
		
			//Enter policy to the text field
			if(webUtil.driver.getCurrentUrl().equals("https://pmapps01t/test1ltchistory/default/premiumquote/showPremiumQuote.action"))
			{
				webUtil.sendKeys(txtLTCPolicy, txtPolicy);
			}
			
			//Click on find button after enetring the policy
			webUtil.click(btnFind);
			
			
			webUtil.select(dropdwn_Proposed, txtPrpsdFacility);
			webUtil.select(drpDwn_Elimination, txtElimination);
			webUtil.select(drpDwn_Benefit, txtBenefit);		
			webUtil.click(btn_Submit);
			
		
//		if(webUtil.driver.getCurrentUrl().equals("https://pmapps01t/test1ltchistory/default/premiumquote/showPremiumQuote.action"))
//		{
			//Click on Logout
			webUtil.click(btnLogout);
			PMLogger.info("Logged out successfully!");
		//}

		

		return true;
	}

}