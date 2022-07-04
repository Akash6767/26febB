package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class TimeoutTest extends TestBase{
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		initalization();
	    login = new LoginPage();
	}

	@Test (timeOut = 10)
	public void verifyTitleTest()
	{
		String title = login.verifyTitle();
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform",title );
	//Assert.assertFalse(true);
	}
	
	@Test  (timeOut = 500 )
     public void verifyKiteLogoTest()
     {
		boolean value = login.verifyKiteLogo(); 
		Assert.assertEquals(value, true);
     }
	
	@Test (timeOut = 10)
	public void verifyZerodhaLogoTest()  
	{
		boolean value = login.verifyZerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (timeOut = 2000)
	public void loginToAppTest() throws InterruptedException, IOException
	{
		String nickname =login.loginToApp();
		Assert.assertEquals(nickname,"Akash");
	}
	 
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
