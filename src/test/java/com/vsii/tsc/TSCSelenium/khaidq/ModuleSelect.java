package com.vsii.tsc.TSCSelenium.khaidq;

import org.openqa.selenium.By;

public class ModuleSelect {
	public static void selectFlight() {
	    Common.driver.findElement(By.xpath("(//*[@name='outFlight'])[2]")).click();
	    Common.driver.findElement(By.xpath("(//*[@name='inFlight'])[3]")).click();
	    Common.driver.findElement(By.name("reserveFlights")).click();

	}
}
