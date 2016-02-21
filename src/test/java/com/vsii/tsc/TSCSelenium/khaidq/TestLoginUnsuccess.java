package com.vsii.tsc.TSCSelenium.khaidq;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginUnsuccess {
	private String username = "doquangkhai";
	private String wrongPass = "123456";
	@BeforeTest
	public void setUp() throws Exception {
		Common.setup();
	}

	@Test
	public void testLoginUnuccess() throws Exception {
		ModuleLogin.openHome();
		ModuleLogin.login(username, wrongPass);
		Assert.assertTrue(Common.shouldContain(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercurysignon.php"));
	  }

	@AfterTest
	public void tearDown() throws Exception {
		Common.teardown();
	  }
	}
