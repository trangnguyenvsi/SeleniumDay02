package com.vsii.tsc.TSCSelenium.khaidq;

import com.vsii.tsc.TSCSelenium.khaidq.Common;

import org.openqa.selenium.By;

public class ModuleReg {
	public static void register(String u, String p, String cp) {
		Common.driver.findElement(By.id("email")).sendKeys(u);
		Common.driver.findElement(By.name("password")).sendKeys(p);
		Common.driver.findElement(By.name("confirmPassword")).sendKeys(cp);
		Common.driver.findElement(By.name("register")).click();
	}
	
	public static void openRegister() {
		Common.driver.get(Common.baseUrl + "/mercuryregister.php");
	}
}
