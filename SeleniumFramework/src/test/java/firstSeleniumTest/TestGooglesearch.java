package firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGooglesearch {

	public static void main(String[] args) {
		
		googlesearch("https://google.com/");
		
	}
	
	
	
	
	
	public static void googlesearch(String URL){
		
		String work_dir = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",work_dir +"\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium Automation for beginers");
		
		driver.findElement(By.name("btnK")).click();
		
		driver.close();
		
		System.out.println("Completed successfully");
		
		
	
		
	}
}
