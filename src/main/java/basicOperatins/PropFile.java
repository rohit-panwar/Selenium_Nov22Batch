package basicOperatins;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class PropFile {
	
	@Test(enabled=false)
	public void readFile() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Rohit\\eclipse-workspace\\NovBatch\\src\\main\\java\\basicOperatins\\data.properties");
		
		prop.load(fis);
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Server"));
		System.out.println(prop.getProperty("Browser"));
	}
	
	@Test
	public void screenShot() throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.bing.com/");
		
		
		File s=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(s, "C:\\myscreenshot.jpeg");
		
		FileHandler.copy(s, new File("D:\\myscreenshot.jpeg"));
		
	}

}
