package Structure;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.browserFactory;
import Base.cockpitOverview360;
import Base.startPage;
import Base.Login.login;
import Base.Login.logins.username1;


//od TC1.1 do TC1.4
public class structureTC1_1_to_1_4 {
	@Test
public void StructureTC1_1_to_1_4() throws InterruptedException{
		
		WebDriver driver = browserFactory.getBrowser("Firefox");
		
		login login = new login();
		login.RunLogin(username1.CENTRALA.toString);
		
		startPage startPage = new startPage();
		startPage.overview360();
		
		cockpitOverview360 cockpitOverview360 = new cockpitOverview360();
		cockpitOverview360.structureToggle();
		
		Thread.sleep(5000);
		
		String netElementNumber = "WARD00026000";
		WebElement search;
		search = driver.findElement(By.id("search_combo_box_1_input"));
		search.sendKeys(netElementNumber);
	
		Thread.sleep(5000);
		
		WebElement expand;
		expand = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/search-combo-box/div/div[2]/search-combo-box-node/ul/li/div/div[1]"));
		expand.click();
		
		
		WebElement structureElement;
		structureElement = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/search-combo-box/div/div[2]/search-combo-box-node/ul/li/search-combo-box-node[1]/ul/li/div/div[2]/div[1]"));
		structureElement.equals("placeholder dla warto�ci od Dariuuuuszaaaa");		
		
	}
}