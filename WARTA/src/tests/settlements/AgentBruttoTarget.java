package tests.settlements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.eAgentObjects.BrowserFactory;
import base.eAgentObjects.StartPage;
import base.eAgentObjects.login.Login;
import base.eAgentObjects.login.Logins.username1;
import base.eAgentObjects.settlements.BrokerAgentSettlementDetailsPage;
import base.eAgentObjects.settlements.BrokerAgentSettlementPage;
import base.eAgentObjects.settlements.Settlements;

import org.junit.Test;


public class AgentBruttoTarget {
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	private int x = 1000;
	private String z = "";
	@Test
	public void Test() throws InterruptedException{
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA.toString);
			
		StartPage startPage = new StartPage();
		startPage.settlementGoTo();
		
		/*
		Daro Daro = new Daro();
		Daro.id(x, y);
			
		for (x = 0; x < IDArray.length; x++){
		*/
		Settlements settlements = new Settlements();
		//settlements.settlementsSearchInputFillUp(IDArray[x]);
		settlements.firstElementOfSettlementsSearchClick();
		
		String role;
		role = "Agent:";//z
		String id;
		id = " " + "GDAH00230000";
		//id1 = " " + (IDArray1[x]);
		BrokerAgentSettlementPage brokerAgentSettlementPage = new BrokerAgentSettlementPage();
		brokerAgentSettlementPage.roleAndIdTextCheck((role + id));
		
		
		WebElement element;
		element = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-fullname__value"));
		String nameAndCompanyFullName;
		nameAndCompanyFullName = "TOMASZ ZYGMUNT HERSTOWSKI NOWA GENERACJA UBEZPIECZEÑ";
		//nameAndCompanyFullName = IDArray[7];
		settlements.waitForTextToAppear(nameAndCompanyFullName, element);
		brokerAgentSettlementPage.nameAndComapnyFullNameTextCheck(nameAndCompanyFullName);
		
		
		brokerAgentSettlementPage.settlementClickOn(); //to nie zadzia³a, potrzeba id

		//brokerAgentSettlementPage.periodCheckValue("01-09-2016 - 15-09-2016"); nie dzia³a
		
		BrokerAgentSettlementDetailsPage brokerAgentSettlementDetailsPage = new BrokerAgentSettlementDetailsPage();
		
		
		brokerAgentSettlementDetailsPage.redirectionButtonClickAndCheckIfRedirected();
		
		brokerAgentSettlementDetailsPage.searchToogleClick();
			
		driver.quit();
		
		}
	//}
}
