package tests.settlements;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.eAgentObjects.BrowserFactory;
import base.eAgentObjects.StartPage;
import base.eAgentObjects.login.Login;
import base.eAgentObjects.login.Logins.username1;
import base.eAgentObjects.settlements.BrokerAgentSettlementPage;
import base.eAgentObjects.settlements.Settlements;

public class SanityTest {
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
		
		String link = null;
		brokerAgentSettlementPage.currentURLcontains(link);
		
		String balancePeriodCheckText = null;
		brokerAgentSettlementPage.balancePeriodCheckText(balancePeriodCheckText);
		
		String balancePeriodCheckValue = null;
		brokerAgentSettlementPage.balancePeriodCheckValue(balancePeriodCheckValue);
		
		String text = null;
		brokerAgentSettlementPage.closedSettlementPeriods(text);
		
		String collectionCheckText = null;
		brokerAgentSettlementPage.collectionCheckText(collectionCheckText);
		
		String collectionCheckValue = null;
		brokerAgentSettlementPage.collectionCheckValue(collectionCheckValue);
		
		String commisionTextCheck = null;
		brokerAgentSettlementPage.commisionTextCheck(commisionTextCheck);
		
		String commisionValueCheck = null;
		brokerAgentSettlementPage.commisionValueCheck(commisionValueCheck);
		
		String commissionCheckText = null;
		brokerAgentSettlementPage.commissionCheckText(commissionCheckText);
		
		String debtCollectionLimitationTextCheck = null;
		brokerAgentSettlementPage.debtCollectionLimitationTextCheck(debtCollectionLimitationTextCheck);
		
		String debtCollectionTextCheck = null;
		brokerAgentSettlementPage.debtCollectionTextCheck(debtCollectionTextCheck);
		
		String debtCollectionValueCheck = null;
		brokerAgentSettlementPage.debtCollectionValueCheck(debtCollectionValueCheck);
		
		String lastPeriodBalanceTextCheck = null;
		brokerAgentSettlementPage.lastPeriodBalanceTextCheck(lastPeriodBalanceTextCheck);
		
		String lastPeriodBalanceValueCheck = null;
		brokerAgentSettlementPage.lastPeriodBalanceValueCheck(lastPeriodBalanceValueCheck);
		
		String leftToPayCheckText = null;
		brokerAgentSettlementPage.leftToPayCheckText(leftToPayCheckText);
		
		String leftToPayCheckValue = null;
		brokerAgentSettlementPage.leftToPayCheckValue(leftToPayCheckValue);
		
		String nameAndComapnyFullNameTextCheck = null;
		brokerAgentSettlementPage.nameAndComapnyFullNameTextCheck(nameAndComapnyFullNameTextCheck);
		
		String periodCheckText = null;
		brokerAgentSettlementPage.periodCheckText(periodCheckText);
		
		String periodCheckValue = null;
		brokerAgentSettlementPage.periodCheckValue(periodCheckValue);
		
		String roleAndIdTextCheck = null;
		brokerAgentSettlementPage.roleAndIdTextCheck(roleAndIdTextCheck);
		
		String roleNameCheck = null;
		brokerAgentSettlementPage.roleNameCheck(roleNameCheck);
		
		String settlementApproachTextCheck = null;
		brokerAgentSettlementPage.settlementApproachTextCheck(settlementApproachTextCheck);
		
		String settlementApproachValueCheck = null;
		brokerAgentSettlementPage.settlementApproachValueCheck(settlementApproachValueCheck);
		
		String settlementCheckText = null;
		brokerAgentSettlementPage.settlementCheckText(settlementCheckText);
		
		String settlementCheckValue = null;
		brokerAgentSettlementPage.settlementCheckValue(settlementCheckValue);
		
		String statusCheckText = null;
		brokerAgentSettlementPage.statusCheckText(statusCheckText);
		
		String statusCheckValue = null;
		brokerAgentSettlementPage.statusCheckValue(statusCheckValue);
		
		String toPayTextCheck = null;
		brokerAgentSettlementPage.toPayTextCheck(toPayTextCheck);
		
		String toPayValueCheck = null;
		brokerAgentSettlementPage.toPayValueCheck(toPayValueCheck);
		
		String totalBalanceTextCheck = null;
		brokerAgentSettlementPage.totalBalanceTextCheck(totalBalanceTextCheck);
		
		String totalBalanceValueCheck = null;
		brokerAgentSettlementPage.totalBalanceValueCheck(totalBalanceValueCheck);
		
		brokerAgentSettlementPage.settlementClickOn();
		
		driver.quit();
	}
}