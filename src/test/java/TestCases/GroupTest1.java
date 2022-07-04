package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest1 extends TestBase{
	LoginPage login;
	
	@BeforeMethod (groups = {"Akash","Ajinkya"})
	public void setup() throws IOException
	{
		initalization();
	    login = new LoginPage();
	}

	@Test (groups = {"Akash"})
	public void verifyTitleTest()
	{
		String title = login.verifyTitle();
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform",title );
	//Assert.assertFalse(true);
	}
	
	@Test (groups = {"Akash"})
     public void verifyKiteLogoTest()
     {
		boolean value = login.verifyKiteLogo(); 
		Assert.assertEquals(value, true);
     }
	
	@Test (groups = {"	"})
	public void verifyZerodhaLogoTest()  
	{
		boolean value = login.verifyZerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (groups = {"Ajinkya"})
	public void loginToAppTest() throws InterruptedException, IOException
	{
		String nickname =login.loginToApp();
		Assert.assertEquals(nickname,"Akash");
	}
	 
	@AfterMethod (groups = {"Akash","Ajinkya"})
	public void exit()
	{
		driver.close();
	}

}
