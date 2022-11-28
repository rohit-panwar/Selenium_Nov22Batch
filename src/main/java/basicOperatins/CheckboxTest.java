package basicOperatins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxTest {
	
	@Test
	public void testCheckbox() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		// Checkbox
		System.out.println("Red Checkbox: "+driver.findElement(By.xpath("//input[@value='red']")).isSelected());
		driver.findElement(By.xpath("//input[@value='red']")).click();
		
		System.out.println("Red Checkbox: "+driver.findElement(By.xpath("//input[@value='red']")).isSelected());
		
		//driver.findElement(By.xpath("//input[@value='orange']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='orange']")).click();
		
		// Radio Box
		//driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		
		
		
	}

}
