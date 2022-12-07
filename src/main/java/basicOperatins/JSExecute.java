package basicOperatins;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExecute {
	
	@Test
	public void JSTest() {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement buttonLogin= driver.findElement(By.xpath("//button[@type='submit']"));
		
		//clickButton(driver, buttonLogin);
		//drawBorder(driver, buttonLogin);
		//pageRefresh(driver);
		//getTitle(driver);
		//getPageSource(driver);
		alertMsg(driver, "I am a user defined alert");
		
		Alert a=driver.switchTo().alert();
		a.accept();
		alertMsg(driver, "2nd alert");
		
	}
	
	@Test (enabled=false)
	public void JSTEST2() {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://en.wikipedia.org/wiki/India");
		//scrollPageDown(driver);
		WebElement e= driver.findElement(By.linkText("Internet TLD"));
		scrollToElement(driver, e);
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollToElement(WebDriver driver, WebElement e) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", e);
	}
	
	
	public static void clickButton(WebDriver driver, WebElement buttonLogin) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", buttonLogin);
	}
	
	public static void drawBorder(WebDriver driver, WebElement buttonLogin) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid green'", buttonLogin);
		js.executeScript("arguments[0].style.backgroundColor='blue'", buttonLogin);
	}
	
	public static void pageRefresh(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public static void getTitle(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String title= js.executeScript("return document.title").toString();
		System.out.println(title);
	}
	
	public static void getPageSource(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String pgS= js.executeScript("return document.documentElement.innerText").toString();
		System.out.println(pgS);
	}
	
	public static void alertMsg(WebDriver driver, String msg) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("alert('"+msg+"')");
	}
	

}
