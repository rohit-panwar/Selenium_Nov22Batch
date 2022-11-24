package basicOperatins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BrowserOpen {
	
	WebDriver driver;
	
	@Test
	public void openChrome() {
		
		driver= new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void openFirefox() {
		
		driver= new FirefoxDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void openEdge() {
		
		driver= new EdgeDriver();
		driver.get("https://google.com");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
