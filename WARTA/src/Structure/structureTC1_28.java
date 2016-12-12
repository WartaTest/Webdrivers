package Structure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;
import Base.cockpitOverview360;
import Base.startPage;
import Base.Login.login;
import Base.Login.logins.username1;

public class structureTC1_28 {

	public void StructureTC1_26() throws InterruptedException{
		
		WebDriver driver = browserFactory.getBrowser("Firefox");
		
		login login = new login();
		login.RunLogin(username1.CENTRALA.toString);
		
		startPage startPage = new startPage();
		startPage.overview360();
		
		cockpitOverview360 cockpitOverview360 = new cockpitOverview360();
		cockpitOverview360.structureToggle();
		
		Thread.sleep(3000);
		
		String netElementNumber1 = "WARD02MS10";
		WebElement search;
		search = driver.findElement(By.id("search_combo_box_1_input"));
		search.sendKeys(netElementNumber1);
		
		Thread.sleep(3000);
		
		String structureElementValue1 = "PLACEHOLDER"; //nieznane na ten moment
		WebElement structureElement;
		structureElement = driver.findElement(By.cssSelector(".search-combo-box-node__fullname"));
		structureElement.equals(structureElementValue1);
		}
	}
