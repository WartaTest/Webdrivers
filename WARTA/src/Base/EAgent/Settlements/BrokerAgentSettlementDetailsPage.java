package Base.EAgent.Settlements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Base.EAgent.BrowserFactory;

public class BrokerAgentSettlementDetailsPage {
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
	
	public void roleAndIdCheck(String roleAndId){
		
		String roleAndIdValue;
		roleAndIdValue = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-username")).getText();
		Assert.assertTrue(roleAndIdValue.contains(roleAndId));
	}
	
	public void nameAndComapnyFullNameCheck(String nameAndCompanyFullName){
	String nameAndCompanyName;
	nameAndCompanyName = driver.findElement(By.className("tile-settlement-summary__agent-context__agent-fullname__value")).getText();
	Assert.assertTrue(nameAndCompanyName.contains(nameAndCompanyFullName));	
	
	}
	
	public void backOnDetailsButtonClick(){
		WebElement backButton;
		backButton = driver.findElement(By.className("settlement-details-menu__back"));
		backButton.click();
		
	}
	
	public void settlementDetailTextCheck(String text){
		//brak id/klasy/cssSelektora
		
	}
	
	public void settlementDetailNumberCheck(String value){
		String settlementDetailNumber;
		settlementDetailNumber = driver.findElement(By.className("settlement-details-menu__title ")).getText();
		Assert.assertTrue(settlementDetailNumber.contains(value));		
		
	}

	public void settlementDetailStatusCheck(String value){
	String settlementDetailsStatus;
	settlementDetailsStatus = driver.findElement(By.className("settlement-details-menu__subtitle")).getText();
	Assert.assertTrue(settlementDetailsStatus.contains(value));
	}
	
