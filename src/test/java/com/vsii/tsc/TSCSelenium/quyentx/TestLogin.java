package com.vsii.tsc.TSCSelenium.quyentx;

import org.junit.Test;

public class TestLogin {

	@Test
	public void testLoginSuccess(){
		ModuleLogin.checkLoginSuccess();
	}
	
	@Test
	public void testLoginFail(){
		ModuleLogin.checkLoginUnsuccess();
	}
	
}
