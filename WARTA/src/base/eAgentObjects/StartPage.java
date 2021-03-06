package base.eAgentObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");

	public void cockiptGoTo(){
	WebElement cockipt = driver.findElement(By.xpath("//*[@id='bookmark_reports']/a"));
	cockipt.click();
	}
	
	public void wealthGoTo(){
	Actions action = new Actions(driver);
	WebElement cockipt = driver.findElement(By.xpath("//*[@id='bookmark_reports']/a"));
	WebElement wealth = driver.findElement(By.xpath("//*[@id='bookmark_property']/a"));
	action.moveToElement(cockipt).moveToElement(wealth).click().build().perform();	
	}
	
	public void overview360GoTo(){
	Actions action = new Actions(driver);
	WebElement cockipt = driver.findElement(By.xpath("//*[@id='bookmark_reports']/a"));
	WebElement overview360 = driver.findElement(By.xpath("//*[@id='bookmark_cockpit']/a"));
	action.moveToElement(cockipt).moveToElement(overview360).click().build().perform();
	WebElement wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("structure_toggle")));;
	}
	
	public void agreementGoTo(){
	WebElement agreement = driver.findElement(By.xpath("//*[@id='bookmark_policies']/a"));
	agreement.click();
	}
	
	public void clientsGoTo(){
	WebElement clients = driver.findElement(By.xpath("//*[@id='bookmark_parties']/a"));
	clients.click();
	}
	
	public void settlementGoTo(){
	WebElement settlement = driver.findElement(By.xpath("//*[@id='bookmark_settlements']/a"));
	settlement.click();
	WebElement wait = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.className("search-combo-box--expanded__input__standalone")));;	
	}
	
	public void searchMagnifierIconClickOn(){
	WebElement searchMagnifierIcon;
	searchMagnifierIcon = driver.findElement(By.className("header-wrapper__top-menu__addition__link__icon--search"));
	searchMagnifierIcon.click();
	}
	
	public void searchClientsAndPoliciesFromTopMenuInputFillUp(){
	WebElement searchClientsAndPoliciesFromTopMenuInput;
	searchClientsAndPoliciesFromTopMenuInput = driver.findElement(By.className("quick-search__main__input__form-control "));
	searchClientsAndPoliciesFromTopMenuInput.click();
		}
	
	public void searchClientsAndPoliciesFromTopMenuButtonClickOn(){
	WebElement searchClientsAndPoliciesFromTopMenuButton;
	searchClientsAndPoliciesFromTopMenuButton = driver.findElement(By.className("quick-search__main__input"));
	searchClientsAndPoliciesFromTopMenuButton.click();
		}
	
	public void cancelSearchFromTopMenuClickOn(){
	WebElement cancelSearchFromTopMenu;
	cancelSearchFromTopMenu = driver.findElement(By.className("quick-search__main__close-button"));
	cancelSearchFromTopMenu.click();
	
	}
	
	public void clientsSearchResultClickOn(int SearchResultNumber){
	List <WebElement> clientsSearchResult = driver.findElements(By.className("quick-search__search-response__results-list__item__name"));	
	clientsSearchResult.get(SearchResultNumber).click();	
	}
	
	public void clientsSearchResultListPaginationClickOn(int PaginationNumber){
		
	List <WebElement> clientsSearchResult = driver.findElements(By.className("quick-search__search-response__results-list__pagination__page"));	
	clientsSearchResult.get(PaginationNumber).click();	
	}
}
