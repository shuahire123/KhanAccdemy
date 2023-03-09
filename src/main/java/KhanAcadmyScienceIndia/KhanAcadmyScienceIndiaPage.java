package KhanAcadmyScienceIndia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcadmyScienceIndiaPage 
{
	@FindBy(xpath = "//h3[text()='Class 11 Physics (India)']") private WebElement class11ThPhysics;
	public KhanAcadmyScienceIndiaPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void clickKhanAcadmyScienceIndiaPageClass11ThPhysics() 
	{
		class11ThPhysics.click();
		
	}
}
