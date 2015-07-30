package Tests;
import  org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HomePageTest {
	
	 HomePage Hp = new HomePage();
	  
  @Test
  public void verifyPageTitle() {
	  
	  Assert.assertEquals(Hp.isPageTiltleCorrect(),Hp.expectedTitle);
	 	  
  }
  
  @BeforeClass
  public void beforeClass() {
	
	  
	  Hp.beforClass();
  }

  @AfterClass
  public void afterClass() {
	  Hp.afterClass();
	
  }

}
