package Base.ZPS.combiningPortfolios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;

public class combiningSellersPortfolios {
	
public static void CombiningSellersPortfolios() throws InterruptedException {
		
		WebDriver driver = browserFactory.getBrowser("Firefox");
		
		WebElement previousPrimaryAgentNumber;
		previousPrimaryAgentNumber = driver.findElement(By.id("idakt"));
		
		WebElement secondayAgentNumber;
		secondayAgentNumber = driver.findElement(By.id("idpod"));
		
		WebElement newPrimaryAgentNumber;
		newPrimaryAgentNumber = driver.findElement(By.id("idnew"));
		
		WebElement forEachForCategoryCheckbox;
		forEachForCategoryCheckbox = driver.findElement(By.id("allkat"));
		
		WebElement combiningSellersPortfoliosDate;
		combiningSellersPortfoliosDate = driver.findElement(By.id("dtstart"));
		
		WebElement combiningSellersPortfoliosReason;
		combiningSellersPortfoliosReason = driver.findElement(By.id("descr"));
		
		WebElement combiningSellersPortfoliosSave;
		combiningSellersPortfoliosSave = driver.findElement(By.id("btnclr"));

}
}