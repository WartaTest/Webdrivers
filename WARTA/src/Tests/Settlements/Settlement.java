package Tests.Settlements;

import org.openqa.selenium.WebDriver;
import org.junit.Test;

import Base.EAgent.BrowserFactory;
import Base.EAgent.Settlements;
import Base.EAgent.StartPage;
import Base.EAgent.Login.Login;
import Base.EAgent.Login.Logins.username1;

public class Settlement {
	
	@Test
	public void Test() throws InterruptedException{
		
		Login login = new Login();
		login.RunLogin(username1.CENTRALA.toString);
		
		StartPage startPage = new StartPage();
		startPage.settlementGoTo();
		
		Settlements settlements = new Settlements();
		settlements.settlementsSearchInputFillUp("5504071");
		settlements.firstElementOfSettlementsSearchClick();
		
	}

}
