package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class VideoPage extends BaseTest {

	
	@FindBy(xpath="//div[contains(text(),'Videos')]")
	WebElement videoButton;
	
	public void clickVideoButton() {
		
		waitForElement(videoButton);
		clickAction(videoButton);
		
		
	}
	
	//div[contains(text(),'Videos')]
}
