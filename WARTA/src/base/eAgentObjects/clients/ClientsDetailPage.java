package base.eAgentObjects.clients;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.eAgentObjects.BrowserFactory;

public class ClientsDetailPage {
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	public void clientsDetailsPageGoBackToClick(){
	WebElement clientsDetailsPageGoBackTo = driver.findElement(By.className("tile-client-summary__back"));
	clientsDetailsPageGoBackTo.click();
	}
	
	public void clientsDetailsPageNameCheck(String value){
		String clientsDetailsPageGoBackTo = driver.findElement(By.className("tile-client-summary__client-personal-details__name")).getText();
		Assert.assertTrue(clientsDetailsPageGoBackTo.contains(value));
		}
	
	public void clientsDetailsPageOverviewClick(){
		List <WebElement> clientsDetailsPageOverview = driver.findElements(By.className("tile-client-summary__back"));
		clientsDetailsPageOverview.get(0).click();
		}
	
	
	public void clientsDetailsPagePoliciesClick(){
		List <WebElement> clientsDetailsPagePolicies = driver.findElements(By.className("tile-client-summary__back"));
		clientsDetailsPagePolicies.get(1).click();
		}
	
	
	public void clientsDetailsPageDamageClick(){
		List <WebElement> clientsDetailsPageGoBackTo = driver.findElements(By.className("tile-client-summary__back"));
		clientsDetailsPageGoBackTo.get(2).click();
		}
	
	
	public void clientsDetailsPageClientsDataClick(){
		List <WebElement> clientsDetailsPageGoBackTo = driver.findElements(By.className("tile-client-summary__back"));
		clientsDetailsPageGoBackTo.get(3).click();
		}
	
	
	public void clientsDetailsPageHistoryClick(){
		List <WebElement> clientsDetailsPageGoBackTo = driver.findElements(By.className("tile-client-summary__back"));
		clientsDetailsPageGoBackTo.get(4).click();
		}
	
	public void clientsDetailsPageIconsCheck(){
		List <WebElement> clientsDetailsPageIcons = driver.findElements(By.className("tile-client-summary__policies__policy__icon"));
		int a=clientsDetailsPageIcons.size();
		for(int b=1;b<=a;b++){
			clientsDetailsPageIcons = driver.findElements(By.className("tile-client-summary__policies__policy__icon"));
			clientsDetailsPageIcons.get(b).isDisplayed();
	}	
}
	
	
	public void clientsDetailPageStatsCounterCheckValues(){
	
		
	}
	
	
	public void clientsDetailPagePeselCheckValue(String value){
		String clientsDetailPagePesel = driver.findElement(By.className("tile-client-summary__client-summary__number tile-client-summary__client-summary__number__pesel")).getText();
		Assert.assertTrue(( clientsDetailPagePesel).contains(value));
	}
	
	
	
	
}