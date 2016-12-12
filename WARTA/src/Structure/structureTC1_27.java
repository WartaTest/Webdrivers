package Structure;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;
import Base.cockpitOverview360;
import Base.startPage;
import Base.Login.login;
import Base.Login.logins.username1;

public class structureTC1_27 {
	
	@Test
	public void StructureTC1_27() throws InterruptedException{
	
	WebDriver driver = browserFactory.getBrowser("Firefox");
	
	login login = new login();
	login.RunLogin(username1.CENTRALA.toString);
	
	startPage startPage = new startPage();
	startPage.overview360();
	
	cockpitOverview360 cockpitOverview360 = new cockpitOverview360();
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
