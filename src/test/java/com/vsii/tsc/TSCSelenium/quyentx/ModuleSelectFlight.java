package com.vsii.tsc.TSCSelenium.quyentx;

import org.testng.Assert;
import org.openqa.selenium.By;

public class ModuleSelectFlight {
	
	public static void selectFlight(){
		String expectedTitle = Data.selectSuccessExpectedTitle;
		String actualTitle = "";
		actualTitle = Drv.driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			Drv.driver.findElement(By.xpath("(//*[@name='outFlight'])[2]")).click();
			Drv.driver.findElement(By.xpath("(//*[@name='inFlight'])[3]")).click();
			Drv.driver.findElement(By.name("reserveFlights")).click();
		}
	}
	
	public static void checkSelectFlightSuccess() {
		String expectedTitle = Data.selectSuccessExpectedTitle;
		String actualTitle = "";
		actualTitle = Drv.driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			Drv.driver.findElement(By.xpath("(//*[@name='outFlight'])[2]")).click();
			Drv.driver.findElement(By.xpath("(//*[@name='inFlight'])[3]")).click();
			Drv.driver.findElement(By.name("reserveFlights")).click();
		}
		
		Assert.assertEquals(Drv.driver.getCurrentUrl(), Data.selectSuccessExpectedURL);

	}
}
