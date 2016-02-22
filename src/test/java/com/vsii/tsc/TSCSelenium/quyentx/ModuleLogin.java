package com.vsii.tsc.TSCSelenium.quyentx;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ModuleLogin {

	public static void logIn(){
		String expectedTitle = Data.loginExpectedTitle;
		Drv.driver.get(Data.loginURL);

		String actualTitle = Drv.driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"))
					.sendKeys(Data.loginUsernameValid);
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"))
					.sendKeys(Data.loginPasswordValid);
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"))
					.click();
		}
	}
	
	public static void checkLoginSuccess() {
		String expectedTitle = Data.loginExpectedTitle;
		Drv.driver.get(Data.loginURL);

		String actualTitle = Drv.driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {

			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"))
					.sendKeys(Data.loginUsernameValid);
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"))
					.sendKeys(Data.loginPasswordValid);
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"))
					.click();
		}
		
		Assert.assertEquals(Drv.driver.getCurrentUrl(), Data.loginSuccessExpectedURL);
		
	}
	
	
	public static void checkLoginUnsuccess(){
		String expectedTitle = Data.loginExpectedTitle;
		Drv.driver.get(Data.loginURL);

		String actualTitle = Drv.driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {

			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"))
					.sendKeys(Data.LoginUsernameInvalid);
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"))
					.sendKeys(Data.LoginPasswordInvalid);
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"))
					.click();
		}
		
		Assert.assertEquals(Drv.driver.getCurrentUrl(), Data.loginUnsuccessExpectedURL);
	}
}
