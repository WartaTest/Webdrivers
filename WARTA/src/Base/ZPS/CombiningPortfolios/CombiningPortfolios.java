package Base.ZPS.CombiningPortfolios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.EAgent.BrowserFactory;

public class CombiningPortfolios {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void primaryInputSearch(String searchkey){
				
		WebElement primaryInput;
		primaryInput = driver.findElement(By.id("idnad"));
		primaryInput.sendKeys(searchkey);	
	}
	
	public void primaryInputClear(){
		
		WebElement primaryInput;
		primaryInput = driver.findElement(By.id("idnad"));
		primaryInput.clear();	
	}
	
	public void secondaryInputSearch(String searchkey){
		WebElement secondaryInput;
		secondaryInput = driver.findElement(By.id("idpod"));
		secondaryInput.sendKeys(searchkey);		
	}
	
	public void secondaryInputClear(){
		WebElement secondaryInput;
		secondaryInput = driver.findElement(By.id("idpod"));
		secondaryInput.clear();		
	}
		
	public void searchButtonPortfolio(){
		WebElement searchButtonPortfolio;
		searchButtonPortfolio = driver.findElement(By.id("btnfind"));
		searchButtonPortfolio.click();
		
	}
		
	public void managementReport(){
		WebElement managementReport;
		managementReport = driver.findElement(By.id("hist-100-1"));
		managementReport.click();
	}
		
	public void operationReport(){
		WebElement operationReport;
		operationReport = driver.findElement(By.id("hist-100-2"));
		operationReport.click();
	}
	public void sorusReport(){
		WebElement sorusReport;
		sorusReport = driver.findElement(By.id("hist-100-3"));
		sorusReport.click();
	}
	
	public void discountBudgetKSW(){
	WebElement discountBudgetKSW;
	discountBudgetKSW = driver.findElement(By.id("hist-100-4"));
	discountBudgetKSW.click();
		}
		
	public void profitableAgent(){
	WebElement profitableAgent;
	profitableAgent = driver.findElement(By.id("hist-100-5"));
	profitableAgent.click();
		}
		
	public void commonCategorization(){
	WebElement commonCategorization;
	commonCategorization = driver.findElement(By.id("hist-100-6"));
	commonCategorization.click();
		}
		
	public void walletServiceTransfer(){
	WebElement walletServiceTransfer;
	walletServiceTransfer = driver.findElement(By.id("hist-100-7"));
	walletServiceTransfer.click();
		}
		
	public void resumptionPUMA(){
	WebElement resumptionPUMA;
	resumptionPUMA = driver.findElement(By.id("hist-100-8"));
	resumptionPUMA.click();
		}
		
	public void policyOffers(){
	WebElement policyOffers;
	policyOffers = driver.findElement(By.id("hist-100-9"));
	policyOffers.click();
		}
		
	public void offers(){
	WebElement offers;
	offers = driver.findElement(By.id("hist-100-10"));
	offers.click();
		}
		
	public void rightsToCommissionTransfer(){
	WebElement rightsToCommissionTransfer;
	rightsToCommissionTransfer = driver.findElement(By.id("hist-100-11"));
	rightsToCommissionTransfer.click();
		}
}



