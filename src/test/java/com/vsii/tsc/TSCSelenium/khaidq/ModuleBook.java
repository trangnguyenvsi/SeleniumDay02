package com.vsii.tsc.TSCSelenium.khaidq;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ModuleBook {
	public static void bookFlight() {
		Common.driver.findElement(By.name("passFirst0")).clear();
		Common.driver.findElement(By.name("passFirst0")).sendKeys("Quang Khai");
		Common.driver.findElement(By.name("passLast0")).clear();
		Common.driver.findElement(By.name("passLast0")).sendKeys("Do");
	    new Select(Common.driver.findElement(By.name("pass.0.meal"))).selectByVisibleText("Low Calorie");
	    new Select(Common.driver.findElement(By.name("pass.1.meal"))).selectByVisibleText("Low Cholesterol");
	    Common.driver.findElement(By.name("passFirst1")).clear();
	    Common.driver.findElement(By.name("passFirst1")).sendKeys("Gau cua Khai");
	    Common.driver.findElement(By.name("passLast1")).clear();
	    Common.driver.findElement(By.name("passLast1")).sendKeys("Nguyen");
	    Common.driver.findElement(By.name("creditnumber")).clear();
	    Common.driver.findElement(By.name("creditnumber")).sendKeys("1122334455");
	    new Select(Common.driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText("04");
	    new Select(Common.driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText("2009");
	    Common.driver.findElement(By.name("cc_frst_name")).clear();
	    Common.driver.findElement(By.name("cc_frst_name")).sendKeys("Quang Khai");
	    Common.driver.findElement(By.name("cc_mid_name")).clear();
	    Common.driver.findElement(By.name("cc_mid_name")).sendKeys("Quang");
	    Common.driver.findElement(By.name("cc_frst_name")).clear();
	    Common.driver.findElement(By.name("cc_frst_name")).sendKeys("Khai");
	    Common.driver.findElement(By.name("cc_last_name")).clear();
	    Common.driver.findElement(By.name("cc_last_name")).sendKeys("Do");
	    Common.driver.findElement(By.name("ticketLess")).click();
	    Common.driver.findElement(By.name("billAddress1")).clear();
	    Common.driver.findElement(By.name("billAddress1")).sendKeys("Ha Noi");
	    Common.driver.findElement(By.name("billAddress2")).clear();
	    Common.driver.findElement(By.name("billAddress2")).sendKeys("Ha Noi");
	    Common.driver.findElement(By.name("billCity")).clear();
	    Common.driver.findElement(By.name("billCity")).sendKeys("Ha Noi");
	    Common.driver.findElement(By.name("billState")).clear();
	    Common.driver.findElement(By.name("billState")).sendKeys("Ha Noi");
	    Common.driver.findElement(By.name("billZip")).clear();
	    Common.driver.findElement(By.name("billZip")).sendKeys("Ha Noi");
	    new Select(Common.driver.findElement(By.name("billCountry"))).selectByVisibleText("VIETNAM");
	    Common.driver.findElement(By.xpath("(//*[@name='ticketLess'])[1]")).click();
	    Common.driver.findElement(By.name("delAddress1")).clear();
	    Common.driver.findElement(By.name("delAddress1")).sendKeys("Ha Noi");
	    Common.driver.findElement(By.name("delAddress2")).clear();
	    Common.driver.findElement(By.name("delAddress2")).sendKeys("Ha Noi");
	    Common.driver.findElement(By.name("delCity")).clear();
	    Common.driver.findElement(By.name("delCity")).sendKeys("Ha Noi");
	    Common.driver.findElement(By.name("delState")).clear();
	    Common.driver.findElement(By.name("delState")).sendKeys("Ha Noi");
	    Common.driver.findElement(By.name("delZip")).clear();
	    Common.driver.findElement(By.name("delZip")).sendKeys("Ha Noi");
	    new Select(Common.driver.findElement(By.name("delCountry"))).selectByVisibleText("TOKELAU");
	    Alert alert = Common.driver.switchTo().alert();
	    alert.accept();
	    Common.driver.findElement(By.name("buyFlights")).click();

	}
}
