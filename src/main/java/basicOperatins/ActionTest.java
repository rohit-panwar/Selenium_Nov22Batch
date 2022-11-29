package basicOperatins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionTest {
	
	@Test(enabled=false)
	public void mouseEvents() {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Actions actions= new Actions(driver);
		
		WebElement subMenu= driver.findElement(By.id("sub-menu"));
		
		actions.moveToElement(subMenu).build().perform();
		actions.moveToElement(driver.findElement(By.linkText("Bing"))).click().build().perform();
		
	}
	
	@Test(enabled=false)
	public void dragTest() {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement e1=driver.findElement(By.id("draggable"));
		WebElement e2=driver.findElement(By.id("droppable"));
		
		Actions actions= new Actions(driver);
		//actions.clickAndHold(e1).moveToElement(e2).release().build().perform();
		actions.dragAndDrop(e1, e2).build().perform();
		
	}
	
	@Test(enabled=false)
	public void doubleClick() {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Actions actions= new Actions(driver);
		actions.doubleClick(driver.findElement(By.id("double-click"))).build().perform();	
	}
	
	@Test()
	public void keyboardEvents() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		driver.findElement(By.name("email")).sendKeys("XYZ");
		
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		actions.contextClick().build().perform();
	}

}
