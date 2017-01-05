package base.eAgentObjects.settlements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.eAgentObjects.BrowserFactory;

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
	
	public void settlementDetailTextCheck(String settlementDetailText){
		//brak id/klasy/cssSelektora
		
	}
	
	public void settlementDetailNumberCheck(String settlementDetailText){
		String settlementDetailNumber;
		settlementDetailNumber = driver.findElement(By.className("settlement-details-menu__title ")).getText();
		Assert.assertTrue(settlementDetailNumber.contains(settlementDetailText));		
		
	}

	public void settlementDetailStatusCheck(String settlementDetailStatus){
	String settlementDetailsStatus;
	settlementDetailsStatus = driver.findElement(By.className("settlement-details-menu__subtitle")).getText();
	Assert.assertTrue(settlementDetailsStatus.contains(settlementDetailStatus));
	}
	
	public void balancePeriodCheckText(String balancePeriodCheck){
		//brak id/klasy/cssSelektora
	}
	
	public void balancePeriodCheckValue(String balancePeriodValue){
		String balancePeriodCheck;
		balancePeriodCheck = driver.findElement(By.className("settlement-details-equation__item__content__amount")).getText();
		Assert.assertTrue(balancePeriodCheck.contains(balancePeriodValue));
		
	}
	
	public void collectionCheckText(String collectionText){
		//brak id/klasy/cssSelektora
	}
	
	public void collectionCheckValue(String collectionValue){
	String collectionCheck;
	collectionCheck = driver.findElement(By.className("settlement-details-equation__item__content__amount")).getText();
	Assert.assertTrue(collectionCheck.contains(collectionValue));	
	}
	
	public void commissionCheckText(String commissionText){
		//brak id/klasy/cssSelektora
	}
	
	public void commissionCheckValueWithOK(String commissionValueWithOK){
		String commissionCheckWithOK;
		commissionCheckWithOK = driver.findElement(By.className("settlement-details-equation__item__content__amount--ok")).getText();
		Assert.assertTrue(commissionCheckWithOK.contains(commissionValueWithOK));	
	}
	
	public void commissionCheckValueWithoutOK(String commissionValueWithoutOK){
		String commissionCheckWithoutOK;
		commissionCheckWithoutOK = driver.findElement(By.className("settlement-details-equation__item__content__amount")).getText();
		Assert.assertTrue(commissionCheckWithoutOK.contains(commissionValueWithoutOK));

	}
	public void settlementDetailsPeriodTextAndValueCheck(String settlementDetailsPeriodTextAndValue){
		String settlementDetailsPeriod;
		settlementDetailsPeriod = driver.findElement(By.className("settlement-details-equation__item__period")).getText();
		Assert.assertTrue(settlementDetailsPeriod.contains(settlementDetailsPeriodTextAndValue));		
	}
	
	public void settlementDocuments(String settlementDocuments){
		//brak id/klasy/cssSelektora
		
	}
	
	public void settlementCollectionAndCommissionDocuments(String settlementCollectionAndCommissionDocuments){
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
	
	public void settlementContestTextCheck(String settlementContestText){
		//brak id/klasy/cssSelektora
	}
	
	public void productionSheet(String productionSheet){
		//brak id/klasy/cssSelektora
	}
	
	public void redirectionTextCheck(String redirectionText){
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
		

	public void proceedPaymentCheckText(String proceedPaymentText){
		//brak id/klasy/cssSelektora
	}
	
	public void requiredDateTextCheck(String requiredDateText){
		//brak id/klasy/cssSelektora
	}

	public void requiredDateValueCheck(String requiredDateValue){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}

	public void accountNumberTextCheck(String accountNumberText){
		//brak id/klasy/cssSelektora
}

	public void accountNumberValueCheck(String accountNumberValue){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}

	public void recieverCheckText(String recieverText){
		//brak id/klasy/cssSelektora
}

	public void recieverCheckValue(String recieverValue){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}

	public void recommendedTitleTextCheck(String recommendedTitleText){
		//brak id/klasy/cssSelektora
}

	public void recommendedTitleValueCheck(String recommendedTitleValue){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}

	public void AmountTextCheck(String AmountText){
		//brak id/klasy/cssSelektora
}

	public void AmountValueCheck(String AmountValue){
		//brak id/klasy/cssSelektora  col-md-8 jako class name wszedzie
}
	
	
	
	
	public void searchToogleClick(){
		WebElement searchToogle;
		searchToogle = driver.findElement(By.className("client-policies__search__actions__toggle-search__label__icon--magnifying-glass"));
		searchToogle.click();
	}
	
	public void numberOFWCAInSearchInputCheckText(String numberOFWCAInSearchInputText){
		//brak id/klasy/cssSelektora
	}
	
	public void numberOFWCAInSearchInputFillUp(String numberOFWCAInSearchInputValue){
//		WebElement numberOFWCAInSearchInput;
//		numberOFWCAInSearchInput = driver.findElement(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
//		numberOFWCAInSearchInput.sendKeys(value); taki same className jak numberOFWCA!!!!
	}

	public void nameOFWCAInSearchInputCheckText(String nameOFWCAInSearchInpuText){
		//brak id/klasy/cssSelektora
}

	public void nameOFWCAInSearchInputFillUp(String nameOFWCAInSearchInputValue){
//		WebElement nameOFWCAInSearchInput;
//		nameOFWCAInSearchInput = driver.findElement(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
//		nameOFWCAInSearchInput.sendKeys(value); taki same className jak numberOFWCA!!!!
}

	public void policyNumberInSearchInputCheckText(String policyNumberInSearchInputText){
		//brak id/klasy/cssSelektora
	}

	public void policyNumberInSearchInputFillUp(String policyNumberInSearchInputValue){
//		WebElement policyNumberInSearchInput;
//		policyNumberInSearchInput = driver.findElement(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
//		policyNumberInSearchInput.sendKeys(value); taki same className jak numberOFWCA!!!!
	}

	public void insurersLastNameAndNameInSearchInputCheckText(String insurersLastNameAndNameInSearchInputText){
		//brak id/klasy/cssSelektora
	}
	
	public void insurersLastNameAndNameInSearchInputFillUp(String insurersLastNameAndNameInSearchInputValue){
//		WebElement insurersLastNameAndNameInSearchInput;
//		insurersLastNameAndNameInSearchInput = driver.findElement(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
//		insurersLastNameAndNameInSearchInput.sendKeys(value); taki same className jak numberOFWCA!!!!
	}
	
	public void wayOfPaymentInSearchInputCheckText(String wayOfPaymentInSearchInputText){
		//brak id/klasy/cssSelektora
	}

	public void wayOfPaymentInSearchInputChooseFromDropdown(String wayOfPaymentInSearchInputDropdownListValue){
		WebElement dropDownListBox = driver.findElement(By.className("grid-search__search__criteria__dropdown-button"));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(wayOfPaymentInSearchInputDropdownListValue);
	}
	
	public void searchPoliciesButtonClick(){
	WebElement searchPoliciesButton;
	searchPoliciesButton = driver.findElement(By.className("client-policies__search__actions__button-search"));
	searchPoliciesButton.click(); 
		
		
	}
	

	public void policiesInThatSettlementPeriodCheckText(String policiesInThatSettlementPeriodText){
		//brak id/klasy/cssSelektora
}

	public void numberOFWCATextCheck(String numberOFWCAText){
		//brak id/klasy/cssSelektora
}
	
	public void numberOFWCAValueCheck(String numberOFWCAValue){
		//brak id/klasy/cssSelektora
	}
	
	public void nameOFWCATextCheck(String nameOFWCAText){
		//brak id/klasy/cssSelektora
	}
	
	public void nameOFWCAValueCheck(String nameOFWCAValue){
		//brak id/klasy/cssSelektora
	}
	
	public void policyTextCheck(String policyText){
		//brak id/klasy/cssSelektora
	}
	
	public void policyValueCheck(String policyValue){
		//brak id/klasy/cssSelektora
	}
	
	public void collectionInPolicyCheckText(String collectionInPolicyText){
		//brak id/klasy/cssSelektora
	}
	
	public void collectionInPolicyCheckValue(String collectionInPolicyValue){
		//brak id/klasy/cssSelektora
	}
	
	public void wayOfPaymentInPolicyCheckText(String wayOfPaymentInPolicyText){
		//brak id/klasy/cssSelektora
	}
	
	public void wayOfPaymentInPolicyCheckValue(String wayOfPaymentInPolicyValue){
		//brak id/klasy/cssSelektora
	}
	
	public void commissionInPolicyCheckText(String commissionInPolicyText){
		//brak id/klasy/cssSelektora
	}

	public void commissionInPolicyCheckValue(String commissionInPolicyValue){
		//brak id/klasy/cssSelektora
	}
	
	public void policyDocumentButtonCheckIfClickable(){
		WebElement policyDocumentButton;
		policyDocumentButton = driver.findElement(By.className("ag-eagent-special-column__icon ag-eagent-icon-download"));
		ExpectedConditions.elementToBeClickable(policyDocumentButton);
		}
	}





