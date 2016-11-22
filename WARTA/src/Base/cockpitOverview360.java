package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.browserFactory;

public class cockpitOverview360{
	
	
	public static void RunCockpit() {
		WebDriver driver = browserFactory.getBrowser("Firefox");
		
		driver.get("https://eagenttst.warta.pl/view360/#/app/main/start?aid=65536&agentOuid=CENTRALA");
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("/html/body/div/ui-view/div/div/app-header/div/app-menu/header/div/div/div/div[2]/div/div[1]/bookmarks/div/bookmark[1]/div/a"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/html/body/div/ui-view/div/div/app-header/div/app-menu/header/div/div/div/div[2]/div/div[1]/bookmarks/div/bookmark[1]/div/div/bookmark[2]/div/a"))).click().build().perform();
		
		WebElement wait = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/ui-view/div/div/div/div/div/div[1]/headline/div/div[1]/div/div/structure-toggle/a")));;
					
		

}
}