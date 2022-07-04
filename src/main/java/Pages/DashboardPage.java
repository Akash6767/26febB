package Pages;

import java.io.IOException;
import java.lang.module.FindException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {
	
	
	//Object Repository [Dashboard Page]
	
	@FindBy(xpath = "//div[@class='avatar']") private WebElement avatarIcon;
	@FindBy(xpath = "//h4[@class='username']") private WebElement Username;
	@FindBy(xpath = "//div[@class='email']") private WebElement Email ;
	
	
	@FindBy(xpath = "//button[text()='Start investing ']") private WebElement startInvesBtn;
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement searchBar;
	@FindBy(xpath = "//span[@class='tradingsymbol']") private WebElement selectShare;
	@FindBy(xpath = "(//button[@class='button-outline button-blue'])[1]") private WebElement createGTT;
	@FindBy(xpath = "//input[@label='Trigger price']") private WebElement trigerPriceTextBox;
	@FindBy(xpath = "//input[@label='Qty.']") private WebElement qtyTextBox;
	@FindBy(xpath = "//input[@label='Price']") private WebElement priceTextBox;
	@FindBy(xpath = "//button[@class='button-outline cancel']") private WebElement cancelBtn;
  //@FindBy(xpath = "//button[@class='place button-blue']") private WebElement placeBtn;
	
	
	 // Constructor use here to initialization data member
	
	public  DashboardPage() // constructor
	{
		PageFactory.initElements(driver, this);
	}

	//Methods
	
	public String verifyUsername() throws InterruptedException
	{
		avatarIcon.click();
		Thread.sleep(2000);
		return Username.getText();
	}
	
	public String verifyEmail() throws InterruptedException
	{
		avatarIcon.click();
		Thread.sleep(2000);
		return Email.getText();     
	}
	
	public void placeGttOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(2000);

		startInvesBtn.click();	
		Thread.sleep(2000);
        searchBar.sendKeys(readExcelFile(0, 0));
		Thread.sleep(2000);
		selectShare.click();
		Thread.sleep(4000);
		createGTT.click();
		Thread.sleep(2000);
		trigerPriceTextBox.clear();
		Thread.sleep(2000);
		trigerPriceTextBox.sendKeys(readExcelFile(0, 1));
		Thread.sleep(2000);
		qtyTextBox.clear();
		Thread.sleep(2000);
		qtyTextBox.sendKeys(readExcelFile(0, 2));
		Thread.sleep(2000);
		priceTextBox.clear();
		Thread.sleep(2000);
		priceTextBox.sendKeys(readExcelFile(0, 3));
		Thread.sleep(2000);
		cancelBtn.click();
		Thread.sleep(2000);

	}
	
	
	
	
	
	
	
	
	
	
	

}
