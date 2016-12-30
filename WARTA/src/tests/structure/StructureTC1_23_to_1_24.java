package tests.structure;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.eAgentObjects.BrowserFactory;
import base.zpsObjects.changesForTestCases.ForTC1_23_to_1_24;

public class StructureTC1_23_to_1_24 {
	
	WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	@Before
	public void changesForStructureTestCasesTC1_23_to_1_24(){		
	ForTC1_23_to_1_24 forTC1_23_to_1_24 = new ForTC1_23_to_1_24();
	forTC1_23_to_1_24.forTC1_23_to_1_24();

	}
	@Test
	public void structureTC1_23_to_1_24(){
	
		
	driver.quit();
	}
	
	
}

