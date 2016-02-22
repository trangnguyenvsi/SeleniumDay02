package com.vsii.tsc.TSCSelenium.TrangLT;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlightFinderTest {
	private WebDriver driver;
	private LoginTest loginTest;
	private int numberPass;

	public int getNumberPass() {
		return numberPass;
	}

	public void setNumberPass(int numberPass) {
		this.numberPass = numberPass;
	}

	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void flightFinder(WebDriver driver) {
		loginTest = new LoginTest();
		loginTest.login("trang123", "123", driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@type='radio' and @value='oneway']")).click();
		new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("3");
		numberPass = Integer.parseInt(driver.findElement(By.name("passCount")).getAttribute("value"));
		System.out.println(numberPass);
		setNumberPass(numberPass-1);
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Zurich");
		new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("June");
		new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText("11");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Paris");
		new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("August");
		new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("25");
		driver.findElement(By.xpath(".//*[@type='radio' and @value='First']")).click();
		new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.name("findFlights")).click();
	}

	@Test
	public void find() throws Exception {
		flightFinder(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[contains(text(), 'Select your departure')]"));
		Assert.assertEquals(driver.findElement(By.xpath(".//*[contains(text(), 'Select your departure')]")).getText(),
				"Select your departure and return flight from the selections below. Your total price will be higher than quoted if you elect to fly on a different airline for both legs of your travel.");
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
}
