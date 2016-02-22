package com.vsii.tsc.TSCSelenium.quyentx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drv {
	public static WebDriver driver = new FirefoxDriver();
	
	public static void setup() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}

