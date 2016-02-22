package com.vsii.tsc.TSCSelenium.quyentx;

import org.junit.Test;
;

public class testRegister {

	@Test
	public void testRegisterSuccess(){
		
		ModuleRegister.checkRegisterSuccess();
	}
	
	@Test
	public void testRegisterUnsuccess(){
		ModuleRegister.checkRegisterUnsuccess();
	}
}
