package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class SignUpPage extends BaseTest {

	@FindBy(id = "modalusername")
	WebElement username;

	@FindBy(xpath = "//input[@name='new-password']")
	WebElement password;

	@FindBy(xpath = "//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
	WebElement signup;

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;

	@FindBy(xpath = "//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
	WebElement continueToNext;

	public void setUser(String user) {

		username.sendKeys(user);

	}

	public void setPass(String pass) {

		password.sendKeys(pass);

	}

	public void signUp() {

		signup.click();

	}

	public void enterFirstName(String fName) {

		firstName.sendKeys(fName);

	}

	public void enterLastName(String lName) {

		lastName.sendKeys(lName);

	}

	public void enterContinue() {

		continueToNext.click();

	}
}
