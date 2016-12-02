package Base.Settlement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;
import Base.Login.login;
import Base.Login.logins.password1;
import Base.Login.logins.username1;

public class settlements {
	
	public static void Settlements() throws InterruptedException{
		
		WebDriver driver = browserFactory.getBrowser("Firefox");
		
		driver.get("https://eagenttst.warta.pl/view360/#/app/main/settlement/search?aid=65536&agentOuid=WROD01540000&settlementCtxId=bc017d27-9632-4f54-b087-e6d2c3da4288");
		
		WebElement settlementsSearchInput = driver.findElement(By.xpath("//*[@id='wrap']/div/ui-view/div/div/div/div/div/ui-view/div/search-combo-box/div/div/form/input"));
		
		WebElement settlementsSearch = driver.findElement(By.xpath("//*[@id='wrap']/div/ui-view/div/div/div/div/div/ui-view/div/search-combo-box/div/div/span/button"));
		
		WebElement settlementsSearchElement1 = driver.findElement(By.xpath("div/search-combo-box-node/ul/li/div/div[2]/div[1]"));
		
	}	
}
