package org.POMsample2;

import org.openqa.selenium.By;

public class MiClass extends Baseclass {
	
public static void main(String[] args) throws InterruptedException {
	
	getDriver();
	LaunchUrl("http://demo.automationtesting.in/Register.html");
	textName(driver.findElement(By.xpath("//input[@placeholder='First Name']")), "Srikanth");
	textName(driver.findElement(By.xpath("//input[@placeholder='Last Name']")), "Asha");
	textName(driver.findElement(By.tagName("textarea")), "Chennai");
	textName(driver.findElement(By.xpath("//input[@type='email']")), "sri.movva279@gmail.com");
	textName(driver.findElement(By.xpath("//input[@type='tel']")), "9422292524");
	btnClick(driver.findElement(By.xpath("(//input[@type='radio'])[1]")));
	btnClick(driver.findElement(By.xpath("//input[@value='Cricket']")));
	btnClick(driver.findElement(By.id("msdd")));
	btnClick(driver.findElement(By.xpath("//a[text()='English']")));
	forSelect(driver.findElement(By.id("Skills")), 9);
	btnClick(driver.findElement(By.xpath("//select[@id='Skills']")));
	forSelect(driver.findElement(By.xpath("//select[@id='Skills']")), 5);
	forSelect(driver.findElement(By.id("countries")), 5);
	btnClick(driver.findElement(By.xpath("//span[@dir='ltr']")));
	btnClick(driver.findElement(By.xpath("//li[text()='India']")));
//	forSelect(driver.findElement(By.xpath("//span[@dir='ltr']")), 4);
	btnClick(driver.findElement(By.id("yearbox")));
	forSelect(driver.findElement(By.id("yearbox")), 5);
	btnClick(driver.findElement(By.xpath("//select[@placeholder='Month']")));
	forSelect(driver.findElement(By.id("//select[@placeholder='Month']")), 6);
	btnClick(driver.findElement(By.id("daybox")));
	forSelect(driver.findElement(By.id("daybox")), 6);
	
	textName(driver.findElement(By.xpath("//input[@id='firstpassword']")), "srikanth123");
	textName(driver.findElement(By.xpath("//input[@id='secondpassword']")), "srikanth123");
	
	btnClick(driver.findElement(By.id("submitbtn")));
	

}
}
