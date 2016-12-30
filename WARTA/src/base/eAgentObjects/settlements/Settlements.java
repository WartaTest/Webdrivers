package base.eAgentObjects.settlements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.eAgentObjects.BrowserFactory;

public class Settlements {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void settlementsSearchInputFillUp(String Id) {
	WebElement settlementSearchInput;
	settlementSearchInput = driver.findElement(By.className("search-combo-box--expanded__input__standalone"));
	settlementSearchInput.sendKeys(Id);
	WebElement wait = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.className("search-combo-box-node__fullname")));; 
	}
	
	public void settlementsSearchInputClear() {
		WebElement settlementsSearchInput;
		settlementsSearchInput = driver.findElement(By.id("search_combo_box_1_input"));
		settlementsSearchInput.clear();
	}
	
	public void settlementsSearchButtonClick(){
	WebElement settlementsSearchButton;
	settlementsSearchButton = driver.findElement(By.cssSelector("search-combo-box__search__standalone__button"));
	settlementsSearchButton.click();
	WebElement wait = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.className("tile-settlement-summary__agent-context__agent-fullname__value")));;
	}
			 
	public void waitForTextToAppear(String textToAppear, WebElement element) {
				    WebDriverWait wait = new WebDriverWait(driver,30);
				    wait.until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
				}
	
	
	public void firstElementOfSettlementsSearchClick(){	
	WebElement firstElementOfSettlementsSearchClick;
	firstElementOfSettlementsSearchClick = driver.findElement(By.className("search-combo-box-node__fullname"));
	firstElementOfSettlementsSearchClick.click();
	WebElement wait = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.className("tile-settlement-summary__agent-context__agent-fullname__value").className("ag-eagent-text-clickable")));;
		  		  
	}
}