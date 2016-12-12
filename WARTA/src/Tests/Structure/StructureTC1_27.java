package Tests.Structure;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.EAgent.BrowserFactory;
import Base.EAgent.CockpitOverview360;
import Base.EAgent.StartPage;
import Base.EAgent.Login.Login;
import Base.EAgent.Login.Logins.username1;

public class StructureTC1_27 {
	
	@Test
	public void structureTC1_27() throws InterruptedException{
	
	WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	Login login = new Login();
	login.RunLogin(username1.CENTRALA.toString);
	
	StartPage startPage = new StartPage();
	startPage.overview360();
	
	CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
	cockpitOverview360.structureToggle();
	
	Thread.sleep(6000);
	
	WebElement hdi;
	hdi = driver.findElement(By.id("search_combo_box_1_input"));
	hdi.click();
	
	Assert.assertEquals(driver.getPageSource().contains("WARH"), false);
	Assert.assertEquals(driver.getPageSource().contains("MONIKA CIO£KIEWICZ UKLEJA"), false);
	
	
	String netElementNumber1 = "WARHMSDR";
	WebElement search;
	search = driver.findElement(By.id("search_combo_box_1_input"));
	search.sendKeys(netElementNumber1);
	
	Thread.sleep(3000);
	
	Assert.assertEquals(driver.getPageSource().contains("MONIKA RAWA"), false);
	
	WebElement structureElementClear;
	structureElementClear = driver.findElement(By.cssSelector(".search-combo-box--expanded__input.ng-valid"));
	
	structureElementClear.clear();
	
	String netElementNumber2 = "WARH01MSSK";
	search.sendKeys(netElementNumber2);
	
	Thread.sleep(3000);
	
	Assert.assertEquals(driver.getPageSource().contains("MONIKA KO£TUÑ"), false);
	
	structureElementClear.clear();
	
	String netElementNumber3 = "WARH01MSW1";
	search.sendKeys(netElementNumber3);
	
	Thread.sleep(3000);
	
	Assert.assertEquals(driver.getPageSource().contains("RENATA GALUS"), false);
	
	structureElementClear.clear();
	
	String netElementNumber4 = "WARH02MSW1";
	search.sendKeys(netElementNumber4);
	
	Thread.sleep(3000);
	
	Assert.assertEquals(driver.getPageSource().contains("MICHA£ RATAJCZYK"), false);
	
	structureElementClear.clear();
	
	String netElementNumber5 = "WARH02MSLD";
	search.sendKeys(netElementNumber5);
	
	Thread.sleep(3000);
	
	Assert.assertEquals(driver.getPageSource().contains("AGNIESZKA LEŒKIEWICZ"), false);
	
	
	structureElementClear.clear();
	
	String netElementNumber6 = "WARH04MSW1";
	search.sendKeys(netElementNumber6);
	
	Thread.sleep(3000);
	
	Assert.assertEquals(driver.getPageSource().contains("MA£GORZATA PI£AT"), false);
	
	structureElementClear.clear();
	
	String netElementNumber7 = "WARH05MSW1";
	search.sendKeys(netElementNumber7);
	
	Thread.sleep(3000);
	
	Assert.assertEquals(driver.getPageSource().contains("ANDRZEJ MERSKI"), false);
	
	structureElementClear.clear();
	
}
	}
