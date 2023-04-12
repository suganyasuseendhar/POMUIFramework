package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w3schools.pages.LoginPage;
import com.w3schools.pages.ProfileUpdatePage;
import com.w3schools.pages.SignUpPage;



	
	public class ProfileUpdateTestPage extends ProfileUpdatePage{

		@Test
		public void loginW3Schools() {
			
		try {
			
			launchBrowser ("https://profile.w3schools.com/log-in");
			
			
			
			
			LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
			SignUpPage signuppage = PageFactory.initElements(driver, SignUpPage.class);
			ProfileUpdatePage profilePage = PageFactory.initElements(driver, ProfileUpdatePage.class);
			
			
			loginpage.setUsername("suganit37@gmail.com");
			loginpage.setPassword("GSuganya@1234");
			loginpage.enterLogin();
			profilePage.enterProfile();
			profilePage.setFirstName("suganya");
			profilePage.setLastName("suseendhar");
		      profilePage.elementView();
		       profilePage.clickSub();
		     profilePage.clickSave2();
		  
			profilePage.petName("shibin");
			//profilePage.clickSave2();
			profilePage.ProfileBio("Im suganya, Automation Testing Analyst");
			profilePage.clickSave3();
			
			
			Thread.sleep(7000);	
			
			/*String loginPageTitle = "Log in - W3Schools";
			Assert.assertEquals(driver.getTitle(), loginPageTitle);*/
			
		}	
		catch(Exception ex)
		
		{
			
			
				System.out.println("Problem while loggin into W3Schools");
				ex.printStackTrace();
			
			
			
			
		}	
			
			
			
		}

	
	
	
}
