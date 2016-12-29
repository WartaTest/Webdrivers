package tests.structure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.eAgentObjects.BrowserFactory;
import base.eAgentObjects.CockpitOverview360;
import base.eAgentObjects.StartPage;
import base.eAgentObjects.StructureReports;
import base.eAgentObjects.login.Login;
import base.eAgentObjects.login.Logins.username1;
import base.zpsObjects.changesForTestCases.ForTC1_27;

public class StructureTC1_27 {
	
	@Before
	public void changesForStructureTestCases(){
	
	ForTC1_27 forTC1_27 = new ForTC1_27();	
	forTC1_27.forTC1_27();
	
	}	
	@Test
	public void structureTC1_27() throws InterruptedException{
	
	WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	Login login = new Login();
	login.RunLogin(username1.CENTRALA.toString);
	
	StartPage startPage = new StartPage();
	startPage.overview360GoTo();
	
	CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
	cockpitOverview360.structureToggleClick();
	
	StructureReports structureReports = new StructureReports();
		
	Assert.assertEquals(driver.getPageSource().contains("WARH"), false);
	Assert.assertEquals(driver.getPageSource().contains("MONIKA CIO£KIEWICZ UKLEJA"), false);
		
	String netElementNumber1 = "WARHMSDR";
	structureReports.searchInputFillUp(netElementNumber1);
	Assert.assertEquals(driver.getPageSource().contains("MONIKA RAWA"), false);
	
	structureReports.searchInputClear();
	
	String netElementNumber2 = "WARH01MSSK";
	structureReports.searchInputFillUp(netElementNumber2);
	Assert.assertEquals(driver.getPageSource().contains("MONIKA KO£TUÑ"), false);
	
	structureReports.searchInputClear();
	
	String netElementNumber3 = "WARH01MSW1";
	structureReports.searchInputFillUp(netElementNumber3);
	Assert.assertEquals(driver.getPageSource().contains("RENATA GALUS"), false);
	
	structureReports.searchInputClear();
	
	String netElementNumber4 = "WARH02MSW1";
	structureReports.searchInputFillUp(netElementNumber4);
	Assert.assertEquals(driver.getPageSource().contains("MICHA£ RATAJCZYK"), false);
	
	structureReports.searchInputClear();
	
	String netElementNumber5 = "WARH02MSLD";
	structureReports.searchInputFillUp(netElementNumber5);
	Assert.assertEquals(driver.getPageSource().contains("AGNIESZKA LEŒKIEWICZ"), false);
	
	
	structureReports.searchInputClear();
	
	String netElementNumber6 = "WARH04MSW1";
	structureReports.searchInputFillUp(netElementNumber6);
	
	Assert.assertEquals(driver.getPageSource().contains("MA£GORZATA PI£AT"), false);
	
	structureReports.searchInputClear();
	
	String netElementNumber7 = "WARH05MSW1";
	structureReports.searchInputFillUp(netElementNumber7);
	Assert.assertEquals(driver.getPageSource().contains("ANDRZEJ MERSKI"), false);
	
	structureReports.searchInputClear();
	
	driver.quit();
	
	}
}
