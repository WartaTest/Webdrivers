package Base.ZPS.changesForTestCases;

import org.junit.Before;

import Base.ZPS.login;
import Base.ZPS.salesStructure;
import Base.ZPS.combiningPortfolios.combiningPortfolios;

public class forTC1_5_to_1_11 {
	
	@Before
	
	   public void Login() throws InterruptedException {
	
	      login login = new login();
	      login.Login();
	
	   }
	

	public void TC1_5_to_1_11 () {
			
		salesStructure salesStructure = new salesStructure();
		salesStructure.Buttons();
		salesStructure.Editing();
		salesStructure.HDI_Elements();
		salesStructure.Retail_Elements();
		salesStructure.Sales_Structure();

}
}