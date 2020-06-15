package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObj {

	///  This is also one of the basic way to run the test

	/*
	 * static WebElement element = null;
	 * 
	 * public static WebElement search_textbox (WebDriver driver) {
	 * 
	 * element = driver.findElement(By.name("q"));
	 * 
	 * return element;
	 * 
	 * }
	 * 
	 * 
	 * public static WebElement search_button (WebDriver driver) {
	 * 
	 * element = driver.findElement(By.name("btnK"));
	 * 
	 * return element;
	 * 
	 * }
	 */
 


	// Proper POM model method

	WebDriver driver = null; // this driver initialization will not work, 
					 //it will generate new insatnce of driver, but we need diver instance from the main test class

	By search_box = By.name("q");
	By search_btn = By.name("btnK");


	//So create a constructor method to instantiate the driver
	
	public GoogleSearchPageObj(WebDriver driver) {
		
		this.driver = driver; 
	}


	public void set_Textboxcontent (String text) {

		driver.findElement(search_box).sendKeys(text);
	}

	public void click_searchbtn () {

		driver.findElement(search_btn).submit();
	}
}