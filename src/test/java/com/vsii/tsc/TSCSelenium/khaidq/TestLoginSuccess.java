package com.vsii.tsc.TSCSelenium.khaidq;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium.khaidq.ModuleLogin;

public class TestLoginSuccess {
	  private String username = "doquangkhai";
	  private String password = "911338";
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testLoginSuccess() throws Exception {
		  ModuleLogin.openHome();
		  ModuleLogin.login(username, password);
		  System.out.println(Common.driver.getCurrentUrl());
		  Assert.assertTrue(Common.shouldContain(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation.php"));
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
	}
