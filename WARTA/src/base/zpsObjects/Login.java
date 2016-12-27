package base.zpsObjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.eAgentObjects.BrowserFactory;

public class Login {
	
	public static void runLogin() throws InterruptedException {
	
	WebDriver driver = BrowserFactory.getBrowser("Firefox");
	driver.get("http://10.9.79.173:8080/zps/login");
	
	WebElement user;
	user = driver.findElement(By.id("user"));
	user.sendKeys("placeholder"); //trzeba dodac jakiegos usera (nie uzywac wlasnego)
	
	WebElement password;
	password = driver.findElement(By.xpath("//*[@id='loginForm']/table/tbody/tr[2]/td[2]/input"));
	password.sendKeys("placeholder");//i haslo
	
	WebElement loginButton;
	loginButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/table/tbody/tr[3]/td/input"));
	loginButton.click();
	
	WebElement wait = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(By.id("main_menu")));; 
				
}
}