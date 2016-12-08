package Base.ZPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.browserFactory;

public class salesStructure {
	
	public static void Sales_Structure() throws InterruptedException {
	
	WebDriver driver = browserFactory.getBrowser("Firefox");
	
	WebElement retailWarta;
	retailWarta = driver.findElement(By.id("d60006_anchor"));
	
	WebElement retailHDI;
	retailHDI = driver.findElement(By.id("d50005_anchor"));
	}
	
	public static void Retail_Elements(){
		
	WebDriver driver = browserFactory.getBrowser("Firefox");
	
	WebElement retail_element1;
	retail_element1 = driver.findElement(By.id("d6640032_anchor"));
	
	WebElement retail_element2;
	retail_element2 = driver.findElement(By.id("d5870037_anchor"));
	
	WebElement retail_element3;
	retail_element3 = driver.findElement(By.id("d5940036_anchor"));
	
	WebElement retail_element4;
	retail_element4 = driver.findElement(By.id("d5120026_anchor"));
	
	WebElement retail_element5;
	retail_element5 = driver.findElement(By.id("d5110025_anchor"));
	
	WebElement retail_element6;
	retail_element6 = driver.findElement(By.id("d5160030_anchor"));
	
	WebElement retail_element7;
	retail_element7 = driver.findElement(By.id("d6240033_anchor"));
	
	WebElement retail_element8;
	retail_element8 = driver.findElement(By.id("d5240038_anchor"));
	
	WebElement retail_element9;
	retail_element9 = driver.findElement(By.id("d5250039_anchor"));
	
	WebElement retail_element10;
	retail_element10 = driver.findElement(By.id("d5170031_anchor"));
	
	WebElement retail_element11;
	retail_element11 = driver.findElement(By.id("d5200034_anchor"));
	
	WebElement retail_element12;
	retail_element12 = driver.findElement(By.id("d5130027_anchor"));
	
	WebElement retail_element13;
	retail_element13 = driver.findElement(By.id("d6970028_anchor"));
	
	WebElement retail_element14;
	retail_element14 = driver.findElement(By.id("d5150029_anchor"));
	
	WebElement retail_element15;
	retail_element15 = driver.findElement(By.id("d5080022_anchor"));
	
	WebElement retail_element16;
	retail_element16 = driver.findElement(By.id("d6910023_anchor"));
	
	WebElement retail_element17;
	retail_element17 = driver.findElement(By.id("d5100024_anchor"));
	
	}
	
	public static void HDI_Elements(){
		
	WebDriver driver = browserFactory.getBrowser("Firefox");
		
	WebElement hdi_element1;
	hdi_element1 = driver.findElement(By.id("d6960219_anchor"));
	
	WebElement hdi_element2;
	hdi_element2 = driver.findElement(By.id("d2210221_anchor"));
	
	WebElement hdi_element3;
	hdi_element3 = driver.findElement(By.id("d2220222_anchor"));
	
	WebElement hdi_element4;
	hdi_element4 = driver.findElement(By.id("d2230223_anchor"));
	
	WebElement hdi_element5;
	hdi_element5 = driver.findElement(By.id("d2240224_anchor"));
	
	WebElement hdi_element6;
	hdi_element6 = driver.findElement(By.id("d2250225_anchor"));
	
	WebElement hdi_element7;
	hdi_element7 = driver.findElement(By.id("d2260226_anchor"));
	
	WebElement hdi_element8;
	hdi_element8 = driver.findElement(By.id("d2280228_anchor"));
	
	WebElement hdi_element9;
	hdi_element9 = driver.findElement(By.id("d6470524_anchor"));
	}
	
	
	
	public static void Buttons(){
		
	WebDriver driver = browserFactory.getBrowser("Firefox");
	
	WebElement edit;
	edit = driver.findElement(By.id("btnedy"));
	
	WebElement save;
	save = driver.findElement(By.id("btnsav"));
	
	WebElement cancel;
	cancel = driver.findElement(By.id("btnesc"));
	
	}
	
	public static void Editing(){
	
	WebDriver driver = browserFactory.getBrowser("Firefox");
		
	WebElement date;
	date = driver.findElement(By.id("dtp"));	
	
	WebElement unit;
	unit = driver.findElement(By.id("idjed"));	
	
	WebElement position;
	position = driver.findElement(By.id("idsta"));		
	
	WebElement id_podm;
	id_podm = driver.findElement(By.id("idpod"));
	
	WebElement person;
	person = driver.findElement(By.id("idoso"));
		}
	}