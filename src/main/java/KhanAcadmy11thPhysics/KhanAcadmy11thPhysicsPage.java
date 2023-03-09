package KhanAcadmy11thPhysics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcadmy11thPhysicsPage 
{
	@FindBy(xpath = "//h3[text()='Kinetic theory']") private WebElement ChaptKineticTheoryPhysics;
	public KhanAcadmy11thPhysicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickKhanAcadmy11thPhysicsPageChaptKineticTheoryPhysics() 
	{
		ChaptKineticTheoryPhysics.click();
	}
}
