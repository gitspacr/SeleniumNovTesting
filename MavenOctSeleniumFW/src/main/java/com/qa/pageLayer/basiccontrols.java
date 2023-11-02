package com.qa.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class basiccontrols extends TestBase{
	WebDriver rdriver;
	
//	String fname="id=firstName";//1st way
	

	//2nd way
//	By fname=By.xpath("//input[@id=firstName]");
	

	
	//3rd way
	@FindBy(xpath="//input[@id='firstName']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='femalerb']")
	WebElement frdbtn;
	
	@FindBy(xpath="//input[@id='hindichbx']")
	WebElement lchkbx;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailtxt;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passwordTxt;
	
	@FindBy(id="clearbtn")
	WebElement clrBtn;
	
	@FindBy(id="navigateHome")
	WebElement linkTxt;
	
	public basiccontrols(WebDriver ldriver){
		
		rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	public void registerform(String firstname, String lastname, String emailID, String password) throws Exception {
		
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		frdbtn.click();
		lchkbx.click();
		emailtxt.sendKeys(emailID);
		passwordTxt.sendKeys(password);
//		screenshot(rdriver, "registerform");
		Thread.sleep(3000);
		clrBtn.click();
		log.info("register form is cleared");
		
	}
	
	
	public void validateLinkText() throws Exception {
		
		if (linkTxt.isDisplayed()) {
			screenshot(rdriver, "linkTextScreen");
			linkTxt.click();
		} else {
			log.info("link text is not displayed");

		}
		
	}
	

}
