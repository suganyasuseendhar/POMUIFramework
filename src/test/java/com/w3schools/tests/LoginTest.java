package com.w3schools.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w3schools.pages.LoginPage;


public class LoginTest extends LoginPage{

	@Test
	public void loginW3Schools() {
		
	try {
		
		launchBrowser ("https://profile.w3schools.com/log-in");
		//LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.setUsername("suganit37@gmail.com");
		loginpage.setPassword("GSuganya@1234");
		loginpage.enterLogin();
		
		Thread.sleep(7000);	
		
		String loginPageTitle = "Log in - W3Schools";
		Assert.assertEquals(driver.getTitle(), loginPageTitle);
		
	}	
	catch(Exception ex)
	
	{
		
		
			System.out.println("Problem while loggin into W3Schools");
			ex.printStackTrace();
		
		
		
		
	}	
		
		
		
	}

	
}
