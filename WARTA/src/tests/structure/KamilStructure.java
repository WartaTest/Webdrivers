package tests.structure;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.eAgentObjects.BrowserFactory;
import base.eAgentObjects.CockpitOverview360;
import base.eAgentObjects.StartPage;
import base.eAgentObjects.StructureReports;
import base.eAgentObjects.login.Login;
import base.eAgentObjects.login.Logins.username1;

public class KamilStructure 
{
	@Test
	public void KamilStructure() throws InterruptedException
	{

		WebDriver driver = BrowserFactory.getBrowser("Firefox");
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA.toString);
		
		StartPage startPage = new StartPage();
		startPage.overview360GoTo();
		
		CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
		cockpitOverview360.structureToggleClick();
		
		Thread.sleep(3000);
		
		String netElementNumber1 = "GDAH00223000";
		StructureReports structureReports = new StructureReports();
		structureReports.searchInputFillUp(netElementNumber1);
				
		Thread.sleep(3000);
		
		String structureElementValue1 = "Junasz Waligóra";
		structureReports.structureReportElementCheck(structureElementValue1);
		
		structureReports.searchInputClear();
		
		
		
	}
}
	
	
