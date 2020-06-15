package configProperties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.GoogleSearchPageObj;

public class TestNG_propertiesFile {
	
	static WebDriver driver = null;
	static String browser_name = null;
	
	@BeforeTest
	public void setup_test () {
		
		String work_dir = System.getProperty("user.dir");
		
		browser_name = Properties_demo.getProperties();
		
		if(browser_name.equalsIgnoreCase("chrome")) {

		System.setProperty("webdriver.chrome.driver",work_dir +"\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		}
		
		else if(browser_name.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",work_dir +"\\drivers\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
	
	}
	
	
	@Test
    public static void googlesearch(){

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
