package firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.GoogleSearchPageObj;

public class FrameworkGoogleTest {

	static WebDriver driver = null;
	
	public static void main(String[] args) {

		googlesearch("https://google.com/");

	}


	public static void googlesearch(String URL){

		String work_dir = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",work_dir +"\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(URL);

		driver.manage().window().maximize();

		//GoogleSearchPageObj.search_textbox(driver).sendKeys("Selenium Automation for beginners");
		
		//GoogleSearchPageObj.search_button(driver).submit();
		
		GoogleSearchPageObj searchpagetest = new GoogleSearchPageObj(driver);
		
		searchpagetest.set_Textboxcontent("Selenium Framework");
		
		searchpagetest.click_searchbtn();

		driver.close();

		System.out.println("Completed successfully");




	}
}
