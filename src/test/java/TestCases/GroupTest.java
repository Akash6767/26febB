package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase{
	LoginPage login;
	
	@BeforeMethod  (groups = {"Sanity","Regression"})
	public void setup() throws IOException
	{
		initalization();
	    login = new LoginPage();
	}

	@Test (groups = {"Sanity"})
	public void verifyTitleTest()
	{
		String title = login.verifyTitle();
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform",title );
	//Assert.assertFalse(true);
	}
	
	@Test  (groups = {"Sanity"})
     public void verifyKiteLogoTest()
     {
		boolean value = login.verifyKiteLogo(); 
		Assert.assertEquals(value, true);
     }
	
	@Test (groups = {"Sanity"})
	public void verifyZerodhaLogoTest()  
	{
		boolean value = login.verifyZerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test 
	public void loginToAppTest() throws InterruptedException, IOException
	{
		String nickname =login.loginToApp();
		Assert.assertEquals(nickname,"Akash");
	}
	 
	@AfterMethod (groups = {"Sanity","Regression"})
	public void exit()
	{
		driver.quit();
	}

}