	public void balancePeriodCheckText(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void balancePeriodCheckValue(String value){
		String balancePeriodCheck;
		balancePeriodCheck = driver.findElement(By.className("settlement-details-equation__item__content__amount")).getText();
		Assert.assertTrue(balancePeriodCheck.contains(value));
		
	}
	
	public void collectionCheckText(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void collectionCheckValue(String value){
	String collectionCheck;
	collectionCheck = driver.findElement(By.className("settlement-details-equation__item__content__amount")).getText();
	Assert.assertTrue(collectionCheck.contains(value));	
	}
	
	public void commissionCheckText(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void commissionCheckValueWithOK(String value){
		String commissionCheckWithOK;
		commissionCheckWithOK = driver.findElement(By.className("settlement-details-equation__item__content__amount--ok")).getText();
		Assert.assertTrue(commissionCheckWithOK.contains(value));	
	}
	
	public void commissionCheckValueWithoutOK(String value){
		String commissionCheckWithoutOK;
		commissionCheckWithoutOK = driver.findElement(By.className("settlement-details-equation__item__content__amount")).getText();
		Assert.assertTrue(commissionCheckWithoutOK.contains(value));

	}
	public void settlementDetailsPeriodTextAndValueCheck(String textAndValue){
		String settlementDetailsPeriod;
		settlementDetailsPeriod = driver.findElement(By.className("settlement-details-equation__item__period")).getText();
		Assert.assertTrue(settlementDetailsPeriod.contains(textAndValue));		
	}
	
	public void settlementDocuments(String text){
		//brak id/klasy/cssSelektora
		
	}
	
	public void settlementCollectionAndCommissionDocuments(String text){
		//brak id/klasy/cssSelektora
		}
	
	public void xlsDocumentButtonCheckIfClickable(){
		//settlement-details-documents__content__item__list__elem XLS i CSV maj¹ ten sam className
	}
	
	public void csvDocumentButtonCheckIfClickable(){
		//settlement-details-documents__content__item__list__elem XLS i CSV maj¹ ten sam className
	}
	
	public void pdfDocumentButtonCheckIfClickable(){
		WebElement pdfDocumentButton;
		pdfDocumentButton = driver.findElement(By.className("settlement-details-documents__content__item__list__elem-acc"));
		ExpectedConditions.elementToBeClickable(pdfDocumentButton);
		}
	
	public void settlementContestTextCheck(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void productionSheet(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void redirectionTextCheck(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void redirectionButtonClickAndCheckIfRedirected(){
		String parentHandle = driver.getWindowHandle();
		WebElement redirectionButton;
		redirectionButton = driver.findElement(By.className("settlement-details-panel__item__content__info__icon"));
		redirectionButton.click();
		
		
		String eAgentURL = "https://eagenttst.warta.pl/";
	
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle);
		    String currentURL = driver.getCurrentUrl();
			String ePlatformaURL = "https://eplatforma.warta.pl/t2013/";
			Assert.assertTrue(currentURL.contains(ePlatformaURL));	
		}
		driver.close(); 
		driver.switchTo().window(parentHandle);
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains(eAgentURL));
	}
		

	public void proceedPaymentCheckText(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void requiredDateTextCheck(String text){
		//brak id/klasy/cssSelektora
	}

	public void requiredDateValueCheck(String value){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}

	public void accountNumberTextCheck(String text){
		//brak id/klasy/cssSelektora
}

	public void accountNumberValueCheck(){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}

	public void recieverCheckText(String text){
		//brak id/klasy/cssSelektora
}

	public void recieverCheckValue(String value){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}

	public void recommendedTitleTextCheck(String text){
		//brak id/klasy/cssSelektora
}

	public void recommendedTitleValueCheck(String value){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}

	public void AmountTextCheck(String text){
		//brak id/klasy/cssSelektora
}

	public void AmountValueCheck(String value){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}
	
	
	
	
	public void searchToogleClick(){
		WebElement searchToogle;
		searchToogle = driver.findElement(By.className("client-policies__search__actions__toggle-search__label__icon--magnifying-glass"));
		searchToogle.click();
	}
	
	public void numberOFWCAInSearchInputCheckText(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void numberOFWCAInSearchInputFillUp(String value){
//		WebElement numberOFWCAInSearchInput;
//		numberOFWCAInSearchInput = driver.findElement(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
//		numberOFWCAInSearchInput.sendKeys(value); taki same className jak numberOFWCA!!!!
	}

	public void nameOFWCAInSearchInputCheckText(String text){
		//brak id/klasy/cssSelektora
}

	public void nameOFWCAInSearchInputFillUp(String value){
//		WebElement nameOFWCAInSearchInput;
//		nameOFWCAInSearchInput = driver.findElement(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
//		nameOFWCAInSearchInput.sendKeys(value); taki same className jak numberOFWCA!!!!
}

	public void policyNumberInSearchInputCheckText(String text){
		//brak id/klasy/cssSelektora
	}

	public void policyNumberInSearchInputFillUp(String value){
//		WebElement policyNumberInSearchInput;
//		policyNumberInSearchInput = driver.findElement(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
//		policyNumberInSearchInput.sendKeys(value); taki same className jak numberOFWCA!!!!
	}

	public void insurersLastNameAndNameInSearchInputCheckText(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void insurersLastNameAndNameInSearchInputFillUp(String value){
//		WebElement insurersLastNameAndNameInSearchInput;
//		insurersLastNameAndNameInSearchInput = driver.findElement(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
//		insurersLastNameAndNameInSearchInput.sendKeys(value); taki same className jak numberOFWCA!!!!
	}
	
	public void wayOfPaymentInSearchInputCheckText(String text){
		//brak id/klasy/cssSelektora
	}

	public void wayOfPaymentInSearchInputChooseFromDropdown(String dropDownListValue){
		WebElement dropDownListBox = driver.findElement(By.className("grid-search__search__criteria__dropdown-button"));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(dropDownListValue);
	}
	
	public void searchPoliciesButtonClick(){
	WebElement searchPoliciesButton;
	searchPoliciesButton = driver.findElement(By.className("client-policies__search__actions__button-search"));
	searchPoliciesButton.click(); 
		
		
	}
	

	public void policiesInThatSettlementPeriodCheckText(String text){
		//brak id/klasy/cssSelektora
}

	public void numberOFWCATextCheck(String text){
		//brak id/klasy/cssSelektora
}
	
	public void numberOFWCAValueCheck(String value){
		//brak id/klasy/cssSelektora
	}
	
	public void nameOFWCATextCheck(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void nameOFWCAValueCheck(String value){
		//brak id/klasy/cssSelektora
	}
	
	public void policyTextCheck(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void policyValueCheck(String value){
		//brak id/klasy/cssSelektora
	}
	
	public void collectionInPolicyCheckText(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void collectionInPolicyCheckValue(String value){
		//brak id/klasy/cssSelektora
	}
	
	public void wayOfPaymentInPolicyCheckText(String text){
		//brak id/klasy/cssSelektora
	}
	
	public void wayOfPaymentInPolicyCheckValue(String value){
		//brak id/klasy/cssSelektora
	}
	
	public void commissionInPolicyCheckText(String text){
		//brak id/klasy/cssSelektora
	}

	public void commissionInPolicyCheckValue(String value){
		//brak id/klasy/cssSelektora
	}
	
	public void policyDocumentButtonCheckIfClickable(){
		WebElement policyDocumentButton;
		policyDocumentButton = driver.findElement(By.className("ag-eagent-special-column__icon ag-eagent-icon-download"));
		ExpectedConditions.elementToBeClickable(policyDocumentButton);
		}
	}





