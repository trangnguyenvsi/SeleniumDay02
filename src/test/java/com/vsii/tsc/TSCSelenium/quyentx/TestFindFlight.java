package com.vsii.tsc.TSCSelenium.quyentx;

import org.junit.Test;

public class TestFindFlight {

	
	@Test
	public void testFindFlightSuccess(){
		ModuleLogin.logIn();
		ModuleFindFlight.checkFindFlightSuccess();
	}
	
	@Test
	public void testFindFlightUnsuccess(){
		ModuleLogin.logIn();
		ModuleFindFlight.checkFindFlightUnsuccess();
	}
}
