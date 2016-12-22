package Tests.Settlements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Test;

import Base.EAgent.BrowserFactory;
import Base.EAgent.StartPage;
import Base.EAgent.Login.Login;
import Base.EAgent.Login.Logins.username1;
import Base.EAgent.Settlements.BrokerAgentSettlementDetailsPage;
import Base.EAgent.Settlements.BrokerAgentSettlementPage;
import Base.EAgent.Settlements.Settlements;

import java.lang.System;

public class Settlement {
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	@Test
	public void Test() throws InterruptedException{
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA.toString);
		
		
		
		StartPage startPage = new StartPage();
		startPage.settlementGoTo();
		
		Settlements settlements = new Settlements();
		settlements.settlementsSearchInputFillUp("5504071");
		settlements.firstElementOfSettlementsSearchClick();
		
		String role;
		role = "Agent:";
		String id;
		id = " " + "GDAH00230000";
		BrokerAgentSettlementPage brokerAgentSettlementPage = new BrokerAgentSettlementPage();
		brokerAgentSettlementPage.roleAndIdTextCheck((role + id));
		
		
		WebElement element;
		element = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-fullname__value"));
		String nameAndCompanyFullName;
		nameAndCompanyFullName = "TOMASZ ZYGMUNT HERSTOWSKI NOWA GENERACJA UBEZPIECZEÑ";
		settlements.waitForTextToAppear(nameAndCompanyFullName, element);
		brokerAgentSettlementPage.nameAndComapnyFullNameTextCheck(nameAndCompanyFullName);
		
		
		brokerAgentSettlementPage.settlementClickOn();//to nie zadzia³a, potrzeba id

		//brokerAgentSettlementPage.periodCheckValue("01-09-2016 - 15-09-2016"); nie dzia³a
		
		BrokerAgentSettlementDetailsPage brokerAgentSettlementDetailsPage = new BrokerAgentSettlementDetailsPage();
		
		
		brokerAgentSettlementDetailsPage.redirectionButtonClickAndCheckIfRedirected();
		
		brokerAgentSettlementDetailsPage.searchToogleClick();
			
		driver.quit();
		}
}
