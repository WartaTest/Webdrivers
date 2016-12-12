package Base.ZPS.CombiningPortfolios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base.EAgent.BrowserFactory;

public class CombiningSellersPortfolios {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void previousPrimaryAgentNumber(String previousPrimaryNumber){		
		
		WebElement previousPrimaryAgentNumber;
		previousPrimaryAgentNumber = driver.findElement(By.id("idakt"));
		previousPrimaryAgentNumber.equals(previousPrimaryNumber);
	}
		
	public void secondayAgentNumberOption1(){
		
		Actions secondayAgentNumber = new Actions(driver);
		secondayAgentNumber.moveToElement(driver.findElement(By.id("idpod"))).click().moveToElement(driver.findElement(By.id("opt1")));
	}
	
	public void secondayAgentNumberOption2(){
		
		Actions secondayAgentNumber = new Actions(driver);
		secondayAgentNumber.moveToElement(driver.findElement(By.id("idpod"))).click().moveToElement(driver.findElement(By.id("opt2")));
	}
	
	public void newPrimaryAgentNumber(String newPrimaryNumber){
		WebElement newPrimaryAgentNumber;
		newPrimaryAgentNumber = driver.findElement(By.id("idnew"));
		newPrimaryAgentNumber.sendKeys(newPrimaryNumber);
	}
	
	public void forEachForCategoryCheckbox(String number){
		WebElement forEachForCategoryCheckbox;
		forEachForCategoryCheckbox = driver.findElement(By.id("allkat"));
		forEachForCategoryCheckbox.click();
	}
	
	public void combiningSellersPortfoliosDate(String date){
		WebElement combiningSellersPortfoliosDate;
		combiningSellersPortfoliosDate = driver.findElement(By.id("dtstart"));
		combiningSellersPortfoliosDate.sendKeys(date);
	}
	
	public void combiningSellersPortfoliosReason(String reason){
		WebElement combiningSellersPortfoliosReason;
		combiningSellersPortfoliosReason = driver.findElement(By.id("descr"));
		combiningSellersPortfoliosReason.sendKeys(reason);
	}
	
	public void combiningSellersPortfoliosSave(String number){
		WebElement combiningSellersPortfoliosSave;
		combiningSellersPortfoliosSave = driver.findElement(By.id("btnclr"));
		combiningSellersPortfoliosSave.click();
}
}