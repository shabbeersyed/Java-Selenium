import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;


public class SelIntroduction {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods
		
		// chromedriver.exe -> Chrome browser
		// step to invoke chrome driver
		//Selenium manager
		System.setProperty("webdriver.chrome.driver", "C:/Users/SUBHANI/Documents/drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 //System.setProperty("webdriver.gecko.driver", "C:/Users/SUBHANI/Documents/geckodriver-v0.36.0-win-aarch64/geckodriver.exe");
		 //Firefox Launch
		 //geckodriver
		 //WebDriver driver = new FirefoxDriver();
		 driver.get("https://rahulshettyacademy.com");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.quit();

	}

}
