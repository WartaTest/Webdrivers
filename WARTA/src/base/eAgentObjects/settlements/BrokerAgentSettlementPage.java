package base.eAgentObjects.settlements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.eAgentObjects.BrowserFactory;

public class BrokerAgentSettlementPage {
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void backButtonClick(){
		WebElement backButton;
		backButton = driver.findElement(By.className("tile-client-summary__back"));
		backButton.click();
	}
	
	public void roleNameCheck(String roleName){
		String roleNameValue;
		roleNameValue = driver.findElement(By.id("nie mam na co klikn¹æ")).getText(); //brak pola
		Assert.assertTrue(roleNameValue.contains(roleName));
		}
	
	public void roleAndIdTextCheck(String roleAndIdText){
		
		
		String roleAndIdValue;
		roleAndIdValue = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-username")).getText();
		Assert.assertTrue(roleAndIdValue.contains(roleAndIdText));
	}
	
	public void nameAndComapnyFullNameTextCheck(String nameAndComapnyFullNameText){
	String nameAndCompanyName;
	nameAndCompanyName = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-fullname__value")).getText();
	Assert.assertTrue(nameAndCompanyName.contains(nameAndComapnyFullNameText));	
	
	}
	
	public void debtCollectionTextCheck(String debtCollectionText){
		//brak id/klasy/cssSelektora
	}
	
	public void debtCollectionValueCheck(String debtCollectionValue){
		String debtCollectionValueCheck;
		debtCollectionValueCheck = driver.findElement(By.className("tile-settlement-summary__alert__content__variable")).getText();
		Assert.assertTrue(debtCollectionValueCheck.contains(debtCollectionValue));
	}
	
	public void debtCollectionLimitationTextCheck(String debtCollectionLimitationText){
		//brak id/klasy/cssSelektora
	}
	
	public void totalBalanceTextCheck(String totalBalanceText){
		//brak id/klasy/cssSelektora
	}
	
	public void totalBalanceValueCheck(String totalBalanceValue){
		String totalBalance;
		totalBalance = driver.findElement(By.className("tile-settlement-summary__equation__item__amount")).getText();
		Assert.assertTrue(totalBalance.contains(totalBalanceValue));
	}
	
	public void toPayTextCheck(String toPayText){
		//brak id/klasy/cssSelektora
	}
	
	public void toPayValueCheck(String toPayValue){
		String totalBalance;
		totalBalance = driver.findElement(By.className("tile-settlement-summary__value--wrong")).getText();
		Assert.assertTrue(totalBalance.contains(toPayValue));
	}
	
	public void lastPeriodBalanceTextCheck(String lastPeriodBalanceText){
		//brak id/klasy/cssSelektora
		
	}
	
	public void lastPeriodBalanceValueCheck(String lastPeriodBalanceValue){
		String totalBalance;
		totalBalance = driver.findElement(By.className("tile-settlement-summary__equation__item__amount")).getText();
		Assert.assertTrue(totalBalance.contains(lastPeriodBalanceValue));
	}
	
	public void commissionTextCheck(String commisionText){
		//nie by³o widoczne, potrzebne rozliczanie nontarget
	}
	
	public void commissionValueCheck(String commisionValue){
		//nie by³o widoczne, potrzebne rozliczanie nontarget
	}
	
	public void settlementApproachTextCheck(String settlementApproachText){
		//brak id/klasy/cssSelektora
	}
	
	public void settlementApproachValueCheck(String settlementApproachValue){
		String settlementApproachValueCheck;
		settlementApproachValueCheck = driver.findElement(By.className("bookmarks__bookmark__link")).getText();
		Assert.assertTrue(settlementApproachValueCheck.contains(settlementApproachValue));		
	}
	
	public void closedSettlementPeriods(String closedSettlementPeriods){
			//brak id/klasy/cssSelektora
	}
	
	public void settlementCheckText(String settlementCheckText){
			//brak id/klasy/cssSelektora
	}
	
	public void periodCheckText(String periodCheckText){
			//brak id/klasy/cssSelektora
	}
	
	public void statusCheckText(String statusCheckText){
			//brak id/klasy/cssSelektora
	}

	public void balancePeriodCheckText(String balancePeriodCheckText){
			//brak id/klasy/cssSelektora
}

	public void collectionCheckText(String collectionText){
			//brak id/klasy/cssSelektora
}

	public void commissionCheckText(String commissionCheckText){
			//brak id/klasy/cssSelektora
}

	public void leftToPayCheckText(String leftToPayCheck){
			//brak id/klasy/cssSelektora
}
	
	public void settlementCheckValue(String settlementCheckValue){
			//brak id/klasy/cssSelektora
	}
	
	public void periodCheckValue(String periodCheckValue){
			String period;
			period = driver.findElement(By.cssSelector("*[colid=\"period\"]:eq(0)")).getText();
			Assert.assertTrue(period.contains(periodCheckValue));		
	}
	
	public void statusCheckValue(String statusCheckValue){
			//brak id/klasy/cssSelektora
		
	}
	
	public void balancePeriodCheckValue(String balancePeriodCheckValue){
			//brak id/klasy/cssSelektora
		
	}
	
	public void collectionCheckValue(String collectionValue){
			//brak id/klasy/cssSelektora
		
	}
	
	public void commissionCheckValue(String commissionCheckValue){
			//brak id/klasy/cssSelektora
	}
			
	public void leftToPayCheckValue(String leftToPayCheckValue){
			//brak id/klasy/cssSelektora
	}
	
	public void settlementClickOn(){
			WebElement settlement;
			settlement = driver.findElement(By.className("ag-eagent-text-clickable"));
			settlement.click();
			
			WebElement wait = (new WebDriverWait(driver, 10))
					  .until(ExpectedConditions.presenceOfElementLocated(By.className("settlement-details-panel__item__content__info__icon")));;
						
	}
	
	public void currentURLcontains(String link){
		WebElement settlement;
	settlement = driver.findElement(By.xpath("//span[contains('"+link+"')]"));
}}