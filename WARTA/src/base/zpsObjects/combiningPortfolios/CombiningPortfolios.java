package base.zpsObjects.combiningPortfolios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.eAgentObjects.BrowserFactory;

public class CombiningPortfolios {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void primaryInputSearchFillUp(String searchkey){
				
		WebElement primaryInput;
		primaryInput = driver.findElement(By.id("idnad"));
		primaryInput.sendKeys(searchkey);	
	}
	
	public void primaryInputClear(){
		
		WebElement primaryInput;
		primaryInput = driver.findElement(By.id("idnad"));
		primaryInput.clear();	
	}
	
	public void secondaryInputSearchFillUp(String searchkey){
		WebElement secondaryInput;
		secondaryInput = driver.findElement(By.id("idpod"));
		secondaryInput.sendKeys(searchkey);		
	}
	
	public void secondaryInputClear(){
		WebElement secondaryInput;
		secondaryInput = driver.findElement(By.id("idpod"));
		secondaryInput.clear();		
	}
		
	public void searchButtonPortfolioClick(){
		WebElement searchButtonPortfolio;
		searchButtonPortfolio = driver.findElement(By.id("btnfind"));
		searchButtonPortfolio.click();
		
	}
		
	public void managementReportClick(){
		WebElement managementReport;
		managementReport = driver.findElement(By.id("hist-100-1"));
		managementReport.click();
	}
		
	public void operationReportClick(){
		WebElement operationReport;
		operationReport = driver.findElement(By.id("hist-100-2"));
		operationReport.click();
	}
	public void sorusReportClick(){
		WebElement sorusReport;
		sorusReport = driver.findElement(By.id("hist-100-3"));
		sorusReport.click();
	}
	
	public void discountBudgetKSWClick(){
	WebElement discountBudgetKSW;
	discountBudgetKSW = driver.findElement(By.id("hist-100-4"));
	discountBudgetKSW.click();
		}
		
	public void profitableAgentClick(){
	WebElement profitableAgent;
	profitableAgent = driver.findElement(By.id("hist-100-5"));
	profitableAgent.click();
		}
		
	public void commonCategorizationClick(){
	WebElement commonCategorization;
	commonCategorization = driver.findElement(By.id("hist-100-6"));
	commonCategorization.click();
		}
		
	public void walletServiceTransferClick(){
	WebElement walletServiceTransfer;
	walletServiceTransfer = driver.findElement(By.id("hist-100-7"));
	walletServiceTransfer.click();
		}
		
	public void resumptionPUMAClick(){
	WebElement resumptionPUMA;
	resumptionPUMA = driver.findElement(By.id("hist-100-8"));
	resumptionPUMA.click();
		}
		
	public void policyOffersClick(){
	WebElement policyOffers;
	policyOffers = driver.findElement(By.id("hist-100-9"));
	policyOffers.click();
		}
		
	public void offersClick(){
	WebElement offers;
	offers = driver.findElement(By.id("hist-100-10"));
	offers.click();
		}
		
	public void rightsToCommissionTransferClick(){
	WebElement rightsToCommissionTransfer;
	rightsToCommissionTransfer = driver.findElement(By.id("hist-100-11"));
	rightsToCommissionTransfer.click();
		}
}



