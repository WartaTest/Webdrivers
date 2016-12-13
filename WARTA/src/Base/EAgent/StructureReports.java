package Base.EAgent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StructureReports {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void searchInputFillUp(String Id){
		
		WebElement searchInput;
		searchInput = driver.findElement(By.id("search_combo_box_1_input"));
		searchInput.sendKeys(Id);
	}
	
	public void searchInputClear(){
		
		WebElement structureElementClear;
		structureElementClear = driver.findElement(By.cssSelector(".search-combo-box--expanded__input.ng-valid"));		
		structureElementClear.clear();
		
	}
	
	public void structureReportElementCheck(String value){
		
		String structureElement;
		structureElement = driver.findElement(By.cssSelector(".search-combo-box-node__fullname")).getText();
		Assert.assertTrue(structureElement.contains(value));
	}
	
}
