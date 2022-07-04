package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class PriorityTest extends TestBase{
	
	

		LoginPage login;
		@BeforeMethod
		public void setup() throws IOException
		{
			initalization();
		    login = new LoginPage();
		}

		@Test (priority = 0)
		public void verifyTitleTest()
		{
			String title = login.verifyTitle();
			Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform",title );
		     Reporter.log("Executing Title Test");

		}
		
		@Test  (priority = 1 ,invocationCount = 3)
	     public void verifyKiteLogoTest()
	     {
			boolean value = login.verifyKiteLogo(); 
			Assert.assertEquals(value, true);
	     Reporter.log("Executing kiteLogo Test");
	     }
		
		@Test (priority = 2)
		public void verifyZerodhaLogoTest()  
		{
			boolean value = login.verifyZerodhaLogo();
			Assert.assertEquals(value, true);
		     Reporter.log("Executing ZerodhaLogo Test");

		}
		
		@Test (priority = 3)
		public void loginToAppTest() throws InterruptedException, IOException
		{
			String nickname =login.loginToApp();
			Assert.assertEquals(nickname,"Akash");
		     Reporter.log("Executing loginToAppTest");

		}
		 
		@AfterMethod
		public void exit()
		{
			driver.close();
		} 

}
