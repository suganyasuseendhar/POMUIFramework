package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class ProfileUpdatePage extends BaseTest {

	 @FindBy(xpath = "//a[text()='Profile']")
		WebElement profile;

	 
	 public void enterProfile() {

		 
		 waitForElement(profile);
			clickAction(profile);
		}
	 
	 @FindBy(name = "profile-firstname")
		WebElement fname;

		public void setFirstName(String user) {
			waitForElement(fname);
			typeText(fname, user);
		}

		@FindBy(name = "profile-lastname")
		WebElement lname;

		public void setLastName(String user) {
			waitForElement(lname);
			typeText(lname, user);
		}

		
	 
	 
	 @FindBy(xpath = "//span[text()='Edit']")
		WebElement editButton;

		public void clickEditButton() {
			waitForElement(editButton);
			clickAction(editButton);
		}

		
	 @FindBy(xpath="//input[contains(@placeholder,'nickname')]")
	 WebElement nickname;
	 
	public void petName(String user) {
		
		waitForElement(nickname);
		typeText(nickname,user);
		
		}
	
	@FindBy(xpath="//*[@id=\"profile-section\"]/div[2]/div[5]/button")
	WebElement uptoElementSave;
	
	public void elementView() {
		
		waitForElement(uptoElementSave);
		jsScrollUpToElement (uptoElementSave);
		}
	 
	
	@FindBy(xpath="//div[@class='CheckBox_wrapper__hepKG CheckBox_size_md__T+p11']")
	WebElement clickSubscription;
	
	public void clickSub() {
		
		waitForElement(clickSubscription);
		clickAction(clickSubscription);
		
	}
	@FindBy(xpath = "(//*[@id=\"profile-section\"]/div[2]/div[5]/button/div/span")
	 WebElement save2;
//*[@id="public-profile-section"]/div[2]/div[1]/div[3]/div[2]/div[1]/button/div/span

	public void clickSave2() {
		waitForElement(save2);
		clickAction(save2);
	}

	@FindBy(name = "profile_bio")
	WebElement bio;

	public void ProfileBio(String user) {
		waitForElement(bio);
		typeText(bio, user);
	}

	@FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
	WebElement save3;

	public void clickSave3() {
		jsScrollUpToElement(save3);
		//waitForElement(save3);
		jsClick(save3);
	}


	

	

   

	

	
	
	
	

	
}
