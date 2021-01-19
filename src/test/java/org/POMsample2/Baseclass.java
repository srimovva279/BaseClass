package org.POMsample2;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;
	
	public static void getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Srikanth\\BassClass\\drivers\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
	}
	
	public static void LaunchUrl(String url) {
		
		driver.get(url);
	}
	
	public static void textName(WebElement element, String data) {
		
     element.sendKeys(data);
	}
	
	public static void btnClick(WebElement element) throws InterruptedException {
//		Thread.sleep(2000);
      element.click();
	}

	public static void forSelect(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);

	}
	
}
