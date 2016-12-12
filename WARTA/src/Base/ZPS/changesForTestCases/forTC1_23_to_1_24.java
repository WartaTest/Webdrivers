package Base.ZPS.changesForTestCases;

import org.junit.Before;

import Base.ZPS.login;
import Base.ZPS.assignToStructureOrManager.AssignToStructureOrManager;

public class forTC1_23_to_1_24 {
	
	@Before
	
	public void Login() throws InterruptedException{
		
		login login = new login();
		login.Login();
	}

	public void TC1_23_to_1_24 () throws InterruptedException{
		
		
		AssignToStructureOrManager assignToStructureOrManager = new AssignToStructureOrManager();
		
		
	}
}
