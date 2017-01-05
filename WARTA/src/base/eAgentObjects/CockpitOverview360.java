package base.eAgentObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CockpitOverview360{
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void structureToggleClick() {
				  
	WebElement structureToggle;
	structureToggle = driver.findElement(By.id("structure_toggle"));
	structureToggle.click();
	
	WebElement wait = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.id("search_combo_box_1_input")));;
	

	}
}