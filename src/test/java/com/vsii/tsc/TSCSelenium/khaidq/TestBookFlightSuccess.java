package com.vsii.tsc.TSCSelenium.khaidq;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium.khaidq.ModuleLogin;

public class TestBookFlightSuccess {
	  private String username = "doquangkhai";
	  private String password = "911338";
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testFindFlightSuccess() throws Exception {
		  ModuleLogin.openHome();
		  ModuleLogin.login(username, password);
		  ModuleFind.findFlight();
		  ModuleSelect.selectFlight();
		  ModuleBook.bookFlight();
		  Assert.assertEquals(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercurypurchase2.php");
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
	}
