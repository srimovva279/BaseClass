package org.POMsample1;

import org.Sample.LaunchFB;

public class mainclass extends BaseClass{
public static void main(String[] args) {
	
	
	getDriver();
	lunchurl("https://www.facebook.com/");

	POJOclass p=new POJOclass();
	text(p.getUsername(), "hellow");
	text(p.getPassword(), "welcome");
}
	
}
