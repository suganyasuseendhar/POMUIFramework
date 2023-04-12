package com.w3schools.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3schools.pages.LoginPage;
import com.w3schools.pages.ProfileUpdatePage;
import com.w3schools.pages.VideoPage;
import com.w3schools.utils.BaseTest;

public class VideoTestPage extends VideoPage{

	@Test
	
public void videoBtnTest() {
		
		
	    launchBrowser("https://profile.w3schools.com/log-in");	
		VideoPage video = PageFactory.initElements(driver, VideoPage.class);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		ProfileUpdatePage profilePage = PageFactory.initElements(driver, ProfileUpdatePage.class);
		
		
		loginpage.setUsername("suganit37@gmail.com");
		loginpage.setPassword("GSuganya@1234");
		loginpage.enterLogin();
		profilePage.enterProfile();
		video.clickVideoButton();
		video.windowHandling();
		video.screenShot1("Videos");
		
	}


	
}
