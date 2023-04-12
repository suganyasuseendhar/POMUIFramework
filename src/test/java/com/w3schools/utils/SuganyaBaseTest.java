package com.w3schools.utils;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuganyaBaseTest {

	public static WebDriver driver = null;

//this method will launch the browser	
	public void baseTestCases() {

		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("String url");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {

			System.out.println("problem occurs while launching the browser");
			e.printStackTrace();
		}
	}
//this method will close all opened window in the particular driver

	public void quitBrowser() {

		driver.quit();

	}

	// this method will close the current working window
	public void closeBrowser() {
		try {
			driver.close();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// windows handling
	// this method will get the child window of the particular browser

	public void windowHandling() {
		try {
			String pWindow = driver.getWindowHandle();
			Set<String> windowHandle = driver.getWindowHandles();

			for (String adr : windowHandle) {

				if (!(pWindow.contentEquals(adr))) {
					driver.switchTo().window(adr);
				}
				System.out.println(adr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// this method will ger total size of the windows opened in a particular driver
	public void sizeOfTheWindow() {
		try {

			String pWindow = driver.getWindowHandle();
			Set<String> windowHandle = driver.getWindowHandles();

			for (String adr : windowHandle) {

				if (!(pWindow.contentEquals(adr))) {
					driver.switchTo().window(adr);
				}
				System.out.println(adr);

			}
			int size = driver.getWindowHandles().size();
		}

		catch (Exception e) {

		}
	}

//frames concepts

	// method for find total number of frames inside the particular webpage
	public void totalFrameSize() {

		try {

			List<WebElement> frameSize = (List<WebElement>) driver.findElement(By.tagName("iframe"));
			frameSize.size();

		} catch (Exception ex) {

			ex.printStackTrace();

		}

	}

	// this method will return the frames into the default content

	public void defaultPageText() {

		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	// this method will give frames does not contain any name or id at the time we
	// put frame size as 0, those time driver to enter normal html page
	// to inside the frame it purely work based on the index

	public void frameBasedOnIndex(int index) {

		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// this method used for based on webelement

	public void basedOnWebElement(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// this method is used for based on nameORId

	public void nmaeOrId(String value) {

		try {
			driver.switchTo().frame(value);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// this method is used for scroll up and down
	public void jsScrollUpAndDown(int value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + value + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void jsScrollRightAndLeft(int value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + value + ",0)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void jsScrollUpToElement(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void jsClick(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void jsTitle() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			System.out.println(js.executeScript("return document.title").toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void screenShot(String ssname) {
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("\"D:\\guvi automation testing\\screenshots\\twoplugs.png\"");

			FileUtils.copyFile(source, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// this method will return the flahing particular element
	public void flashingElement(WebElement element) {

		String bgcolour = element.getCssValue("backgroundcolour");

		for (int i = 0; i < 500; i++) {

			changeColour("#000000", element, driver);

			changeColour("bgcolour", element, driver);

		}

	}

	public void changeColour(String colour, WebElement element, WebDriver driver) {
		// https://www.c-sharpcorner.com/article/how-to-highlight-webelements-using-javascriptexecutor-in-selenium-webdriver/
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.backgroundColor = '" + colour + "'", element);
			// js.executeScript("arguments[0].style.backgroundColour ='yellow'", element);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// border particular element
	public void drawBorder(WebElement element) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript ( "arguments[0].style.border = '3px solid red'", element);)
			js.executeScript("arguments[0].style.border = '3px solid red'", element);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void refreshBrowser() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");

	}

	public void generateAlert(String message, WebElement element) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("alert('" + message + "')");

	}

	public void pageDown(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
