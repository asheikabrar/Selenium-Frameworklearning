package Tests;
import org.junit.Assert;
import org.testng.*;
import org.testng.annotations.Test;

public class YahooTestNG {

	@Test
	public void loginPage()
	
	{
		LoginPage  loginpage = new LoginPage();
		HomePage homepage = loginpage.login("ahad_abrar","Maznah01");
	
		Assert.assertTrue(homepage.isUserloggedIn());
		
	
	}
	
}
