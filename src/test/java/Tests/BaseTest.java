package Tests;
import org.junit.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforClass()
	{
		
		driver = new FirefoxDriver();
		driver.get("http://localhost:81/opencart/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	
	public static void afterClass(){
		
	
		driver.quit();
		
	}
	
}
