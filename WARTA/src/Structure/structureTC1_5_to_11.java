package Structure;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.startPage;
import Base.Login.login;
import Base.Login.logins.username1;
import Base.browserFactory;
import Base.cockpitOverview360;

public class structureTC1_5_to_11 {
	@Test
	public void StructureTC1_5_to_11() throws InterruptedException{
		
		WebDriver driver = browserFactory.getBrowser("Firefox");
		
		login login = new login();
		login.RunLogin(username1.CENTRALA.toString);
		
		
		startPage Start = new startPage();
		
		Actions action = new Actions(driver);
		
		
		WebElement reports;
		reports = driver.findElement(By.id("structure_toggle"));
		reports.click();
		
		Thread.sleep(3000);
		
		String netElementNumber1 = "WARD01MS02";
		WebElement search;
		search = driver.findElement(By.id("search_combo_box_1_input"));
		search.sendKeys(netElementNumber1);				
		
		Thread.sleep(3000);
		
		String structureElementValue1 = "£UKASZ TRZASKOMA";
		WebElement structureElement;
		structureElement = driver.findElement(By.cssSelector(".search-combo-box-node__fullname"));
		structureElement.equals(structureElementValue1);
		Assert.assertEquals(driver.getPageSource().contains(structureElementValue1), true);
		
		WebElement structureElementClear;
		structureElementClear = driver.findElement(By.cssSelector(".search-combo-box--expanded__input.ng-valid"));
		
		structureElementClear.clear();
		
		String netElementNumber2 = "BIAH01MSOL";
		search.sendKeys(netElementNumber2);
		
		Thread.sleep(3000);
		
		String structureElementValue2 = "PAWE£ MILEWSKI";
		structureElement.equals(structureElementValue2);
		Assert.assertEquals(driver.getPageSource().contains(structureElementValue2), true);
		
		structureElementClear.clear();
		
		String netElementNumber3 = "KATD01MS01";
		search.sendKeys(netElementNumber3);
		
		Thread.sleep(3000);
		
		String structureElementValue3 = "ANNA SROGA";
		structureElement.equals(structureElementValue3);
		Assert.assertEquals(driver.getPageSource().contains(structureElementValue3), true);
		
		structureElementClear.clear();
		
		String netElementNumber4 = "GDAH01MSSL";
		search.sendKeys(netElementNumber4);
		
		Thread.sleep(3000);
		
		String structureElementValue4 = "¯ANETA KOPACZ";
		structureElement.equals(structureElementValue4);
		Assert.assertEquals(driver.getPageSource().contains(structureElementValue4), true);
		
		structureElementClear.clear();
		
		String netElementNumber5 = "BIAH01MSSE";
		search.sendKeys(netElementNumber5);
		
		Thread.sleep(3000);
		
		String structureElementValue5 = "BART£OMIEJ ZIMMERMANN";
		structureElement.equals(structureElementValue5);
		Assert.assertEquals(driver.getPageSource().contains(structureElementValue5), true);
		
		structureElementClear.clear();
		
		String netElementNumber6 = "LODDRCS01";
		search.sendKeys(netElementNumber6);
		
		Thread.sleep(3000);
		
		String structureElementValue6 = "RYSZARDA OTTO";
		structureElement.equals(structureElementValue6);
		Assert.assertEquals(driver.getPageSource().contains(structureElementValue6), true);
		
		structureElementClear.clear();
		
		String netElementNumber7 = "BIAH";
		search.sendKeys(netElementNumber7);
		
		Thread.sleep(3000);
		
		String structureElementValue7 = "DOROTA WIERZCHOWSKA";
		structureElement.equals(structureElementValue7);
		Assert.assertEquals(driver.getPageSource().contains(structureElementValue7), true);
		
		structureElementClear.clear();
		

}
}