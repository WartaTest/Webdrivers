package tests.structure;

import org.junit.Test;
import org.openqa.selenium.WebDriver;


import base.eAgentObjects.BrowserFactory;
import base.eAgentObjects.CockpitOverview360;
import base.eAgentObjects.StartPage;
import base.eAgentObjects.StructureReports;
import base.eAgentObjects.login.Login;
import base.eAgentObjects.login.Logins.username1;

public class StructureTC1_25 {
	
	@Test
	public void structureTC1_25() throws InterruptedException{
	
	WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	Login login = new Login();
	login.RunLogin(username1.CENTRALA.toString);
	
	StartPage startPage = new StartPage();
	startPage.overview360GoTo();
	
	CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
	cockpitOverview360.structureToggleClick();
	
	StructureReports structureReports = new StructureReports();
	
	String netElementNumber1 = "WARDRCS02";
	structureReports.searchInputFillUp(netElementNumber1);

	
	Thread.sleep(3000);
	
	String structureElementValue1 = "CYPRIAN GRZÊDA";
	structureReports.structureReportElementCheck(structureElementValue1);
	
	driver.quit();
	}
}
