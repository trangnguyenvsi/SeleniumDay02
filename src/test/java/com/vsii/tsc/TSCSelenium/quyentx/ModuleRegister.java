package com.vsii.tsc.TSCSelenium.quyentx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ModuleRegister {
	
	public static WebDriver driver = new FirefoxDriver();
	
	public static void checkRegisterSuccess() {
		String expectedTitle = "Register: Mercury Tours";
		String actualTitle = "";
		driver.get("http://newtours.demoaut.com/mercuryregister.php");

		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
		    driver.findElement(By.name("firstName")).sendKeys(Data.regFirstNameValid);
		    driver.findElement(By.name("lastName")).sendKeys(Data.regLastNameValid);
		    driver.findElement(By.name("phone")).sendKeys(Data.regPhoneValid);
		    driver.findElement(By.id("userName")).sendKeys(Data.regUserNameValid);
		    driver.findElement(By.name("address1")).sendKeys(Data.regAddress1Valid);
		    driver.findElement(By.name("city")).sendKeys(Data.regCityValid);
		    driver.findElement(By.name("state")).sendKeys(Data.regStateValid);
		    driver.findElement(By.name("postalCode")).sendKeys(Data.regPostalCodeValid);
		    driver.findElement(By.name("country")).sendKeys(Data.regCountryValid);
		    driver.findElement(By.id("email")).sendKeys(Data.regEmailValid);
		    driver.findElement(By.name("password")).sendKeys(Data.regPasswordValid);
		    driver.findElement(By.name("confirmPassword")).sendKeys(Data.regConfirmPasswordValid);
		    driver.findElement(By.name("register")).click();

		}

		Assert.assertEquals(driver.getCurrentUrl(), Data.regSuccessURL);	
		
	}

	public static void checkRegisterUnsuccess() {
		String expectedTitle = "Register: Mercury Tours";
		String actualTitle = "";
		driver.get("http://newtours.demoaut.com/mercuryregister.php");

		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
		    driver.findElement(By.name("firstName")).sendKeys(Data.regFirstNameInvalid);
		    driver.findElement(By.name("lastName")).sendKeys(Data.regLastNameInvalid);
		    driver.findElement(By.name("phone")).sendKeys(Data.regPhoneInvalid);
		    driver.findElement(By.id("userName")).sendKeys(Data.regUserNameInvalid);
		    driver.findElement(By.name("address1")).sendKeys(Data.regAddress1Invalid);
		    driver.findElement(By.name("city")).sendKeys(Data.regCityInvalid);
		    driver.findElement(By.name("state")).sendKeys(Data.regStateInvalid);
		    driver.findElement(By.name("postalCode")).sendKeys(Data.regPostalCodeInvalid);
		    driver.findElement(By.name("country")).sendKeys(Data.regCountryInvalid);
		    driver.findElement(By.id("email")).sendKeys(Data.regEmailInvalid);
		    driver.findElement(By.name("password")).sendKeys(Data.regPasswordInvalid);
		    driver.findElement(By.name("confirmPassword")).sendKeys(Data.regConfirmPasswordInvalid);
		    driver.findElement(By.name("register")).click();

		}

		Assert.assertEquals(driver.getCurrentUrl(), Data.regSuccessURL);	
		
	}

}
