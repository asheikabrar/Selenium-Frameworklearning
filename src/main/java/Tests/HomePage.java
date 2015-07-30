package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomePage {
	
	public static WebDriver driver;
	
	String expectedTitle ="Your Store";
	
	public String isPageTiltleCorrect(){		
		
	
		
		
		String title =driver.getTitle();
		System.out.println(title);
		return title;
		
	}
	
	

	public boolean isUserloggedIn() {
		// TODO Auto-generated method stub
		
		
				
		return true;
	}
	
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

