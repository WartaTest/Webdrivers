package base.eAgentObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CockpitOverview360{
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void structureToggleClick() {
				  
	WebElement structureToggle;
	structureToggle = driver.findElement(By.id("structure_toggle"));
	structureToggle.click();

	}
}