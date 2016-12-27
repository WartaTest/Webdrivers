package base.zpsObjects.assignToStructureOrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.eAgentObjects.BrowserFactory;

public class AssignToStructureOrManager {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");

	public void searchInputFillUp(String searchKeys){
		
		WebElement searchInput;
		searchInput = driver.findElement(By.id("idnad"));
		searchInput.sendKeys(searchKeys);
	}
	
	public void searchStructureManagerClick(String searchKeys){
		WebElement searchStructureManager;
		searchStructureManager = driver.findElement(By.id("btnfind"));
		searchStructureManager.click();
	}
	
	public void unselectAll(String searchKeys){
		WebElement unselectAll;
		unselectAll = driver.findElement(By.id("btnunselall"));
		unselectAll.click();
	}
	
	public void selectAll(String searchKeys){
		WebElement selectAll;
		selectAll = driver.findElement(By.id("btnselall"));
		selectAll.click();
	}
	
	public void editSelected(String searchKeys){
		WebElement editSelected;
		editSelected = driver.findElement(By.id("btnedit"));
		editSelected.click();
	}
	
	public void saveChanges(String searchKeys){
		WebElement saveChanges;
		saveChanges = driver.findElement(By.id("btnsave"));
		saveChanges.click();
}
}