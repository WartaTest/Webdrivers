package Tests.Structure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.EAgent.BrowserFactory;
import Base.EAgent.CockpitOverview360;
import Base.EAgent.StartPage;
import Base.EAgent.Login.Login;
import Base.EAgent.Login.Logins.username1;

public class StructureTC1_28 {

	public void structureTC1_26() throws InterruptedException{
		
		WebDriver driver = BrowserFactory.getBrowser("Firefox");
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA.toString);
		
		StartPage startPage = new StartPage();
		startPage.overview360();
		
		CockpitOverview360 cockpitOverview360 = new CockpitOverview360();
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
