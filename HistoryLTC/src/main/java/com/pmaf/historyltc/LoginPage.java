package com.pmaf.historyltc;

import com.pmaf.test.PMAFHelper;
import com.pmaf.web.PMElement;

//import com.pm.test.PMAFHelper;
//import com.pm.web.PMElement;

public class LoginPage extends PMAFHelper 
{
                
	
	protected PMElement txtUserName = new PMElement("name", "userID");
	protected PMElement txtPassword = new PMElement("name", "password");//id=password(locator)
	protected PMElement btnLogin = new PMElement("name", "Submit");//id=Login(locator)
	//protected PMElement rdoButton = new PMElement("xpath", "/html/body/p/table/tbody/tr[5]/td/input[2]");
	
	
	protected String url = "https://pmapps01t/webauth/login.jsp?msg=Thank+you+for+using+the+PMIC+Access+Website";
	protected String userName;//to store the value of actual user name we need to enter
	protected String password;
	protected String txtPolicy;
	protected String txtPrpsdFacility;
	protected String txtElimination;
	protected String txtBenefit;
	
	protected PMElement rdoButton = new PMElement("xpath", "/html/body/p/table/tbody/tr[5]/td/input[2]");
	protected PMElement btnAccept = new PMElement("name", "Submit");
	protected PMElement linkTest1 = new PMElement("xpath", "/html/body/p/table/tbody/tr[19]/td/form/table/tbody/tr/td[1]/input[2]");
	protected PMElement linkPQuote = new PMElement("xpath", "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[14]/table/tbody/tr[2]/td[2]/table/tbody/tr/td/a");
	protected PMElement txtLTCPolicy = new PMElement("name", "policyNumber");
	protected PMElement btnFind = new PMElement("xpath", "/html/body/table/tbody/tr[4]/td[2]/form[1]/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/input[2]");
	protected PMElement txtProposedInitial = new PMElement("xpath", "/html/body/table/tbody/tr[4]/td[2]/form[1]/table[3]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[6]/b");
	protected PMElement dropdwn_Proposed = new PMElement ("name", "bnftAmt");
	protected PMElement drpDwn_Elimination = new PMElement("name", "elimDay");
	protected PMElement drpDwn_Benefit = new PMElement("name", "bnftPeriod");
	protected PMElement btn_Submit = new PMElement("xpath", "/html/body/table/tbody/tr[4]/td[2]/form[1]/table[3]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[23]/td[2]/input[1]");
	
	
	protected PMElement btnLogout = new PMElement("xpath", "/html/body/p/table/tbody/tr[25]/td/form/table/tbody/tr/td[1]/input");

}











