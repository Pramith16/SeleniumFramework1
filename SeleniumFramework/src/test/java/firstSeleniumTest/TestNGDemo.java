package firstSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.GoogleSearchPageObj;

public class TestNGDemo {

	static WebDriver driver = null;
	
	
	@BeforeTest
	public void setup_test () {
		
		String work_dir = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",work_dir +"\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
	}

	@Test
     public static void googlesearch(){

			/*
			 * driver.get("https://www.google.com/");
			 * 
			 * driver.manage().window().maximize();
			 * 
			 * driver.findElement(By.name("q")).sendKeys("ABCD");
			 * 
			 * driver.findElement(By.name("btnK")).submit();
			 */
		
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		GoogleSearchPageObj searchpagetest = new GoogleSearchPageObj(driver);
		
		searchpagetest.set_Textboxcontent("Selenium Framework");
		
		searchpagetest.click_searchbtn();
		

	}
     
     @AfterTest
     public void tearDown_test() {
    	 
    	 driver.close();
    	 
    	 driver.quit();

 		System.out.println("Completed successfully");
     }
     
     
}

