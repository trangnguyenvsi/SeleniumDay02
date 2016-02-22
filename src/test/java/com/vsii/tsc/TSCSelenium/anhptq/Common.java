package com.vsii.tsc.TSCSelenium.anhptq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Common {
//	public static void main(String[] args) {
//		
//	}

	public static void login (String u, String p) {
	    Common.driver1.findElement(By.name("userName")).sendKeys(u);
	    Common.driver1.findElement(By.name("password")).sendKeys(p);
	    Common.driver1.findElement(By.name("login")).click();
	}
	
	public static WebDriver driver1 = new FirefoxDriver();
	public static WebDriver driver2 = new ChromeDriver();
	public static WebDriver driver3 = new InternetExplorerDriver();

	public static String url = "http://newtours.demoaut.com/";

}
