package tests.structure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import base.eAgentObjects.BrowserFactory;
import base.eAgentObjects.CockpitOverview360;
import base.eAgentObjects.StartPage;
import base.eAgentObjects.StructureReports;
import base.eAgentObjects.login.Login;
import base.eAgentObjects.login.Logins.username1;
import base.zpsObjects.changesForTestCases.ForTC1_14_to_1_15;

public class StructureTC1_12_to_1_15 {
	
	@Before
	public void changesForStructureTestCasesTC1_14_to_1_15(){
		
	ForTC1_14_to_1_15 forTC1_14_to_1_15 = new ForTC1_14_to_1_15();
	forTC1_14_to_1_15.forTC1_14_to_1_15();	
		
	}
	
	@Test
	public void structureTC1_12_to_1_15() throws InterruptedException{
	
	WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	Login login = new Login();
	login.RunLogin(username1.CENTRALA.toString);
	
	StartPage startPage = new StartPage();
	startPage.overview360GoTo();
	
	CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
	cockpitOverview360.structureToggleClick();
	
	StructureReports structureReport = new StructureReports();
	
	
	String netElementNumber1 = "WARD02MS11";
	structureReport.searchInputFillUp(netElementNumber1);
	
	
	String structureElementValue1 = "ARTUR TRZASKOMA";
	structureReport.structureReportElementCheck(structureElementValue1);
	Assert.assertEquals(driver.getPageSource().contains(netElementNumber1), true);
	Assert.assertEquals(driver.getPageSource().contains(structureElementValue1), true);
		
	structureReport.searchInputClear();
	
	String netElementNumber2 = "KRAH06MSKK";
	structureReport.searchInputFillUp(netElementNumber2);
	
	
	String structureElementValue2 = "MARIUSZ ¯UKIEWICZ";
	structureReport.structureReportElementCheck(structureElementValue2);
	Assert.assertEquals(driver.getPageSource().contains(netElementNumber2), true);
	Assert.assertEquals(driver.getPageSource().contains(structureElementValue2), true);
	
	structureReport.searchInputClear();
	
	String netElementNumber3 = "WARD03MSDR";
	structureReport.searchInputFillUp(netElementNumber3);
	
	
	String structureElementValue3 = "Brak wyników wyszukiwania";
	structureReport.structureReportElementCheck(structureElementValue3);
	Assert.assertEquals(driver.getPageSource().contains(structureElementValue3), true);
	
	structureReport.searchInputClear();
	
	String netElementNumber4 = "LUBD01MS08";
	structureReport.searchInputFillUp(netElementNumber4);
	
	
	structureReport.structureReportElementCheck(structureElementValue3);
	Assert.assertEquals(driver.getPageSource().contains(structureElementValue3), true);
	
	structureReport.searchInputClear();

	driver.quit();

}
}