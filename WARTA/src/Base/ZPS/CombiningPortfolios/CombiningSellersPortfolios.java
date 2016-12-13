package Base.ZPS.CombiningPortfolios;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base.EAgent.BrowserFactory;

public class CombiningSellersPortfolios {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void previousPrimaryAgentNumber(String previousPrimaryNumber){		
		
		String previousPrimaryAgentNumber;
		previousPrimaryAgentNumber = driver.findElement(By.id("idakt")).getText();
		Assert.assertTrue(previousPrimaryAgentNumber.contains(previousPrimaryNumber));
		
	}
		
	public void secondaryAgentNumberOption1Choose(){
		
		Actions secondaryAgentNumber = new Actions(driver);
		secondaryAgentNumber.moveToElement(driver.findElement(By.id("idpod"))).click().moveToElement(driver.findElement(By.id("opt1"))).click();
	}
	
	public void secondaryAgentNumberOption2Choose(){
		
		Actions secondaryAgentNumber = new Actions(driver);
		secondaryAgentNumber.moveToElement(driver.findElement(By.id("idpod"))).click().moveToElement(driver.findElement(By.id("opt2"))).click();
	}
	
	public void newPrimaryAgentNumberFillUp(String newPrimaryNumber){
		WebElement newPrimaryAgentNumber;
		newPrimaryAgentNumber = driver.findElement(By.id("idnew"));
		newPrimaryAgentNumber.sendKeys(newPrimaryNumber);
	}
	
	public void forEachForCategoryCheckboxClick(String number){
		WebElement forEachForCategoryCheckbox;
		forEachForCategoryCheckbox = driver.findElement(By.id("allkat"));
		forEachForCategoryCheckbox.click();
	}
	
	public void combiningSellersPortfoliosDateSetDate(String date){
		WebElement combiningSellersPortfoliosDate;
		combiningSellersPortfoliosDate = driver.findElement(By.id("dtstart"));
		combiningSellersPortfoliosDate.sendKeys(date);
	}
	
	public void combiningSellersPortfoliosReasonFillUp(String reason){
		WebElement combiningSellersPortfoliosReason;
		combiningSellersPortfoliosReason = driver.findElement(By.id("descr"));
		combiningSellersPortfoliosReason.sendKeys(reason);
	}
	
	public void combiningSellersPortfoliosSaveClick(String number){
		WebElement combiningSellersPortfoliosSave;
		combiningSellersPortfoliosSave = driver.findElement(By.id("btnclr"));
		combiningSellersPortfoliosSave.click();
}
}