package Base.EAgent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Settlements {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void settlementsSearchInputFillUp(String Id) {
	WebElement wealthSearchInput;
	wealthSearchInput = driver.findElement(By.className("search-combo-box--expanded__input__standalone"));
	wealthSearchInput.sendKeys(Id);
	WebElement wait = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.className("search-combo-box-node__fullname")));; 
	}
	
	public void settlementsSearchInputClear() {
		WebElement wealthSearchInput;
		wealthSearchInput = driver.findElement(By.id("search_combo_box_1_input"));
		wealthSearchInput.clear();
	}
	
	public void settlementsSearchButtonClick(){
	WebElement wealthSearchButton;
	wealthSearchButton = driver.findElement(By.cssSelector("search-combo-box__search__standalone__button"));
	wealthSearchButton.click();
	}
	
	public void firstElementOfSettlementsSearchClick(){	
	WebElement firstElementOfSettlementsSearchClick;
	firstElementOfSettlementsSearchClick = driver.findElement(By.className("search-combo-box-node__fullname"));
	firstElementOfSettlementsSearchClick.click();
	
	}

}