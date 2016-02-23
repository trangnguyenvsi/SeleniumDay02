package com.vsii.tsc.TSCSelenium.lannt;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

@SuppressWarnings("unused")
public class checkLogin {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
//public class checkLogin {
	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://newtours.demoaut.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testLoginFail() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys("tutorial");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("tuto");
	    driver.findElement(By.name("login")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Assert.assertEquals(driver.findElement(By.xpath(".//*[contains(text(),'Enter your user information to access')]")).getText(), "Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form.");
//	    driver.findElement(By.xpath("//*[contains(text(),'Enter your user information')]")).getText(), "Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form.");
//	    System.out.println("Login Fail");
	  }
	    @Test
		  public void testLog1() throws Exception {
		    driver.get(baseUrl + "/");
		    driver.findElement(By.name("userName")).clear();
		    driver.findElement(By.name("userName")).sendKeys("tutorial");
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("tutorial");
		    driver.findElement(By.name("login")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Assert.assertEquals(driver.findElement(By.xpath(".//*[contains(text(),'Use our Flight Finder')]")).getText(), "Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city.");
//		    driver.findElement(By.xpath("//*[contains(text(),'Use our Flight Finder')]"));
//		    driver.findElement(By.linkText("mercuryreservation"));
		    System.out.println("Login Pass");
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
}

}
