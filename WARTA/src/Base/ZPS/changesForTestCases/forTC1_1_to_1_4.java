package Base.ZPS.changesForTestCases;

import org.junit.Before;

import Base.ZPS.login;
import Base.ZPS.combiningPortfolios.*;

public class forTC1_1_to_1_4 {
	
	@Before
	
	public void Login() throws InterruptedException{
		
		login login = new login();
		login.Login();
	}
	
	public void TC1_1_to_1_4 () throws InterruptedException{
		
		combiningPortfolios combiningPortfolios = new combiningPortfolios();
		combiningPortfolios.CombiningPortfolios();
		
		
	}
}
