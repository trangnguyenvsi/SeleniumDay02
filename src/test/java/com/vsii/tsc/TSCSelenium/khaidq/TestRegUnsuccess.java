package com.vsii.tsc.TSCSelenium.khaidq;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium.khaidq.ModuleLogin;
import com.vsii.tsc.TSCSelenium.khaidq.ModuleReg;

public class TestRegUnsuccess {
	  //Create username
	  private String username = "test"+ Common.rand(10000, 99999);
	  private String password = "123123";
	  private String confirmPassword = "123";
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testRegUnsuccess() throws Exception {
		  ModuleReg.openRegister();
		  ModuleReg.register(username, password, confirmPassword);
		  ModuleLogin.openHome();
		  ModuleLogin.login(username, password);
		  Assert.assertTrue(Common.shouldContain(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercurysignon.php"));
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
	}
