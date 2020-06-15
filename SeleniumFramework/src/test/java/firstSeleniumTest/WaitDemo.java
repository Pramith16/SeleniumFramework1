package firstSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		
		googlesearch("https://google.com/");
		
	}
	
	
	
	
	
	public static void googlesearch(String URL){
		
		String work_dir = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",work_dir +"\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		// WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("q")))
		
		driver.findElement(By.name("q")).sendKeys("Selenium Automation for beginers");
		
		driver.findElement(By.name("btnK")).click();
		
		driver.close();
		
		System.out.println("Completed successfully");
		
		
	
		
	}
}
