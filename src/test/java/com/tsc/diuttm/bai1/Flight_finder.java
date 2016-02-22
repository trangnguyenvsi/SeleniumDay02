package com.tsc.diuttm.bai1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Flight_finder {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/");
    }

    @Test
    public void find_flight() throws Exception {
        driver.findElement(By.name("userName")).sendKeys("diuttm");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("login")).click();
        new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("1");
        new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
        new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("March");
        new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText("1");
        new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("New York");
        new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("April");
        new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("2");
        driver.findElement(By.name("findFlights")).click();
        String actual= driver.findElement(By.xpath(".//*[contains(text(), 'Select your departure')]")).getText();
        Assert.assertEquals(actual, "Select your departure and return flight from the selections below. Your total price will be higher than quoted if you elect to fly on a different airline for both legs of your travel.");
    }

    @After
   public void tearDown() throws Exception {
       driver.quit();
   }
}
