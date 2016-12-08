package Base.ZPS.assignToStructureOrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;

public class assignToStructureOrManager {

	public static void AssignToStructureOrManager() throws InterruptedException {
		
		WebDriver driver = browserFactory.getBrowser("Firefox");
		
		WebElement searchInput;
		searchInput = driver.findElement(By.id("idnad"));
		
		WebElement searchStructureManager;
		searchStructureManager = driver.findElement(By.id("btnfind"));
		
		WebElement unselectAll;
		unselectAll = driver.findElement(By.id("btnunselall"));
		
		WebElement selectAll;
		selectAll = driver.findElement(By.id("btnselall"));
		
		WebElement editSelected;
		editSelected = driver.findElement(By.id("btnedit"));

		WebElement saveChanges;
		saveChanges = driver.findElement(By.id("btnsave"));
		
		
}
}