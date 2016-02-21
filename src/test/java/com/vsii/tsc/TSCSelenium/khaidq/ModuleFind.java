package com.vsii.tsc.TSCSelenium.khaidq;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ModuleFind {
	public static void findFlight() {
		Common.driver.findElement(By.name("tripType")).click();
	    new Select(Common.driver.findElement(By.name("passCount"))).selectByVisibleText("2");
	    new Select(Common.driver.findElement(By.name("fromPort"))).selectByVisibleText("Frankfurt");
	    new Select(Common.driver.findElement(By.name("fromMonth"))).selectByVisibleText("March");
	    new Select(Common.driver.findElement(By.name("fromDay"))).selectByVisibleText("20");
	    new Select(Common.driver.findElement(By.name("toPort"))).selectByVisibleText("New York");
	    new Select(Common.driver.findElement(By.name("toMonth"))).selectByVisibleText("April");
	    new Select(Common.driver.findElement(By.name("toDay"))).selectByVisibleText("9");
	    Common.driver.findElement(By.cssSelector("font > font > input[name=\"servClass\"]")).click();
	    new Select(Common.driver.findElement(By.name("airline"))).selectByVisibleText("Pangea Airlines");
	    Common.driver.findElement(By.name("findFlights")).click();

	}
}
