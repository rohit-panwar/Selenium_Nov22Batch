package basicOperatins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	
	@Test
	public void navigateToURL() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.co.in/");
		//driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(5000);
		//driver.navigate().to("https://www.bing.com/");
		driver.get("https://www.bing.com/");
		Thread.sleep(5000);
		driver.navigate().back(); // google
		Thread.sleep(5000);
		driver.navigate().forward(); //bing
		
	}

}
