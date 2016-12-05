package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class startPage {
	

	public static void Start() throws InterruptedException{
	
	WebDriver driver = browserFactory.getBrowser("Firefox");
	
	driver.get("https://eagenttst.warta.pl/view360/#/app/main/start?aid=65536&agentOuid=CENTRALA");
	
	WebElement cockipt = driver.findElement(By.xpath("//*[@id='bookmark_reports']/a"));
	WebElement wealth = driver.findElement(By.xpath("//*[@id='wrap']/div/ui-view/div/div/app-header/div/app-menu/header/div/div/div/div[2]/div/div[1]/bookmarks/div/bookmark[1]/div/div/bookmark[1]/div/a"));
	WebElement overview360 = driver.findElement(By.xpath("/html/body/div/ui-view/div/div/app-header/div/app-menu/header/div/div/div/div[2]/div/div[1]/bookmarks/div/bookmark[1]/div/a"));
	
	WebElement agreement = driver.findElement(By.xpath("//*[@id='bookmark_policies']/a")); 
	
	WebElement clients = driver.findElement(By.xpath("//*[@id='bookmark_parties']/a"));
	
	WebElement settlement = driver.findElement(By.xpath("//*[@id='bookmark_settlements']/a"));
	
	

}
}