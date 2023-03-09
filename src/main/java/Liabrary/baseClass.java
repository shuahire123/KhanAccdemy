package Liabrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass 
{	 protected WebDriver driver;

public void Openbrowser() throws IOException 
	{
		driver = new ChromeDriver();
		driver.navigate().to(UtilityClass.GetPropertyFileData("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void CloseBrowser() 
	{
		driver.quit();
	}

}
