package com.w3schools.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.w3schools.utils.BaseTest;

public class BrowsePage extends BaseTest {

	@FindBy(xpath="//button[contains(text(),'Browse tutorials')]/parent::div[@class='MainHeader_buttonGroup__xl9CD']")
	WebElement browseText;
	
	
	
	public void browseTutorials() {
		
		waitForElement(browseText);
		clickAction(browseText);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Search tutorials']")
	WebElement learnSearch;
	
	
public void search() {
		
		waitForElement(learnSearch);
		typeText(learnSearch, "Java Learn");
		clickAction(learnSearch);
		
		
	}
	
    @FindBy(xpath="(//div[@class='TutorialCard_cardTitle__XFD04 card-title h5'])[1]")
      List  <WebElement> learn;
    
    
    public void learnJavaClick() {

		for (WebElement learnJava : learn) {
			if (learnJava.getText().equals("Learn Java")) {
				// clickAction(learnJava);
				jsClick(learnJava);
			}
		}

	}

    	
    	
    	
    	
    }


