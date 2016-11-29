package Base;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.logins.password1;
import Base.logins.username1;


public class login {

	
	

	private static boolean warning = false;

	public static void RunLogin(username1 tostring) throws InterruptedException{
		WebDriver driver = browserFactory.getBrowser("Firefox");
		driver.get("https://eagenttst.warta.pl");

		
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
						  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='wrap']/div/ui-view/div/div/app-header/div/app-menu/header/div/div/div/div[1]/div[2]/bookmarks/div/bookmark/div/a")));;
							
			}
	}}
	