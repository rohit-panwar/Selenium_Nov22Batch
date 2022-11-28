package basicOperatins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTest {
	
	@Test
	public void testDropdown() {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		//WebElement e= driver.findElement(By.className("col-lg-3"));
		//Select s = new Select(e);
		
		WebElement e= driver.findElement(By.className("col-lg-3"));
		Select prd= new Select(e);
		
		prd.selectByIndex(1);
		prd.selectByValue("Apple");
		prd.selectByVisibleText("Yahoo");
		
		
			
	}

}
