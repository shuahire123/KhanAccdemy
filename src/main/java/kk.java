import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kk 
{
	WebDriver driver = new ChromeDriver();
	public void name() {
		List<WebElement> link = driver.findElements(By.name(""));
		link.size();
		//100 check box selevt last five check box
		for(int i=link.size()-5;i>=link.size();i++)
		{
			driver.findElement(By.id("")).click();
		}
		
	}
	

}
