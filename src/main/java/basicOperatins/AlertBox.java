package basicOperatins;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertBox {

	@Test
	public void alertTest() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		// Simple alert
		driver.findElement(By.name("alert")).click();
		// Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

		// Prompt alert
		driver.findElement(By.name("prompt")).click();
		// Thread.sleep(5000);
		Alert b = driver.switchTo().alert();
		b.sendKeys("Hello !!!");
		b.dismiss();
		
		// File type
		driver.findElement(By.name("upload")).sendKeys("C:\\Users\\Rohit\\Desktop\\Resume\\rohit.txt");

	}
}
