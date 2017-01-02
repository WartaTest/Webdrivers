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
		
		String producerStateId = "5504071";
		
		Settlements settlements = new Settlements();
		settlements.settlementsSearchInputFillUp(producerStateId);
		settlements.firstElementOfSettlementsSearchClick();
		
		String role = "Agent:";
		String id =  " " + "GDAH00230000";
		BrokerAgentSettlementPage brokerAgentSettlementPage = new BrokerAgentSettlementPage();
		brokerAgentSettlementPage.roleAndIdTextCheck((role + id));
		
		String link = "https://eagenttst.warta.pl/view360/";
		brokerAgentSettlementPage.currentURLcontains(link);
		
		String balancePeriodCheckText = "";
		brokerAgentSettlementPage.balancePeriodCheckText(balancePeriodCheckText);
		
		String balancePeriodCheckValue = "";
		brokerAgentSettlementPage.balancePeriodCheckValue(balancePeriodCheckValue);
		
		String closedSettlementPeriods = "";
		brokerAgentSettlementPage.closedSettlementPeriods(closedSettlementPeriods);
		
		String collectionCheckText = "";
		brokerAgentSettlementPage.collectionCheckText(collectionCheckText);
		
		String collectionCheckValue = "";
		brokerAgentSettlementPage.collectionCheckValue(collectionCheckValue);
		
		String commisionTextCheck = "";
		brokerAgentSettlementPage.commissionTextCheck(commisionTextCheck);
		
		String commisionValueCheck = "";
		brokerAgentSettlementPage.commissionValueCheck(commisionValueCheck);
		
		String commissionCheckText = "";
		brokerAgentSettlementPage.commissionCheckText(commissionCheckText);
		
		String debtCollectionLimitationTextCheck = "";
		brokerAgentSettlementPage.debtCollectionLimitationTextCheck(debtCollectionLimitationTextCheck);
		
		String debtCollectionTextCheck = "";
		brokerAgentSettlementPage.debtCollectionTextCheck(debtCollectionTextCheck);
		
		String debtCollectionValueCheck = "";
		brokerAgentSettlementPage.debtCollectionValueCheck(debtCollectionValueCheck);
		
		String lastPeriodBalanceTextCheck = "";
		brokerAgentSettlementPage.lastPeriodBalanceTextCheck(lastPeriodBalanceTextCheck);
		
		String lastPeriodBalanceValueCheck = "";
		brokerAgentSettlementPage.lastPeriodBalanceValueCheck(lastPeriodBalanceValueCheck);
		
		String leftToPayCheckText = "";
		brokerAgentSettlementPage.leftToPayCheckText(leftToPayCheckText);
		
		String leftToPayCheckValue = "";
		brokerAgentSettlementPage.leftToPayCheckValue(leftToPayCheckValue);
		
		String nameAndComapnyFullNameTextCheck = "";
		brokerAgentSettlementPage.nameAndComapnyFullNameTextCheck(nameAndComapnyFullNameTextCheck);
		
		String periodCheckText = "";
		brokerAgentSettlementPage.periodCheckText(periodCheckText);
		
		String periodCheckValue = "";
		brokerAgentSettlementPage.periodCheckValue(periodCheckValue);
		
		String roleAndIdTextCheck = "";
		brokerAgentSettlementPage.roleAndIdTextCheck(roleAndIdTextCheck);
		
		String roleNameCheck = "";
		brokerAgentSettlementPage.roleNameCheck(roleNameCheck);
		
		String settlementApproachTextCheck = "";
		brokerAgentSettlementPage.settlementApproachTextCheck(settlementApproachTextCheck);
		
		String settlementApproachValueCheck = "";
		brokerAgentSettlementPage.settlementApproachValueCheck(settlementApproachValueCheck);
		
		String settlementCheckText = "";
		brokerAgentSettlementPage.settlementCheckText(settlementCheckText);
		
		String settlementCheckValue = "";
		brokerAgentSettlementPage.settlementCheckValue(settlementCheckValue);
		
		String statusCheckText = "";
		brokerAgentSettlementPage.statusCheckText(statusCheckText);
		
		String statusCheckValue = "";
		brokerAgentSettlementPage.statusCheckValue(statusCheckValue);
		
		String toPayTextCheck = "";
		brokerAgentSettlementPage.toPayTextCheck(toPayTextCheck);
		
		String toPayValueCheck = "";
		brokerAgentSettlementPage.toPayValueCheck(toPayValueCheck);
		
		String totalBalanceTextCheck = "";
		brokerAgentSettlementPage.totalBalanceTextCheck(totalBalanceTextCheck);
		
		String totalBalanceValueCheck = "";
		brokerAgentSettlementPage.totalBalanceValueCheck(totalBalanceValueCheck);
		
		brokerAgentSettlementPage.settlementClickOn();
		
		driver.quit();
	}
}