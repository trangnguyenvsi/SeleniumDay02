package com.vsii.tsc.TSCSelenium.quyentx;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class ModuleFindFlight {
	
	public static void findFlight(){
		
		String expectedTitle = "Find a Flight: Mercury Tours:";
		String actualTitle = "";
		actualTitle = Drv.driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			if (!Drv.driver
					.findElement(By
							.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
					.isSelected()) {
				Drv.driver.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
						.click();
			}
			
			new Select(Drv.driver.findElement(By.name("passCount"))).selectByVisibleText(Data.passCountInvalid);
			new Select(Drv.driver.findElement(By.name("fromPort"))).selectByVisibleText(Data.fromPortInvalid);
			new Select(Drv.driver.findElement(By.name("fromDay"))).selectByVisibleText(Data.fromDayInvalid);
			new Select(Drv.driver.findElement(By.name("fromMonth"))).selectByVisibleText(Data.fromMonthInvalid);
			new Select(Drv.driver.findElement(By.name("toPort"))).selectByVisibleText(Data.toPortInvalid);
			new Select(Drv.driver.findElement(By.name("toMonth"))).selectByVisibleText(Data.toMonthInvalid);
			new Select(Drv.driver.findElement(By.name("toDay"))).selectByVisibleText( Data.toDayInvalid);
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"))
					.click();
			Drv.driver.findElement(By.name("findFlights")).click();
		}
	}

	public static void checkFindFlightSuccess() {

		String expectedTitle = "Find a Flight: Mercury Tours:";
		String actualTitle = "";
		actualTitle = Drv.driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			if (!Drv.driver
					.findElement(By
							.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
					.isSelected()) {
				Drv.driver.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
						.click();
			}
			
			new Select(Drv.driver.findElement(By.name("passCount"))).selectByVisibleText(Data.passCountValid);
			new Select(Drv.driver.findElement(By.name("fromPort"))).selectByVisibleText(Data.fromPortValid);
			new Select(Drv.driver.findElement(By.name("fromDay"))).selectByVisibleText(Data.fromDayValid);
			new Select(Drv.driver.findElement(By.name("fromMonth"))).selectByVisibleText(Data.fromMonthValid);
			new Select(Drv.driver.findElement(By.name("toPort"))).selectByVisibleText(Data.toPortValid);
			new Select(Drv.driver.findElement(By.name("toMonth"))).selectByVisibleText(Data.toMonthValid);
			new Select(Drv.driver.findElement(By.name("toDay"))).selectByVisibleText(Data.toDayValid);
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"))
					.click();
			Drv.driver.findElement(By.name("findFlights")).click();
		}

		Assert.assertEquals(Drv.driver.getCurrentUrl(), Data.findSuccessURL);
		
	}
	
	public static void checkFindFlightUnsuccess() {
		
		String expectedTitle = "Find a Flight: Mercury Tours:";
		String actualTitle = "";
		actualTitle = Drv.driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			if (!Drv.driver
					.findElement(By
							.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
					.isSelected()) {
				Drv.driver.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
						.click();
			}
			
			new Select(Drv.driver.findElement(By.name("passCount"))).selectByVisibleText(Data.passCountInvalid);
			new Select(Drv.driver.findElement(By.name("fromPort"))).selectByVisibleText(Data.fromPortInvalid);
			new Select(Drv.driver.findElement(By.name("fromDay"))).selectByVisibleText(Data.fromDayInvalid);
			new Select(Drv.driver.findElement(By.name("fromMonth"))).selectByVisibleText(Data.fromMonthInvalid);
			new Select(Drv.driver.findElement(By.name("toPort"))).selectByVisibleText(Data.toPortInvalid);
			new Select(Drv.driver.findElement(By.name("toMonth"))).selectByVisibleText(Data.toMonthInvalid);
			new Select(Drv.driver.findElement(By.name("toDay"))).selectByVisibleText( Data.toDayInvalid);
			Drv.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"))
					.click();
			Drv.driver.findElement(By.name("findFlights")).click();
		}

		Assert.assertEquals(Drv.driver.getCurrentUrl(), Data.findUnsuccessURL);
		
	}

}
