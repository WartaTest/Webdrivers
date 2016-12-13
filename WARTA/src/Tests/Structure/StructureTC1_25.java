package Tests.Structure;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.EAgent.BrowserFactory;
import Base.EAgent.CockpitOverview360;
import Base.EAgent.StartPage;
import Base.EAgent.StructureReports;
import Base.EAgent.Login.Login;
import Base.EAgent.Login.Logins.username1;

public class StructureTC1_25 {
	
	@Test
	public void structureTC1_25() throws InterruptedException{
	
	WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	Login login = new Login();
	login.RunLogin(username1.CENTRALA.toString);
	
	StartPage startPage = new StartPage();
	startPage.overview360();
	
	CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
	cockpitOverview360.structureToggle();
	
	StructureReports structureReports = new StructureReports();
	
	String netElementNumber1 = "WARDRCS02";
	structureReports.searchInputFillUp(netElementNumber1);

	
	Thread.sleep(3000);
	
	String structureElementValue1 = "CYPRIAN GRZÊDA";
	structureReports.structureReportElementCheck(structureElementValue1);
	
	driver.quit();
	}
}
