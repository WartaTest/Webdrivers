package Tests.Structure;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Base.EAgent.BrowserFactory;
import Base.EAgent.CockpitOverview360;
import Base.EAgent.StartPage;
import Base.EAgent.StructureReports;
import Base.EAgent.Login.Login;
import Base.EAgent.Login.Logins.username1;

public class KamilStructure 
{
	@Test
	public void KamilStructure() throws InterruptedException
	{

WebDriver driver = BrowserFactory.getBrowser("Firefox");
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA.toString);
		
		StartPage startPage = new StartPage();
		startPage.overview360();
		
		CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
		cockpitOverview360.structureToggle();
		
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
	
	
