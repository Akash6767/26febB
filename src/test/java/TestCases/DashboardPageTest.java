package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase {
	
	DashboardPage dash;
	LoginPage login ;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initalization();
	    login = new LoginPage();
		dash = new DashboardPage();
		login.loginToApp();
	}
	
	@Test (enabled = false)
	public void verifyUsernameTest() throws InterruptedException
	{
		String value = dash.verifyUsername();
		Assert.assertEquals(value, "Akash Ananta Kamble");
	}
	
	
	@Test   (enabled = false)
	public void verifyEmailTest() throws InterruptedException
	{
		String value = dash.verifyEmail();
		Assert.assertEquals(value,"kambleakash679@gmail.com");
	}
	
	@Test
	public void placeGttOrderTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		 dash.placeGttOrder();
		
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
}

// hiii this is updated code  pushed by akash kamble
// hiii this is akash kamble from GitBit
// Akash ananta kamble

//hiii this is updated code  pushed by akash kamble
//hiii this is akash kamble from GitBit
//Akash ananta kamble


//hiii this is updated code  pushed by akash kamble
//hiii this is akash kamble from GitBit
//Akash ananta kamble
//6565656+65626568523


