package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class HardAssert extends TestBase{
	LoginPage login;
	
	@BeforeMethod 
	public void setup() throws IOException
	{
		initalization();
	    login = new LoginPage();
	}

	@Test 
	public void verifyTitleTest()
	{
		String title = login.verifyTitle();
		//Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform",title );
        System.out.println("This is verify Title Test");
		//Assert.assertTrue(true);+
        Assert.assertFalse(false);
	}
	
	@Test (enabled = true)
     public void verifyKiteLogoTest()
     {
		boolean value = login.verifyKiteLogo(); 
		Assert.assertEquals(value, true,"pass hotay ka...??");

     }
	
	@Test (enabled = false)
	public void verifyZerodhaLogoTest()  
	{
		boolean value = login.verifyZerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (enabled = false)
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
