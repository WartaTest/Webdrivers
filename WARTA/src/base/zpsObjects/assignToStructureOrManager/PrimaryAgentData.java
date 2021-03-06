package base.zpsObjects.assignToStructureOrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.eAgentObjects.BrowserFactory;

public class PrimaryAgentData {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void retailNetwork(){
	
	WebElement retailNetwork;
	retailNetwork = driver.findElement(By.id("idsiec"));
	}
	
	public void departamentDirector(String network){
	WebElement departamentDirector;
	departamentDirector = driver.findElement(By.id("iddep"));
	}
	
	public void macroregion(){
	WebElement macroregion;
	macroregion = driver.findElement(By.id("idmkr"));
	}
	
	public void director(){
	WebElement director;
	director = driver.findElement(By.id("iddyr"));
	}
	
	public void manager(){
	WebElement manager;
	manager = driver.findElement(By.id("idman"));
	}
	
	public void primaryAgentDataSearch(){
	WebElement primaryAgentDataSearch;
	primaryAgentDataSearch = driver.findElement(By.id("btnpfind"));
	}
	
	public void primaryAgentDataDateChangeSetDate(String date){
	WebElement primaryAgentDataDateChange;
	primaryAgentDataDateChange = driver.findElement(By.id("dtzm"));
	primaryAgentDataDateChange.sendKeys(date);
	}
	
	public void primaryAgentDataReasonFillUp(String reason){
	WebElement primaryAgentDataReason;
	primaryAgentDataReason = driver.findElement(By.id("descr"));
	primaryAgentDataReason.sendKeys(reason);
	}
	
	public void primaryAgentDataAcceptChangesClick(){
	WebElement primaryAgentDataAcceptChanges;
	primaryAgentDataAcceptChanges = driver.findElement(By.id("btnfind"));
	primaryAgentDataAcceptChanges.click();
}
	}