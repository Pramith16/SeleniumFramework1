import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		
		
		// ###### setting up Web driver when stored in local folder
		
				
		//System.setProperty("webdriver.chrome.driver", "C:\\Driver_exe\\chromedriver.exe");
		
		//## When saved in a folder   project directory
		
		String user_dir = System.getProperty("user.dir");
		
		System.out.println(user_dir);
		
		//System.setProperty("webdriver.chrome.driver", user_dir +"\\drivers\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-workspace\\SeleniumFramework\\drivers\\chromedriver.exe");
		
		
		///## USe WebDriverMAnager maven Repository adding to POM.xml file
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://google.com/");

	}

}
