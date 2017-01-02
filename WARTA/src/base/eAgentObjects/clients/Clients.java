package base.eAgentObjects.clients;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.eAgentObjects.BrowserFactory;

public class Clients {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	
	public void surenameOrCompanyNameFillUp(String surenameOrCompanyNameValue){
	List <WebElement> surenameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	surenameOrCompanyName.get(0).sendKeys(surenameOrCompanyNameValue);	
		
	}
	
	
	
	public void nameFillUp(String nameValue){
	List <WebElement> name = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	name.get(1).sendKeys(nameValue);	
		
	}
	
	
	
	public void peselOrRegonOrNipFillUp(String peselOrRegonOrNipValue){
	List <WebElement> peselOrRegonOrNip = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	peselOrRegonOrNip.get(2).sendKeys(peselOrRegonOrNipValue);	
		
	}
	
	
	
	public void policyNumberFillUp(String policyNumberValue){
	List <WebElement> policyNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	policyNumber.get(3).sendKeys(policyNumberValue);	
		
	}
	
	
	
	public void registrationNumberFillUp(String registrationNumberValue){
	List <WebElement> registrationNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	registrationNumber.get(4).sendKeys(registrationNumberValue);	
		
	}
	
	
	
	public void emailAdresFillUp(String emailAdresValue){
	List <WebElement> emailAdres = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	emailAdres.get(5).sendKeys(emailAdresValue);	
		
	}
	
	
	
	public void phoneNumberFillUp(String phoneNumberValue){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	nameOrCompanyName.get(6).sendKeys(phoneNumberValue);	
		
	}
	
	
	
	public void vipOrPlatinumCardNumberFillUp(String vipOrPlatinumCardNumberValue){
	List <WebElement> vipOrPlatinumCardNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	vipOrPlatinumCardNumber.get(7).sendKeys(vipOrPlatinumCardNumberValue);	
		
	}
	
	
	
	public void vinNumberFillUp(String vinNumberValue){
	List <WebElement> vinNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	vinNumber.get(8).sendKeys(vinNumberValue);	
		
	}
	
	
	
	public void clientTypeChooseFromDropdownList(String clientTypeChooseValue){
	WebElement clientTypeChoose = driver.findElement(By.className("grid-search__search__criteria__dropdown-button"));
	Select selectThis = new Select(clientTypeChoose);
	selectThis.selectByVisibleText(clientTypeChooseValue);
		
	}
	
	
	
	public void cityFillUp(String cityValue){
	List <WebElement> city = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	city.get(9).sendKeys(cityValue);	
		
	}
	
	
	
	public void streetFillUp(String streetValue){
	List <WebElement> street = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	street.get(10).sendKeys(streetValue);	
		
	}
	
	
	
	public void houseNumberFillUp(String houseNumberValue){
	List <WebElement> houseNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	houseNumber.get(11).sendKeys(houseNumberValue);	
		
	}
	
	
	
	public void homeNumberFillUp(String homeNumberValue){
	List <WebElement> homeNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	homeNumber.get(12).sendKeys(homeNumberValue);	
		
	}
	
	
	
	public void zipCodeNumberFillUp(String zipCodeNumberValue){
	List <WebElement> zipCodeNumber = driver.findElements(By.className("form-control form-control--has-icon client-policies__search__criteria__input-text"));
	zipCodeNumber.get(13).sendKeys(zipCodeNumberValue);	
		
	}
	
	
	
	public void dateOfBirthFromFillUp(String dateOfBirthFromValue){
	List <WebElement> dateOfBirthFrom = driver.findElements(By.className("form-control grid-search__search__criteria__input-text grid-search__search__criteria__input-text--datetime"));
	dateOfBirthFrom.get(0).sendKeys(dateOfBirthFromValue);	
		
	}
	
	
	
	public void dateOfBirthToFillUp(String dateOfBirthToValue){
	List <WebElement> dateOfBirthTo = driver.findElements(By.className("form-control grid-search__search__criteria__input-text grid-search__search__criteria__input-text--datetime"));
	dateOfBirthTo.get(1).sendKeys(dateOfBirthToValue);		
		
	}
	
	
	
	public void agentOrOfwcaChooseFromDropdownList(String agentOrOfwcaChooseValue){
	WebElement agentOrOfwcaChoose = driver.findElement(By.className("grid-search__search__criteria__dropdown-button search-combo-box__grid-search__search__criteria__dropdown-button"));
	Select clickThis = new Select(agentOrOfwcaChoose);
	clickThis.selectByVisibleText(agentOrOfwcaChooseValue);	
		
	}
	
	
	
	public void searchForClientButtonClickOn(){
	List <WebElement> searchForClientButton = driver.findElements(By.className("client-policies__search__actions__button-search"));
	searchForClientButton.get(0).click();	
		
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
	
	public void nameTabClickOn(){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("quick-search__search-response__advanced-panel__tab quick-search__search-response__advanced-panel__tab--active"));
	nameOrCompanyName.get(0).click();	
				
		}
	
	public void comapnyTabClickOn(){
	List <WebElement> nameOrCompanyName = driver.findElements(By.className("quick-search__search-response__advanced-panel__tab quick-search__search-response__advanced-panel__tab--active"));
	nameOrCompanyName.get(1).click();	
					
		}
	
	public void peselTabClickOn(){
		List <WebElement> peselTab = driver.findElements(By.className("quick-search__search-response__advanced-panel__content_column-extra-input__btn-group__element"));
		peselTab.get(0).click();
	
	}
	
	public void policyNumberTabClickOn(){
		List <WebElement> peselTab = driver.findElements(By.className("quick-search__search-response__advanced-panel__content_column-extra-input__btn-group__element"));
		peselTab.get(1).click();
	
	}
	
	public void rejNumberTabClickOn(){
		List <WebElement> peselTab = driver.findElements(By.className("quick-search__search-response__advanced-panel__content_column-extra-input__btn-group__element"));
		peselTab.get(2).click();
	
	}
	
	public void moveToClientButtonClickOn(){
		WebElement moveToClientButton = driver.findElement(By.className("quick-search__search-response__advanced-panel__content__search-button"));
		moveToClientButton.click();
	}

}
