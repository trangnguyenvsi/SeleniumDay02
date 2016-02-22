package com.tsc.diuttm.bai1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Login {
	private WebDriver driver; 

	@Before
	public void setUp() throws Exception {
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}

	public void login(String name, String pass) {
		
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void loginFail() throws Exception {
		login("", "");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actual_re = driver.findElement(By.xpath(".//*[contains(font,'Enter your user information to access')]")).getText();
		Assert.assertEquals(actual_re, "Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form.");
	}

	@Test
	public void loginSucc() throws Exception {
		login("diuttm", "123");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actual_re2= driver.findElement(By.xpath(".//*[contains(font,'Use our Flight Finder')]")).getText();
		Assert.assertEquals(actual_re2, "Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city.");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
