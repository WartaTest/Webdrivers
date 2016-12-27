package base.eAgentObjects;



import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

	public  class ExeceptionErrorRedBox  {
	
	private WebDriver driver = BrowserFactory.getBrowser("Firefox");
	
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1000);
	
	public void exceptionErrorRedBoxCheckIfOccurs(){
		
		
			
		List<WebElement> exceptionErrorRedBox; 
		exceptionErrorRedBox = driver.findElements(By.className("ui-notification__inner__close"));
		Assert.assertTrue(exceptionErrorRedBox.size() < 0);
		
	
	}	
	
	public void schedulerForExceptionErrorRedBox(){
		
		ExeceptionErrorRedBox execeptionErrorRedBox = new ExeceptionErrorRedBox();
		execeptionErrorRedBox.exceptionErrorRedBoxCheckIfOccurs();
		scheduler.execute((Runnable) execeptionErrorRedBox);
		
	}
}