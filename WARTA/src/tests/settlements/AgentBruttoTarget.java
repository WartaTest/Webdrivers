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
import dataBase.Subjects;

import org.junit.Test;


public class AgentBruttoTarget {
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	@Test
	public void Test() throws Throwable{
		
		String subjectType = "AGENT";
		String settlementType = null; 
		int settlementLimit = 1000;
		
		RunTest runTest = new RunTest();
		runTest.getTestDataSettlements(settlementLimit, subjectType, settlementType);
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA);
			
		StartPage startPage = new StartPage();
		startPage.settlementGoTo();
			
		for (settlementLimit = 0;settlementLimit < Subjects.PartyID.length; settlementLimit++){
		
		Settlements settlements = new Settlements();
		settlements.settlementsSearchInputFillUp(Subjects.PartyID[settlementLimit]);
		settlements.firstElementOfSettlementsSearchClick();
		
		String role = "Agent:";
		String id = " " + (Subjects.PartyID[settlementLimit]);
		BrokerAgentSettlementPage brokerAgentSettlementPage = new BrokerAgentSettlementPage();
		brokerAgentSettlementPage.roleAndIdTextCheck((role + id));
		
		
		WebElement element = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-fullname__value"));
		String nameAndCompanyFullName = "TOMASZ ZYGMUNT HERSTOWSKI NOWA GENERACJA UBEZPIECZEÑ";
		//nameAndCompanyFullName = Subjects.costam[costam];
		settlements.waitForTextToAppear(nameAndCompanyFullName, element);
		brokerAgentSettlementPage.nameAndComapnyFullNameTextCheck(nameAndCompanyFullName);
		

//		brokerAgentSettlementPage.balancePeriodCheckText(balancePeriodCheckText);
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
		
		int settlementElements = 0;
		
		brokerAgentSettlementPage.settlementClickOn(settlementElements); //to nie zadzia³a, potrzeba id

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
	}
}
