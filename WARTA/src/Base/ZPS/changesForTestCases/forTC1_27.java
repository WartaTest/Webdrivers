package Base.ZPS.changesForTestCases;

import org.junit.Before;

import Base.ZPS.login;
import Base.ZPS.salesStructure;

public class forTC1_27 {
	
	@Before
	
	   public void Login() throws InterruptedException{
		
		login login = new login();
		login.Login();
		
	}
	      

public void TC1_27 () throws InterruptedException{
		
		login login = new login();
		login.Login();
		


}
}
