package Tests;
import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.Test;


public class Yahoologin {

	@Test
	public void verifyLogin() {
		
		LoginPage  loginpage = new LoginPage();
		HomePage homepage = loginpage.login("ahamed_abrar","Maznah01");
	
		Assert.assertTrue(homepage.isUserloggedIn());
		
	}

}
