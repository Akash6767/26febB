package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestBase {

public static WebDriver driver;  // 1.Declaration 2.Initilization 3.Usage
	
	public String readPropertyFile(String value) throws IOException //url
	{
		Properties pro = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\Akash\\eclipse-workspace12\\26FebFramework\\src\\main\\java\\Config\\Config.Properties");
		pro.load(file);
	
		return pro.getProperty(value); //url
	}
	
	
	public void initalization() throws IOException    // 1.Declaration 2.Initilization 3.Usage
	{
		String browserName = readPropertyFile("Browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions ooo = new ChromeOptions();
		    ooo.addArguments("--disable-notifications");
				
	        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        driver = new ChromeDriver(ooo);
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		        driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Opera"))
		{
			 System.setProperty("webdriver.Opera.driver", "Operadriver.exe");
		        driver = new OperaDriver();
		}
		else if(browserName.equalsIgnoreCase("microsoft edge"))
		{
			System.setProperty("webdriver.microsoft edge.driver", "msedgeriver.exe");
	        driver = new EdgeDriver();
		}
		
		else
		{
			driver= new SafariDriver();
		}
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	  // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get(readPropertyFile("url"));
	}
	
	public String readExcelFile(int rowNum , int colNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Akash\\eclipse-workspace12\\26FebFramework\\TestData\\TestDataFile1.xlsx");
	     Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");
	     String value = excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	
	     return value;
	}
	
}

// 1.Declaration ==> String firstName;
// 2.Initilization  ==> firstName = "Akash";
// 3.Usage  ==>   syso(firstName);

