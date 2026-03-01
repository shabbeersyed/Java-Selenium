import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		//implicit wait - 5 seconds
		
		System.setProperty("webdriver.chromedriver", "C:/Users/SUBHANI/Documents/drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("ShabbeerBasha");
		driver.findElement(By.name("inputPassword")).sendKeys("Shabbeer");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("john.ct.com");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9999999999");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='form-container sign-up-container']/form/div[1]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.findElement(By.id("chkboxOne']")).click();
		

}}
