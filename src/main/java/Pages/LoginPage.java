package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {


	//Object Repository  [ Login Page ]
	
	@FindBy(xpath = "//img[@alt='Kite']")private WebElement kiteLogo;        //Encapsulation = data (private) + method (public)        
	@FindBy(xpath = "//img[@alt='Zerodha']")private WebElement zerodhaLogo;
	@FindBy(xpath = "//input[@id='userid']")private WebElement UserIdTextBox;
	@FindBy(xpath = "//input[@id='password']")private WebElement PasswordTextBox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginBtn;
	
	@FindBy(xpath = "//input[@id='pin']") private WebElement PinTextBox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueBtn;
	@FindBy(xpath = "//span[@class='nickname']") private WebElement nicknameLabel;

	
	
	 // Constructor use here to initialization data member
	
	public LoginPage()   // Constructor use here to initialization data member
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods 
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyKiteLogo()
	{
		return kiteLogo.isDisplayed();	
	}
	
	public boolean verifyZerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}	
	
	public String loginToApp() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		UserIdTextBox.sendKeys(readPropertyFile("username"));
		Thread.sleep(1000);

		PasswordTextBox.sendKeys(readPropertyFile("password"));
		loginBtn.click();
		Thread.sleep(2000);
		PinTextBox.sendKeys(readPropertyFile("pin"));
		Thread.sleep(2000);

		continueBtn.click();
		Thread.sleep(3000);
		
		return nicknameLabel.getText();

	}
	
}

//Encapsulation = data (private) + method (public)


