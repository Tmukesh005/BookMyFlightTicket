package org.stepdefinition;

import org.commonmethods.CommonMethods;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends CommonMethods {
	@Before
	public void browser() {
		bLaunch();;
		
	}
	@After
	public void closebrowser() {
		//cLaunch();
	}

}
