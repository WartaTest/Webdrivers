package base.eAgentObjects.clients;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.eAgentObjects.BrowserFactory;

public class Clients {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	
	public void surenameOrCompanyNameFillUp(String value){
	List <WebElement> surenameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	surenameOrCompanyName.get(0).sendKeys(value);	
		
	}
	
	
	
	public void nameFillUp(String value){
	List <WebElement> name = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	name.get(1).sendKeys(value);	
		
	}
	
	
	
	public void peselOrRegonOrNipFillUp(String value){
	List <WebElement> peselOrRegonOrNip = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	peselOrRegonOrNip.get(2).sendKeys(value);	
		
	}
	
	
	
	public void policyNumberFillUp(String value){
	List <WebElement> policyNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	policyNumber.get(3).sendKeys(value);	
		
	}
	
	
	
	public void registrationNumberFillUp(String value){
	List <WebElement> registrationNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	registrationNumber.get(4).sendKeys(value);	
		
	}
	
	
	
	public void emailAdresFillUp(String value){
	List <WebElement> emailAdres = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	emailAdres.get(5).sendKeys(value);	
		
	}
	
	
	
	public void phoneNumberFillUp(String value){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	nameOrCompanyName.get(6).sendKeys(value);	
		
	}
	
	
	
	public void vipOrPlatinumCardNumberFillUp(String value){
	List <WebElement> vipOrPlatinumCardNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	vipOrPlatinumCardNumber.get(7).sendKeys(value);	
		
	}
	
	
	
	public void vinNumberFillUp(String value){
	List <WebElement> vinNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	vinNumber.get(8).sendKeys(value);	
		
	}
	
	
	
	public void clientTypeChooseFromDropdownList(String value){
	WebElement clientTypeChoose = driver.findElement(By.className("grid-search__search__criteria__dropdown-button"));
	Select selectThis = new Select(clientTypeChoose);
	selectThis.selectByVisibleText(value);
		
	}
	
	
	
	public void cityFillUp(String value){
	List <WebElement> city = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	city.get(9).sendKeys(value);	
		
	}
	
	
	
	public void streetFillUp(String value){
	List <WebElement> street = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	street.get(10).sendKeys(value);	
		
	}
	
	
	
	public void houseNumberFillUp(String value){
	List <WebElement> houseNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	houseNumber.get(11).sendKeys(value);	
		
	}
	
	
	
	public void homeNumberFillUp(String value){
	List <WebElement> homeNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	homeNumber.get(12).sendKeys(value);	
		
	}
	
	
	
	public void zipCodeNumberFillUp(String value){
	List <WebElement> zipCodeNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	zipCodeNumber.get(13).sendKeys(value);	
		
	}
	
	
	
	public void dateOfBirthFromFillUp(String value){
	List <WebElement> dateOfBirthFrom = driver.findElements(By.className("form-control grid-search__search__criteria__input-text grid-search__search__criteria__input-text--datetime"));
	dateOfBirthFrom.get(0).sendKeys(value);	
		
	}
	
	
	
	public void dateOfBirthToFillUp(String value){
	List <WebElement> dateOfBirthTo = driver.findElements(By.className("form-control grid-search__search__criteria__input-text grid-search__search__criteria__input-text--datetime"));
	dateOfBirthTo.get(1).sendKeys(value);		
		
	}
	
	
	
	public void agentOrOfwcaChooseFromDropdownList(String value){
	WebElement agentOrOfwcaChoose = driver.findElement(By.className("grid-search__search__criteria__dropdown-button search-combo-box__grid-search__search__criteria__dropdown-button"));
	Select clickThis = new Select(agentOrOfwcaChoose);
	clickThis.selectByVisibleText(value);	
		
	}
	
	
	
	public void searchForClientButtonClickOn(String value){
	List <WebElement> searchForClientButton = driver.findElements(By.className("client-policies__search__actions__button-search"));
	searchForClientButton.get(0).sendKeys(value);	
		
	}
	
	
	/* do wyjasnienia, na razie z powodu b³edu nie jestem w stanie wyci¹gn¹æ elementu, nic siê nie wyœwietla
	public void placeholder(String text){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	nameOrCompanyName.get(0).sendKeys(text);	
		
	}
	
	
	
	public void placeholder1(String text){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	nameOrCompanyName.get(0).sendKeys(text);	
		
	}
	

	
	public void placeholder2(String text){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	nameOrCompanyName.get(0).sendKeys(text);	
		
	}
	
	public void placeholder3(String text){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	nameOrCompanyName.get(0).sendKeys(text);	
			
		}
	
	public void placeholder4(String text){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	nameOrCompanyName.get(0).sendKeys(text);	
			
		}
	
	public void placeholder5(String text){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	nameOrCompanyName.get(0).sendKeys(text);	
			
		}
		*/
	
	public void nameTabClickOn(String text){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("quick-search__search-response__advanced-panel__tab quick-search__search-response__advanced-panel__tab--active"));
	nameOrCompanyName.get(0).click();	
				
		}
	
	public void comapnyTabClickOn(String text){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("quick-search__search-response__advanced-panel__tab quick-search__search-response__advanced-panel__tab--active"));
	nameOrCompanyName.get(1).click();	
					
		}
	
	public void peselTabClickOn(String text){
		List <WebElement> peselTab = driver.findElements(By.className("quick-search__search-response__advanced-panel__content_column-extra-input__btn-group__element"));
		peselTab.get(0).click();
	
	}
	
	public void policyNumberTabClickOn(String text){
		List <WebElement> peselTab = driver.findElements(By.className("quick-search__search-response__advanced-panel__content_column-extra-input__btn-group__element"));
		peselTab.get(1).click();
	
	}
	
	public void rejNumberTabClickOn(String text){
		List <WebElement> peselTab = driver.findElements(By.className("quick-search__search-response__advanced-panel__content_column-extra-input__btn-group__element"));
		peselTab.get(2).click();
	
	}
	
	public void moveToClientButtonClickOn(){
		WebElement moveToClientButton = driver.findElement(By.className("quick-search__search-response__advanced-panel__content__search-button"));
		moveToClientButton.click();
	}

}
