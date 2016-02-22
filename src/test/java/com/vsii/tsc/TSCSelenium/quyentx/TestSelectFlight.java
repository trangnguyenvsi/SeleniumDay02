package com.vsii.tsc.TSCSelenium.quyentx;

import org.junit.Test;

public class TestSelectFlight {
	@Test
	public void tesSelectFlightSuccess(){
		ModuleLogin.logIn();
		ModuleFindFlight.findFlight();
		ModuleSelectFlight.checkSelectFlightSuccess();
	}
}
