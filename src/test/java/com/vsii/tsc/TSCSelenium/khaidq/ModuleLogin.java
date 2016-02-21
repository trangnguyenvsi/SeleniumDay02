package com.vsii.tsc.TSCSelenium.khaidq;

import com.vsii.tsc.TSCSelenium.khaidq.Common;

import org.openqa.selenium.By;

public class ModuleLogin {

	public static void login (String u, String p) {
	    Common.driver.findElement(By.name("userName")).sendKeys(u);
	    Common.driver.findElement(By.name("password")).sendKeys(p);
	    Common.driver.findElement(By.name("login")).click();
	}
	
	public static void openHome () {
		Common.driver.get(Common.baseUrl + "/mercurywelcome.php");
	}
}
