package com.vsii.tsc.TSCSelenium.TrangLT;

import java.util.concurrent.TimeUnit;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
	private WebDriver driver; 

	@BeforeTest
	public void setUp() throws Exception {
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void login(String name, String password, WebDriver driver) {
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	//	driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void loginFail() throws Exception {
		login("trang123", "123567", driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[contains(font,'Enter your user information to access')]"));
		Assert.assertEquals(driver.findElement(By.xpath(".//*[contains(font,'Enter your user information to access')]")).getText(), "Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form.");
	}

	@Test
	public void loginSucc() throws Exception {
		login("trang123", "123", driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[contains(font,'Use our Flight Finder')]"));
		Assert.assertEquals(driver.findElement(By.xpath(".//*[contains(font,'Use our Flight Finder')]")).getText(), "Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city.");
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
}
