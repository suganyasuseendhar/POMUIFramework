package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w3schools.pages.SignUpPage;

public class SignUpTest extends SignUpPage {

	
	@Test
	public void signUpPageTestCase() {
	try {
		
	launchrowser("https://profile.w3schools.com/sign-up");	
	SignUpPage signuppage = PageFactory.initElements(driver, SignUpPage.class);
	//pagename variablename = PageFactory.initElements(WebGriver, ObjectPage);
	signuppage.setUser("lathapandi@gmail.com");
	signuppage.setPass("GSuganya@1234");	
	signuppage.signUp();
	Thread.sleep(3000);
	signuppage.enterFirstName("suganya");
	signuppage.enterLastName("suseendhar");
	signuppage.enterContinue();
	
	
	Thread.sleep(7000);
	String signUPPageTitle="Sign up - W3Schools";
	Assert.assertEquals(driver.getTitle(), signUPPageTitle);
	}
	
	catch(Exception ex){
		
		
		System.out.println("Problem while loggin into W3Schools");
		ex.printStackTrace();
		
	}
}
}