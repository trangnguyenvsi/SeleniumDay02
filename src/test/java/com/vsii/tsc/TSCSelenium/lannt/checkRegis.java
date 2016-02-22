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
public class checkRegis {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://newtours.demoaut.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testCheckLogin1() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.linkText("REGISTER")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("lannt");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("123");
	    driver.findElement(By.name("confirmPassword")).clear();
	    driver.findElement(By.name("confirmPassword")).sendKeys("123");
	    driver.findElement(By.name("register")).click();
//	    try {
//	      assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.", driver.findElement(By.xpath("//tr[3]/td/p[2]/font")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Assert.assertTrue(driver.findElement(By.xpath(".//*[contains(text(),'Thank you for registering')]")).getText().equals("Thank you for registering. You may now sign-in using the user name and password you've just entered."));
	    driver.findElement(By.xpath("//*[contains(text(),'Thank you for registering')]"));
	    System.out.println("Register successfully");
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
}
}
