package com.vsii.tsc.TSCSelenium.quyentx;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ModuleBookFlight {
	
	public static void bookFlight(){
		String expectedTitle = "Book a Flight: Mercury Tours";
		String actualTitle = "";
		actualTitle = Drv.driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			Drv.driver.findElement(By.name("passFirst0")).sendKeys(Data.bookPassFirst0Valid);
			Drv.driver.findElement(By.name("passLast0")).sendKeys(Data.bookPassLast0Valid);
			new Select(Drv.driver.findElement(By.name("pass.0.meal"))).selectByVisibleText(Data.bookPassmealValid);
			new Select(Drv.driver.findElement(By.name("creditCard"))).selectByVisibleText(Data.bookCreditCardValid);
			Drv.driver.findElement(By.name("creditnumber")).sendKeys(Data.bookCreditNumberValid);
			new Select(Drv.driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText(Data.bookcc_exp_dt_mnValid);
			new Select(Drv.driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText(Data.bookcc_exp_dt_yrValid);
			Drv.driver.findElement(By.name("cc_frst_name")).sendKeys(Data.bookcc_frst_nameValid);
			Drv.driver.findElement(By.name("cc_mid_name")).sendKeys(Data.bookcc_mid_nameValid);
			Drv.driver.findElement(By.name("cc_last_name")).sendKeys(Data.bookcc_last_nameValid);
			Drv.driver.findElement(By.name("billAddress1")).sendKeys(Data.bookBillAddress1Valid);
			Drv.driver.findElement(By.name("billCity")).sendKeys(Data.bookBillCityValid);
			Drv.driver.findElement(By.name("billState")).sendKeys(Data.bookBillStateValid);
			Drv.driver.findElement(By.name("billZip")).sendKeys(Data.bookBillZipValid);
			Drv.driver.findElement(By.name("delAddress1")).sendKeys(Data.bookDelAddress1Valid);
			Drv.driver.findElement(By.name("delCity")).sendKeys(Data.bookDelCityValid);
			Drv.driver.findElement(By.name("delState")).sendKeys(Data.bookDelStateValid);
			Drv.driver.findElement(By.name("delZip")).sendKeys(Data.bookDelZipValid);
			Drv.driver.findElement(By.name("buyFlights")).click();
		}
	}
	
	public static void checkBookFlightSuccess() {
		String expectedTitle = "Book a Flight: Mercury Tours";
		String actualTitle = "";
		actualTitle = Drv.driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			Drv.driver.findElement(By.name("passFirst0")).sendKeys(Data.bookPassFirst0Valid);
			Drv.driver.findElement(By.name("passLast0")).sendKeys(Data.bookPassLast0Valid);
			new Select(Drv.driver.findElement(By.name("pass.0.meal"))).selectByVisibleText(Data.bookPassmealValid);
			new Select(Drv.driver.findElement(By.name("creditCard"))).selectByVisibleText(Data.bookCreditCardValid);
			Drv.driver.findElement(By.name("creditnumber")).sendKeys(Data.bookCreditNumberValid);
			new Select(Drv.driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText(Data.bookcc_exp_dt_mnValid);
			new Select(Drv.driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText(Data.bookcc_exp_dt_yrValid);
			Drv.driver.findElement(By.name("cc_frst_name")).sendKeys(Data.bookcc_frst_nameValid);
			Drv.driver.findElement(By.name("cc_mid_name")).sendKeys(Data.bookcc_mid_nameValid);
			Drv.driver.findElement(By.name("cc_last_name")).sendKeys(Data.bookcc_last_nameValid);
			Drv.driver.findElement(By.name("billAddress1")).sendKeys(Data.bookBillAddress1Valid);
			Drv.driver.findElement(By.name("billCity")).sendKeys(Data.bookBillCityValid);
			Drv.driver.findElement(By.name("billState")).sendKeys(Data.bookBillStateValid);
			Drv.driver.findElement(By.name("billZip")).sendKeys(Data.bookBillZipValid);
			Drv.driver.findElement(By.name("delAddress1")).sendKeys(Data.bookDelAddress1Valid);
			Drv.driver.findElement(By.name("delCity")).sendKeys(Data.bookDelCityValid);
			Drv.driver.findElement(By.name("delState")).sendKeys(Data.bookDelStateValid);
			Drv.driver.findElement(By.name("delZip")).sendKeys(Data.bookDelZipValid);
			Drv.driver.findElement(By.name("buyFlights")).click();
		}

		Assert.assertEquals(Drv.driver.getCurrentUrl(), Data.bookSuccessExpectedURL);

	}

	public static void checkBookFlightUnsuccess() {
		String expectedTitle = "Book a Flight: Mercury Tours";
		String actualTitle = "";
		actualTitle = Drv.driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			Drv.driver.findElement(By.name("passFirst0")).sendKeys(Data.bookPassFirst0Invalid);
			Drv.driver.findElement(By.name("passLast0")).sendKeys(Data.bookPassLast0Invalid);
			new Select(Drv.driver.findElement(By.name("pass.0.meal"))).selectByVisibleText(Data.bookPassmealInvalid);
			new Select(Drv.driver.findElement(By.name("creditCard"))).selectByVisibleText(Data.bookCreditCardInvalid);
			Drv.driver.findElement(By.name("creditnumber")).sendKeys(Data.bookCreditNumberInvalid);
			new Select(Drv.driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText(Data.bookcc_exp_dt_mnInvalid);
			new Select(Drv.driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText(Data.bookcc_exp_dt_yrInvalid);
			Drv.driver.findElement(By.name("cc_frst_name")).sendKeys(Data.bookcc_frst_nameInvalid);
			Drv.driver.findElement(By.name("cc_mid_name")).sendKeys(Data.bookcc_mid_nameInvalid);
			Drv.driver.findElement(By.name("cc_last_name")).sendKeys(Data.bookcc_last_nameInvalid);
			Drv.driver.findElement(By.name("billAddress1")).sendKeys(Data.bookBillAddress1Invalid);
			Drv.driver.findElement(By.name("billCity")).sendKeys(Data.bookBillCityInvalid);
			Drv.driver.findElement(By.name("billState")).sendKeys(Data.bookBillStateInvalid);
			Drv.driver.findElement(By.name("billZip")).sendKeys(Data.bookBillZipInvalid);
			Drv.driver.findElement(By.name("delAddress1")).sendKeys(Data.bookDelAddress1Invalid);
			Drv.driver.findElement(By.name("delCity")).sendKeys(Data.bookDelCityInvalid);
			Drv.driver.findElement(By.name("delState")).sendKeys(Data.bookDelStateInvalid);
			Drv.driver.findElement(By.name("delZip")).sendKeys(Data.bookDelZipInvalid);
			Drv.driver.findElement(By.name("buyFlights")).click();
		}

		Assert.assertEquals(Drv.driver.getCurrentUrl(), Data.bookUnsuccessExpectedURL);
	}
}
