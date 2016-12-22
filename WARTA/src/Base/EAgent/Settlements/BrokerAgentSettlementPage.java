package Base.EAgent.Settlements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.EAgent.BrowserFactory;

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
	
	public void roleAndIdTextCheck(String roleAndId){
		
		
		String roleAndIdValue;
		roleAndIdValue = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-username")).getText();
		Assert.assertTrue(roleAndIdValue.contains(roleAndId));
	}
	
	public void nameAndComapnyFullNameTextCheck(String nameAndCompanyFullName){
	String nameAndCompanyName;
	nameAndCompanyName = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-fullname__value")).getText();
	Assert.assertTrue(nameAndCompanyName.contains(nameAndCompanyFullName));	
	
	}
	
	public void debtCollectionTextCheck(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void debtCollectionValueCheck(String value){
		String debtCollectionValueCheck;
		debtCollectionValueCheck = driver.findElement(By.className("tile-settlement-summary__alert__content__variable")).getText();
		Assert.assertTrue(debtCollectionValueCheck.contains(value));
	}
	
	public void debtCollectionLimitationTextCheck(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void totalBalanceTextCheck(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void totalBalanceValueCheck(String value){
		String totalBalance;
		totalBalance = driver.findElement(By.className("tile-settlement-summary__equation__item__amount")).getText();
		Assert.assertTrue(totalBalance.contains(value));
	}
	
	public void toPayTextCheck(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void toPayValueCheck(String value){
		String totalBalance;
		totalBalance = driver.findElement(By.className("tile-settlement-summary__value--wrong")).getText();
		Assert.assertTrue(totalBalance.contains(value));
	}
	
	public void lastPeriodBalanceTextCheck(String text){
		//brak id/klasy/cssSelektora
		
	}
	
	public void lastPeriodBalanceValueCheck(String value){
		String totalBalance;
		totalBalance = driver.findElement(By.className("tile-settlement-summary__equation__item__amount")).getText();
		Assert.assertTrue(totalBalance.contains(value));
	}
	
	public void commisionTextCheck(String text){
		//nie by³o widoczne, potrzebne rozliczanie nontarget
	}
	
	public void commisionValueCheck(String value){
		//nie by³o widoczne, potrzebne rozliczanie nontarget
	}
	
	public void settlementApproachTextCheck(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void settlementApproachValueCheck(String value){
		String settlementApproachValueCheck;
		settlementApproachValueCheck = driver.findElement(By.className("bookmarks__bookmark__link")).getText();
		Assert.assertTrue(settlementApproachValueCheck.contains(value));		
	}
	
	public void closedSettlementPeriods(String text){
			//brak id/klasy/cssSelektora
	}
	
	public void settlementCheckText(String text){
			//brak id/klasy/cssSelektora
	}
	
	public void periodCheckText(String text){
			//brak id/klasy/cssSelektora
	}
	
	public void statusCheckText(String text){
			//brak id/klasy/cssSelektora
	}

	public void balancePeriodCheckText(String text){
			//brak id/klasy/cssSelektora
}

	public void collectionCheckText(String text){
			//brak id/klasy/cssSelektora
}

	public void commissionCheckText(String text){
			//brak id/klasy/cssSelektora
}

	public void leftToPayCheckText(String text){
			//brak id/klasy/cssSelektora
}
	
	public void settlementCheckValue(String value){
			//brak id/klasy/cssSelektora
	}
	
	public void periodCheckValue(String value){
			String period;
			period = driver.findElement(By.cssSelector("*[colid=\"period\"]:eq(0)")).getText();
			Assert.assertTrue(period.contains(value));		
	}
	
	public void statusCheckValue(String value){
			//brak id/klasy/cssSelektora
		
	}
	
	public void balancePeriodCheckValue(String value){
			//brak id/klasy/cssSelektora
		
	}
	
	public void collectionCheckValue(String value){
			//brak id/klasy/cssSelektora
		
	}
	
	public void commissionCheckValue(String value){
			//brak id/klasy/cssSelektora
	}
			
	public void leftToPayCheckValue(String value){
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