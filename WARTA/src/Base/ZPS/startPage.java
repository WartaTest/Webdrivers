package Base.ZPS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;
import Base.ZPS.login;

public class startPage {
	
	public static void StartPage() throws InterruptedException {

	
	WebDriver driver = browserFactory.getBrowser("Firefox");
	
	login login = new login();
	login.Login();
	
	WebElement dictionary; 
	dictionary = driver.findElement(By.id("placeholder"));
	
	WebElement sales_structure;
	sales_structure = driver.findElement(By.id("placeholder"));
	
	
	
}
}