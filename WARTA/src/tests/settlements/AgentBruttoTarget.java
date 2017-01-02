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
import dataBase.RunTest;

import org.junit.Test;


public class AgentBruttoTarget {
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	private String SubjectType = "AGENT"; 
	private int x = 1000;
	private String z = "";
	@Test
	public void Test() throws InterruptedException{
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA.toString);
			
		StartPage startPage = new StartPage();
		startPage.settlementGoTo();
		
		
		
		RunTest runTest = new RunTest();
		//runTest.main();
					
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
		
//		brokerAgentSettlementPage.balancePeriodCheckText(balancePeriodCheckText);;
//		brokerAgentSettlementPage.balancePeriodCheckValue(balancePeriodCheckValue);
//		brokerAgentSettlementPage.closedSettlementPeriods(closedSettlementPeriods);
//		brokerAgentSettlementPage.collectionCheckText(collectionText);
//		brokerAgentSettlementPage.collectionCheckValue(collectionValue);
//		brokerAgentSettlementPage.commissionCheckText(commissionCheckText);
//		brokerAgentSettlementPage.commissionCheckValue(commissionCheckValue);
//		brokerAgentSettlementPage.commissionTextCheck(commisionText);
//		brokerAgentSettlementPage.commissionValueCheck(commisionValue);
//		brokerAgentSettlementPage.debtCollectionLimitationTextCheck(debtCollectionLimitationText);
//		brokerAgentSettlementPage.debtCollectionTextCheck(debtCollectionText);
//		brokerAgentSettlementPage.debtCollectionValueCheck(debtCollectionValue);
//		brokerAgentSettlementPage.lastPeriodBalanceTextCheck(lastPeriodBalanceText);
//		brokerAgentSettlementPage.lastPeriodBalanceValueCheck(lastPeriodBalanceValue);
//		brokerAgentSettlementPage.leftToPayCheckText(leftToPayCheck);
//		brokerAgentSettlementPage.leftToPayCheckValue(leftToPayCheckValue);
//		brokerAgentSettlementPage.periodCheckText(periodCheckText);
//		brokerAgentSettlementPage.periodCheckValue(periodCheckValue);
//		brokerAgentSettlementPage.roleAndIdTextCheck(roleAndIdText);
//		brokerAgentSettlementPage.roleNameCheck(roleName);
//		brokerAgentSettlementPage.settlementApproachTextCheck(settlementApproachText);
//		brokerAgentSettlementPage.settlementApproachValueCheck(settlementApproachValue);
//		brokerAgentSettlementPage.settlementCheckText(settlementCheckText);
//		brokerAgentSettlementPage.settlementCheckValue(settlementCheckValue);
//		brokerAgentSettlementPage.statusCheckText(statusCheckText);
//		brokerAgentSettlementPage.statusCheckValue(statusCheckValue);
//		brokerAgentSettlementPage.toPayTextCheck(toPayText);
//		brokerAgentSettlementPage.toPayValueCheck(toPayValue);
//		brokerAgentSettlementPage.totalBalanceTextCheck(totalBalanceText);
//		brokerAgentSettlementPage.totalBalanceValueCheck(totalBalanceValue);
		
		
		brokerAgentSettlementPage.settlementClickOn(); //to nie zadzia³a, potrzeba id

		//brokerAgentSettlementPage.periodCheckValue("01-09-2016 - 15-09-2016"); nie dzia³a
		
		BrokerAgentSettlementDetailsPage brokerAgentSettlementDetailsPage = new BrokerAgentSettlementDetailsPage();
		
//		brokerAgentSettlementDetailsPage.accountNumberTextCheck(accountNumberText);
//		brokerAgentSettlementDetailsPage.accountNumberValueCheck(accountNumberValue);
//		brokerAgentSettlementDetailsPage.AmountTextCheck(AmountText);
//		brokerAgentSettlementDetailsPage.AmountValueCheck(AmountValue);
//		brokerAgentSettlementDetailsPage.balancePeriodCheckText(balancePeriodCheck);
//		brokerAgentSettlementDetailsPage.balancePeriodCheckValue(balancePeriodCheckValue);
//		brokerAgentSettlementDetailsPage.collectionCheckText(collectionText);
//		brokerAgentSettlementDetailsPage.collectionCheckValue(collectionValue);
//		brokerAgentSettlementDetailsPage.collectionInPolicyCheckText(collectionInPolicyText);
//		brokerAgentSettlementDetailsPage.collectionInPolicyCheckValue(collectionInPolicyValue);
//		brokerAgentSettlementDetailsPage.commissionCheckText(commissionText);
//		brokerAgentSettlementDetailsPage.commissionCheckValueWithOK(commissionValueWithOK);
//		brokerAgentSettlementDetailsPage.commissionCheckValueWithoutOK(commissionValueWithoutOK);
//		brokerAgentSettlementDetailsPage.commissionInPolicyCheckText(commissionInPolicyText);
//		brokerAgentSettlementDetailsPage.commissionInPolicyCheckValue(commissionInPolicyValue);
//		brokerAgentSettlementDetailsPage.csvDocumentButtonCheckIfClickable();
//		brokerAgentSettlementDetailsPage.insurersLastNameAndNameInSearchInputCheckText(insurersLastNameAndNameInSearchInputText);
//		brokerAgentSettlementDetailsPage.insurersLastNameAndNameInSearchInputFillUp(insurersLastNameAndNameInSearchInputValue);
//		brokerAgentSettlementDetailsPage.nameAndComapnyFullNameCheck(nameAndCompanyFullName);
//		brokerAgentSettlementDetailsPage.
//		brokerAgentSettlementDetailsPage.
//		brokerAgentSettlementDetailsPage.
//		brokerAgentSettlementDetailsPage.
//		brokerAgentSettlementDetailsPage.
//		brokerAgentSettlementDetailsPage.
//		brokerAgentSettlementDetailsPage.
//		brokerAgentSettlementDetailsPage.
//		brokerAgentSettlementDetailsPage.
		
		
		brokerAgentSettlementDetailsPage.redirectionButtonClickAndCheckIfRedirected();
		
		
		
		
			
		driver.quit();
		
		}
	//}
}
