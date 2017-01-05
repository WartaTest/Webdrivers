package base.eAgentObjects.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.eAgentObjects.BrowserFactory;
import base.eAgentObjects.login.Logins.password1;
import base.eAgentObjects.login.Logins.username1;


public class Login {

	
	

	private static boolean warning = false;

	public void RunLogin(username1 tostring) throws InterruptedException{
		WebDriver driver = BrowserFactory.getBrowser("Firefox");
		driver.get("xxx");

		
		WebElement username;
		username = driver.findElement(By.id("username"));
		username.sendKeys(username1.CENTRALA.toString());

		WebElement password;		
		password = driver.findElement(By.id("password"));
		password.sendKeys(password1.CENTRALA.toString());

		
		WebElement submit;
		submit = driver.findElement(By.xpath("//*[@id='fm1']/section[3]/input[4]"));
		submit.click();
	
		
		
		if (warning = driver.findElements(By.xpath("/html/body/div/div/div[2]/span/a")).size() >0)
				{WebElement warning;
				warning = driver.findElement(By.xpath("/html/body/div/div/div[2]/span/a"));
				warning.click();
			
				}
		else {
			   WebElement wait = (new WebDriverWait(driver, 10))
						  .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookmark_reports']/a")));;
							
			}
	}}
	