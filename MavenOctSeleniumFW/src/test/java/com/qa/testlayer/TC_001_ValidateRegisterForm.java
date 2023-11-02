package com.qa.testlayer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pageLayer.basiccontrols;
import com.qa.testdata.DataDriven;


public class TC_001_ValidateRegisterForm extends TestBase{
	
	
	
	@Test(dataProvider="passDataFromExcel", dataProviderClass=DataDriven.class)
	public void validateRegisterForm(String FirstName, String LastName, String emailID, String password) throws Exception {
		basiccontrols bc=new basiccontrols(driver);
		bc.registerform(FirstName,LastName,emailID,password);
		screenshot(driver, "registerForm");
	}
	
	

	@Test
	public void validateLinkTextinBC() throws Exception {
		basiccontrols bc=new basiccontrols(driver);
		bc.validateLinkText();
//		screenshot(driver, "linkTextScreen");
	}
	

}
