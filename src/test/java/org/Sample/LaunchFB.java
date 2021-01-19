package org.Sample;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.openqa.selenium.By;

public class LaunchFB extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		getDriver();
		launchUrl("https://www.facebook.com/");
		forText(driver.findElement(By.id("email")), "hellow");
		forText(driver.findElement(By.id("pass")), "amigos");
		ToClick(driver.findElement(By.name("login")));
		
		
		System.out.println();
		
		System.out.println();
		
		System.out.print("akjshdkjas");
		
	}
}
