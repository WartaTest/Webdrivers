package tests.structure;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.eAgentObjects.BrowserFactory;
import base.eAgentObjects.CockpitOverview360;
import base.eAgentObjects.StartPage;
import base.eAgentObjects.StructureReports;
import base.eAgentObjects.login.Login;
import base.eAgentObjects.login.Logins.username1;

public class StructureTC1_5_to_11 {
	@Test
	public void structureTC1_5_to_11() throws InterruptedException{
		
		WebDriver driver = BrowserFactory.getBrowser("Firefox");
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA.toString);
		
		StartPage startPage = new StartPage();
		startPage.overview360GoTo();
		
		CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
		cockpitOverview360.structureToggleClick();
		
		
		
		String netElementNumber1 = "WARD01MS02";
		StructureReports structureReports = new StructureReports();
		structureReports.searchInputFillUp(netElementNumber1);
				
		
		structureReports.searchInputClear();
		
		String structureElementValue1 = "£UKASZ TRZASKOMA";
		structureReports.structureReportElementCheck(structureElementValue1);
		
		
		
		structureReports.searchInputClear();
		
		
		String netElementNumber2 = "BIAH01MSOL";
		structureReports.searchInputFillUp(netElementNumber2);
		
		
		
		String structureElementValue2 = "PAWE£ MILEWSKI";
		structureReports.structureReportElementCheck(structureElementValue2);
		
		structureReports.searchInputClear();
		
		String netElementNumber3 = "KATD01MS01";
		structureReports.searchInputFillUp(netElementNumber3);
		
		
		
		String structureElementValue3 = "ANNA SROGA";
		structureReports.structureReportElementCheck(structureElementValue3);
		
		structureReports.searchInputClear();
		
		String netElementNumber4 = "GDAH01MSSL";
		structureReports.searchInputFillUp(netElementNumber4);
		
		
		
		String structureElementValue4 = "¯ANETA KOPACZ";
		structureReports.structureReportElementCheck(structureElementValue4);

		structureReports.searchInputClear();
		
		String netElementNumber5 = "BIAH01MSSE";
		structureReports.searchInputFillUp(netElementNumber5);
		
		
		
		String structureElementValue5 = "BART£OMIEJ ZIMMERMANN";
		structureReports.structureReportElementCheck(structureElementValue5);
		
		structureReports.searchInputClear();
		
		String netElementNumber6 = "LODDRCS01";
		structureReports.searchInputFillUp(netElementNumber6);
		
		
		
		String structureElementValue6 = "RYSZARDA OTTO";
		structureReports.structureReportElementCheck(structureElementValue6);
		
		structureReports.searchInputClear();
		
		String netElementNumber7 = "BIAH";
		structureReports.searchInputFillUp(netElementNumber7);
		
		
		
		String structureElementValue7 = "DOROTA WIERZCHOWSKA";
		structureReports.structureReportElementCheck(structureElementValue7);
		
		structureReports.searchInputClear();
		
		driver.quit();
}
}