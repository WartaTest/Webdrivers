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
import Base.EAgent.Login.Login;
import Base.EAgent.Login.Logins.username1;

public class StructureTC1_12_to_1_15 {
	@Test
	public void structureTC1_12_to_1_15() throws InterruptedException{
	
	WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	Login login = new Login();
	login.RunLogin(username1.CENTRALA.toString);
	
	StartPage startPage = new StartPage();
	startPage.overview360();
	
	CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
	cockpitOverview360.structureToggle();
	
	Thread.sleep(3000);
	
	String netElementNumber1 = "WARD02MS11";
	WebElement search;
	search = driver.findElement(By.id("search_combo_box_1_input"));
	search.sendKeys(netElementNumber1);
	
	Thread.sleep(3000);
	
	String structureElementValue1 = "ARTUR TRZASKOMA";
	WebElement structureElement;
	structureElement = driver.findElement(By.id("search_combo_box_1_node_WARD02MS11"));
	structureElement.equals(structureElementValue1);
	Assert.assertEquals(driver.getPageSource().contains(netElementNumber1), true);
	Assert.assertEquals(driver.getPageSource().contains(structureElementValue1), true);
		
	WebElement structureElementClear;
	structureElementClear = driver.findElement(By.cssSelector(".search-combo-box--expanded__input.ng-valid"));
	
	structureElementClear.clear();
	
	String netElementNumber2 = "KRAH06MSKK";
	search.sendKeys(netElementNumber2);
	
	Thread.sleep(3000);
	
	String structureElementValue2 = "MARIUSZ ¯UKIEWICZ";
	structureElement.equals(structureElementValue2);
	Assert.assertEquals(driver.getPageSource().contains(netElementNumber2), true);
	Assert.assertEquals(driver.getPageSource().contains(structureElementValue2), true);
	
	structureElementClear.clear();
	
	String netElementNumber3 = "WARD03MSDR";
	search.sendKeys(netElementNumber3);
	
	Thread.sleep(3000);
	
	String structureElementValue3 = "Brak wyników wyszukiwania";
	structureElement.equals(structureElementValue3);
	Assert.assertEquals(driver.getPageSource().contains(structureElementValue3), true);
	
	structureElementClear.clear();
	
	String netElementNumber4 = "LUBD01MS08";
	search.sendKeys(netElementNumber4);
	
	Thread.sleep(3000);
	
	String structureElementValue5 = "Brak wyników wyszukiwania";
	structureElement.equals(structureElementValue5);
	Assert.assertEquals(driver.getPageSource().contains(structureElementValue5), true);
	
	structureElementClear.clear();

	
	

}
}