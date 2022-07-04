package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class Util1 extends TestBase {
	
	public static  void screenShot(String name) throws IOException
	{
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\Users\\Akash\\eclipse-workspace12\\26FebFramework\\Screenshots\\"+name+".png");
         FileHandler.copy(source, destination);
	}

}
