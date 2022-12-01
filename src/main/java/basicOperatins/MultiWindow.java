package basicOperatins;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiWindow {
	
	@Test
	public void windowHandleTest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://www.seleniumframework.com/practiceform/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("button1")).click();
		Thread.sleep(5000);
		
		Set<String> h=driver.getWindowHandles();
		Iterator<String> it=h.iterator();
		
		//System.out.println("First");
		//System.out.println(it.hasNext());
		String parentWindow=it.next();
				
		//System.out.println("2nd");
		//System.out.println(it.hasNext());
		String childWindow=it.next();
				
		driver.switchTo().window(childWindow);
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindow);
		
		driver.close();
		
	}

}
