package basicOperatins;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorClass {

	@Test(enabled=false)
	public void openOrangeBook() {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement a=driver.findElement(By.name("username"));
		a.sendKeys("Admin");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
	}
	
	@Test(enabled=false)
	public void otherLocator() {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.className("input_error")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector(".input_error")).sendKeys("standard_user11");
		//cssSelector :   .classname, #id
		driver.findElement(By.cssSelector("#password")).sendKeys("ABC");
		
	}
	
	@Test(enabled=false)
	public void linkText() {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.partialLinkText("Orange")).click();
		
	}
	
	@Test()
	public void tagName() {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demoqa.com/links");

		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		int listSize=allLinks.size();
		
		for(int i=0; i<listSize; i++) {
			System.out.println(allLinks.get(i).getAttribute("href"));
			//System.out.println(allLinks.get(i).getText());
		}
		
		
		
		
	}
}
