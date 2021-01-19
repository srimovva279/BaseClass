package org.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclasss {

	public static WebDriver driver;
	
	public static void getDriver() {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Srikanth\\BassClass\\drivers\\chromedriver.exe");
      
      driver=new ChromeDriver();
      
      driver.manage().window().maximize();
	}
	
	public static void lunchurl(String url) {
		
		driver.get(url);
		
	}
	
	public static void text(WebElement element, String username) {
		element.sendKeys(username);

	}
	public static void toClick(WebElement element) throws InterruptedException {
		
		Thread.sleep(2000);
		element.click();

	}
	
}
