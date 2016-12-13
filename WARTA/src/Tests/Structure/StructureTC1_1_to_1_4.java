package Tests.Structure;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.EAgent.BrowserFactory;
import Base.EAgent.CockpitOverview360;
import Base.EAgent.StartPage;
import Base.EAgent.StructureReports;
import Base.EAgent.Login.Login;
import Base.EAgent.Login.Logins.username1;


//od TC1.1 do TC1.4
public class StructureTC1_1_to_1_4 {
	@Test
public void structureTC1_1_to_1_4() throws InterruptedException{
		
		WebDriver driver = BrowserFactory.getBrowser("Firefox");
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA.toString);
		
		StartPage startPage = new StartPage();
		startPage.overview360GoTo();
		
		CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
		cockpitOverview360.structureToggleClick();
		
		StructureReports structureReport = new StructureReports();
		
		String netElementNumber = "WARD00026000";
		structureReport.searchInputFillUp(netElementNumber);
		
		WebElement expand;
		expand = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/search-combo-box/div/div[2]/search-combo-box-node/ul/li/div/div[1]"));
		expand.click();
		
		
		WebElement structureElement;
		structureElement = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/search-combo-box/div/div[2]/search-combo-box-node/ul/li/search-combo-box-node[1]/ul/li/div/div[2]/div[1]"));
		structureElement.equals("placeholder dla wartoœci od Dariuuuuszaaaa");		
		
		driver.quit();
		
	}
}