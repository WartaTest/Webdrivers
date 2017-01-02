package tests.structure;

import org.junit.Test;
import org.openqa.selenium.WebDriver;


import base.eAgentObjects.BrowserFactory;
import base.eAgentObjects.CockpitOverview360;
import base.eAgentObjects.StartPage;
import base.eAgentObjects.StructureReports;
import base.eAgentObjects.login.Login;
import base.eAgentObjects.login.Logins.username1;

public class StructureTC1_26 {
	
	@Test
	public void structureTC1_26() throws InterruptedException{
	
	WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	Login login = new Login();
	login.RunLogin(username1.CENTRALA);
	
	StartPage startPage = new StartPage();
	startPage.overview360GoTo();
	
	CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
	cockpitOverview360.structureToggleClick();
	
	StructureReports structureReports = new StructureReports();
	
	String netElementNumber1 = "TESH";
	structureReports.searchInputFillUp(netElementNumber1);
	
	
	String structureElementValue1 = "MICHA£ WÓJCIK";
	structureReports.structureReportElementCheck(structureElementValue1);
	
	driver.quit();
	}
}

