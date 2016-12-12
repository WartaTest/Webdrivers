package Base.ZPS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.EAgent.BrowserFactory;
import Base.ZPS.Login;

public class StartPage {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void dictionary(){
		
	
	WebElement salesStructure;
	salesStructure = driver.findElement(By.xpath("//*[@id='main_menu']/ul/li[9]/ul/li[1]/a"));
	
	Actions mouseOverDictionary = new Actions(driver);
	WebElement dictionary = driver.findElement(By.xpath("//*[@id='main_menu']/ul/li[9]/a"));
	mouseOverDictionary.moveToElement(dictionary).moveToElement(salesStructure).click();
	}
	
	public void combiningPortfolios(){
	WebElement combiningPortgolios;
	combiningPortgolios = driver.findElement(By.xpath("//*[@id='main_menu']/ul/li[5]/a"));
	combiningPortgolios.click();
	}
	
	public void assignToStrutureOrManager(){
	WebElement assignToStrutureOrManager;
	assignToStrutureOrManager = driver.findElement(By.xpath("//*[@id='main_menu']/ul/li[7]/a"));
	assignToStrutureOrManager.click();
	}
	
}
