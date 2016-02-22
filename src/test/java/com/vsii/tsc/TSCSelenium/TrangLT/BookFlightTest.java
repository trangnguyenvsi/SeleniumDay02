package com.vsii.tsc.TSCSelenium.TrangLT;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class BookFlightTest {
	private WebDriver driver;
	private FlightFinderTest flightFinderTest=new FlightFinderTest();
	private WebDriver driver1;
	private WebDriver driver2;
	private LoginTest loginTest;

	@BeforeTest
	public void setUp() throws Exception {
		loginTest = new LoginTest();
	}

	@Test
	public void bookSucc1() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginTest.login("trang123", "123", driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		flightFinderTest.flightFinder(driver);
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).clear();
		driver.findElement(By.name("passFirst0")).sendKeys("trang");
		driver.findElement(By.name("passLast0")).clear();
		driver.findElement(By.name("passLast0")).sendKeys("Le");
		driver.findElement(By.name("creditnumber")).clear();
		driver.findElement(By.name("creditnumber")).sendKeys("12345");
		driver.findElement(By.name("buyFlights")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[contains(font,'itinerary has been booked!')]"));
		Assert.assertEquals(driver.findElement(By.xpath(".//*[contains(font,'itinerary has been booked!')]")).getText(), "Your itinerary has been booked!\n\n"
		
				+"Please print a copy of this screen for your records. Thank you for choosing Mercury Tours.");
		driver.quit();
	}
	@Test
	public void verifyPass() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginTest.login("trang123", "123", driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		flightFinderTest.flightFinder(driver);
		driver.findElement(By.name("reserveFlights")).click();
		//driver.findElement(By.name("passLast"+flightFinderTest.getNumberPass()));
		Assert.assertTrue(existsElement("passLast"+flightFinderTest.getNumberPass()));
		driver.quit();
	}
	
	@Test
	public void bookSucc2() throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginTest.login("trang123", "123", driver1);
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.findElement(By.name("findFlights")).click();
		driver1.findElement(By.name("reserveFlights")).click();
		driver1.findElement(By.name("passFirst0")).clear();
		driver1.findElement(By.name("passFirst0")).sendKeys("trang");
		driver1.findElement(By.name("passLast0")).clear();
		driver1.findElement(By.name("passLast0")).sendKeys("Le");
		driver1.findElement(By.name("creditnumber")).clear();
		driver1.findElement(By.name("creditnumber")).sendKeys("12345");
		driver1.findElement(By.name("buyFlights")).click();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.findElement(By.xpath(".//*[contains(font,'itinerary has been booked!')]"));
		Assert.assertEquals(driver1.findElement(By.xpath(".//*[contains(font,'itinerary has been booked!')]")).getText(), "Your itinerary has been booked!\n\n"
				
				+"Please print a copy of this screen for your records. Thank you for choosing Mercury Tours.");
		driver1.quit();
	}
	
	@Test
	public void bookSucc3() throws Exception {
		System.setProperty("webdriver.ie.driver","F:\\IEDriverServer.exe");
		driver2= new InternetExplorerDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginTest.login("trang123", "123", driver2);
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver2.findElement(By.name("findFlights")).click();
		driver2.findElement(By.name("reserveFlights")).click();
		driver2.findElement(By.name("passFirst0")).clear();
		driver2.findElement(By.name("passFirst0")).sendKeys("trang");
		driver2.findElement(By.name("passLast0")).clear();
		driver2.findElement(By.name("passLast0")).sendKeys("Le");
		driver2.findElement(By.name("creditnumber")).clear();
		driver2.findElement(By.name("creditnumber")).sendKeys("12345");
		driver2.findElement(By.name("buyFlights")).click();
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver2.findElement(By.xpath(".//*[contains(font,'itinerary has been booked!')]"));
		Assert.assertEquals(driver2.findElement(By.xpath(".//*[contains(font,'itinerary has been booked!')]")).getText(), "Please print a copy of this screen for your records. Thank you for choosing Mercury Tours.");
		driver2.quit();
	}
	
	private boolean existsElement(String name) {
	    try {
	        driver.findElement(By.name(name));
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	}

}
