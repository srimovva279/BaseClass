package org.Sample;

import org.openqa.selenium.By;

public class LanchBC extends Baseclasss{

	public static void main(String[] args) throws InterruptedException {
		
		getDriver();
		lunchurl("https://www.facebook.com/");
		text(driver.findElement(By.id("email")), "hellow");
		text(driver.findElement(By.id("pass")), "muzalli");
		toClick(driver.findElement(By.name("login")));
	}
}
