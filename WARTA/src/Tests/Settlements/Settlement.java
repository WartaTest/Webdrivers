package Tests.Settlements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Test;

import Base.EAgent.BrowserFactory;
import Base.EAgent.StartPage;
import Base.EAgent.Login.Login;
import Base.EAgent.Login.Logins.username1;
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
		brokerAgentSettlementPage.roleAndIdCheck((role + id));
		
		
		WebElement element;
		element = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-fullname__value"));
		String nameAndCompanyFullName;
		nameAndCompanyFullName = "TOMASZ ZYGMUNT HERSTOWSKI NOWA GENERACJA UBEZPIECZEÑ";
		settlements.waitForTextToAppear(nameAndCompanyFullName, element);
		brokerAgentSettlementPage.nameAndComapnyFullNameCheck(nameAndCompanyFullName);
		
		Thread.sleep(6000);
		

		brokerAgentSettlementPage.settlementClickOn("RSP/16414986/16/1716");

		//brokerAgentSettlementPage.periodCheckValue("01-09-2016 - 15-09-2016");
		
			
		//driver.quit();
		}
}
