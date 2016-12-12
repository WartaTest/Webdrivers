package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class startPage {
	
	private WebDriver driver = browserFactory.getBrowser("Firefox");

	public void cockipt(){
	WebElement cockipt = driver.findElement(By.xpath("//*[@id='bookmark_reports']/a"));
	cockipt.click();
	}
	
	public void wealth(){
	Actions action = new Actions(driver);
	WebElement cockipt = driver.findElement(By.xpath("//*[@id='bookmark_reports']/a"));
	WebElement wealth = driver.findElement(By.xpath("//*[@id='bookmark_property']/a"));
	action.moveToElement(cockipt).moveToElement(wealth).click().build().perform();	
	}
	
	public void overview360(){
	Actions action = new Actions(driver);
	WebElement cockipt = driver.findElement(By.xpath("//*[@id='bookmark_reports']/a"));
	WebElement overview360 = driver.findElement(By.xpath("//*[@id='bookmark_cockpit']/a"));
	action.moveToElement(cockipt).moveToElement(overview360).click().build().perform();
	WebElement wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("structure_toggle")));;
	}
	
	public void agreement(){
	WebElement agreement = driver.findElement(By.xpath("//*[@id='bookmark_policies']/a"));
	agreement.click();
	}
	
	public void clients(){
	WebElement clients = driver.findElement(By.xpath("//*[@id='bookmark_parties']/a"));
	clients.click();
	}
	
	public void settlement(){
	WebElement settlement = driver.findElement(By.xpath("//*[@id='bookmark_settlements']/a"));
	settlement.click();
	}
}
