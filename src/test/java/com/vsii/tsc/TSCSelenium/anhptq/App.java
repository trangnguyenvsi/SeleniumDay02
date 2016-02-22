package com.vsii.tsc.TSCSelenium.anhptq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        loginSuccess();
    }
    @Test
    public static void loginSuccess() throws InterruptedException {
    	Common.driver1.get(Common.url);
    	
    	WebElement txtUser = Common.driver1.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
    	txtUser.sendKeys("tutorial");
    	WebElement txtPass = Common.driver1.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
    	txtPass.sendKeys("tutorial");
    	WebElement btnSignin = Common.driver1.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
    	btnSignin.click();
    	Thread.sleep(5000);
    	
    	String textExpect = "Flight Details";
    	WebElement textActual = Common.driver1.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font"));
    	Assert.assertEquals(textActual, textExpect);
	}
}
