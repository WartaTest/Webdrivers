package Base.ZPS.combiningPortfolios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;

public class combiningPortfolios {
	
	public static void CombiningPortfolios() throws InterruptedException {
		
		WebDriver driver = browserFactory.getBrowser("Firefox");
		
		WebElement primaryInput;
		primaryInput = driver.findElement(By.id("idnad"));
		
		WebElement secondaryInput;
		primaryInput = driver.findElement(By.id("idpod"));
		
		WebElement searchButtonPortfolio;
		primaryInput = driver.findElement(By.id("btnfind"));
		
		
		
		WebElement managementReport;
		managementReport = driver.findElement(By.id("hist-100-1"));
		
		WebElement operationReport;
		operationReport = driver.findElement(By.id("hist-100-2"));
		
		WebElement sorusReport;
		sorusReport = driver.findElement(By.id("hist-100-3"));
		
		WebElement discountBudgetKSW;
		discountBudgetKSW = driver.findElement(By.id("hist-100-4"));
		
		WebElement profitableAgent;
		profitableAgent = driver.findElement(By.id("hist-100-5"));
		
		WebElement commonCategorization;
		commonCategorization = driver.findElement(By.id("hist-100-6"));
		
		WebElement walletServiceTransfer;
		walletServiceTransfer = driver.findElement(By.id("hist-100-7"));
		
		WebElement resumptionPUMA;
		resumptionPUMA = driver.findElement(By.id("hist-100-8"));
		
		WebElement policyOffers;
		policyOffers = driver.findElement(By.id("hist-100-9"));
		
		WebElement offers;
		offers = driver.findElement(By.id("hist-100-10"));
		
		WebElement rightsToCommissionTransfer;
		rightsToCommissionTransfer = driver.findElement(By.id("hist-100-11"));
		

}
}



