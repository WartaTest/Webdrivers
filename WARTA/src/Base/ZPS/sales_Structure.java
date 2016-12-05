package Base.ZPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;

public class sales_Structure {
	
	public static void Sales_Structure() throws InterruptedException {
	
	WebDriver driver = browserFactory.getBrowser("Firefox");
	
	WebElement retailWarta;
	retailWarta = driver.findElement(By.id("[placeholder"));
	
	WebElement retailHDI;
	retailHDI = driver.findElement(By.id("[placeholder"));

}
}