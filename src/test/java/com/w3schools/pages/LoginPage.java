package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(id="modalusername")
	WebElement username;
	
	@FindBy(xpath="//input[@name='current-password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement login;

	
	public void setUsername (String newUser) {
		
		//username.sendKeys(newUser);
		
		waitForElement(username);
		typeText(username, newUser);
	}
	
	
public void setPassword (String newPassword) {
		
		//password.sendKeys(newPassword);
	waitForElement(password);
	typeText(password, newPassword);
	}


public void enterLogin() {
	
	
	//login.click();
	waitForElement(login);
	clickAction(login);
	
	}
}
