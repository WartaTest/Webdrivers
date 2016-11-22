package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wealth {
	
	public void Wealth() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://eagenttst.warta.pl/view360/#/app/main/start?aid=65536&agentOuid=CENTRALA");
		
		WebElement wealth;
		wealth = driver.findElement(By.id("//*[@id='wrap']/div/ui-view/div/div/app-header/div/app-menu/header/div/div/div/div[2]/div/div[1]/bookmarks/div/bookmark[1]/div/div/bookmark[1]/div/a"));
		wealth.click();

}
}