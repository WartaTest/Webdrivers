package Base.ZPS.assignToStructureOrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;

public class primaryAgentData {
	
	public static void PrimaryAgentData() throws InterruptedException {
	
	WebDriver driver = browserFactory.getBrowser("Firefox");
	
	WebElement retailNetwork;
	retailNetwork = driver.findElement(By.id("idsiec"));
	
	WebElement departamentDirector;
	departamentDirector = driver.findElement(By.id("iddep"));
	
	WebElement macroregion;
	macroregion = driver.findElement(By.id("idmkr"));
	
	WebElement director;
	retailNetwork = driver.findElement(By.id("iddyr"));
	
	WebElement manager;
	retailNetwork = driver.findElement(By.id("idman"));
	
	WebElement primaryAgentDataSearch;
	primaryAgentDataSearch = driver.findElement(By.id("btnpfind"));
	
	WebElement primaryAgentDataDateChange;
	primaryAgentDataDateChange = driver.findElement(By.id("dtzm"));
	
	WebElement primaryAgentDataReason;
	primaryAgentDataReason = driver.findElement(By.id("descr"));
	
	WebElement primaryAgentDataAcceptChanges;
	primaryAgentDataAcceptChanges = driver.findElement(By.id("btnfind"));

}
	}