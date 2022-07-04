package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.Util1;

public class TakePhoto extends TestBase{
	
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		initalization();
	    login = new LoginPage();
	}

	 
	@AfterMethod
	public void exit(ITestResult it) throws IOException
	{
		if(ITestResult.FAILURE == it.getStatus())
		{
			Util1.screenShot(it.getName());
		}
	    driver.quit();
	} 

	
	@Test  
     public void verifyKiteLogoTest()
     {
		boolean value = login.verifyKiteLogo(); 
		Assert.assertEquals(value, false);
     }
	
}
