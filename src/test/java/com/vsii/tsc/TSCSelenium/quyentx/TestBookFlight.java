package com.vsii.tsc.TSCSelenium.quyentx;

import org.junit.Test;

public class TestBookFlight {
	@Test
	public void testBookFlightSuccess(){
		ModuleLogin.logIn();
		ModuleFindFlight.findFlight();
		ModuleSelectFlight.selectFlight();
		ModuleBookFlight.checkBookFlightSuccess();
	}

	@Test
	public void testBookFlightUnsuccess(){
		ModuleLogin.logIn();
		ModuleFindFlight.findFlight();
		ModuleSelectFlight.selectFlight();
		ModuleBookFlight.checkBookFlightUnsuccess();
	}
}
