package Base.EAgent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Settlements {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void wealthSearchInput() {
	WebElement wealthSearchInput;
	wealthSearchInput = driver.findElement(By.id("search_combo_box_1_input"));
}
	
	public void wealthSearchButton(){
	WebElement wealthSearchButton;
	wealthSearchButton = driver.findElement(By.cssSelector("search-combo-box__search__standalone__button"));
		
	}
}