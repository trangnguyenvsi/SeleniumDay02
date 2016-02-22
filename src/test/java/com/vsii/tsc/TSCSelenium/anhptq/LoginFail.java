package com.vsii.tsc.TSCSelenium.anhptq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFail {
	public static void main( String[] args ) throws InterruptedException
    {
        loginFail();
    }
    @Test
    public static void loginFail() throws InterruptedException {
    	Common.driver1.get(Common.url);
    	
    	WebElement txtUser = Common.driver1.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
    	txtUser.sendKeys("abc");
    	WebElement txtPass = Common.driver1.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
    	txtPass.sendKeys("123");
    	WebElement btnSignin = Common.driver1.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
    	btnSignin.click();
    	Thread.sleep(5000);
    	
    	String textExpect = "Flight Details";
    	WebElement textActual = Common.driver1.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font"));
    	Assert.assertEquals(textActual, textExpect);
    }
}
