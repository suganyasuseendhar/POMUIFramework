package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3schools.pages.BrowsePage;
import com.w3schools.pages.LoginPage;

import com.w3schools.utils.BaseTest;


public class BrowseTestPage extends BrowsePage {
	@Test
	public void searchJava() {
	
		launchBrowser("https://profile.w3schools.com/log-in");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		BrowsePage search = PageFactory.initElements(driver, BrowsePage.class);
		
		loginpage.setUsername("suganit37@gmail.com");
		loginpage.setPassword("GSuganya@1234");
		loginpage.enterLogin();
		
		search.browseTutorials();
		
        search.search();
		
		search.learnJavaClick();

		
	}



  

}


