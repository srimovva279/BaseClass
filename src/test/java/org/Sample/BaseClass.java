package org.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static WebDriver driver;
	
	public static void getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Srikanth\\BassClass\\drivers\\chromedriver.exe");
		
		driver =new ChromeDriver();		
	}
	
	public static void launchUrl(String url) {
		
		 driver.get(url);
		 driver.manage().window().maximize();
		 
	}
	public static void forText(WebElement element, String data ) {
		
		element.sendKeys(data);

	}
	public static void ToClick(WebElement element) throws InterruptedException {
		
		Thread.sleep(2000);
		element.click();

	}
	public static void close() {
		driver.close();

}	
	}

