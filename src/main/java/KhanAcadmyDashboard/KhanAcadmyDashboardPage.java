package KhanAcadmyDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcadmyDashboardPage 
{
	@FindBy(xpath = "//button[@class='_tr38f8i']") private WebElement CourseButton;
	@FindBy(xpath = "(//a[@class='_rwpuzd'])[6]") private WebElement ScienceIndia;
	@FindBy(xpath = "//li[@data-navigable-index='11']") private WebElement eleventhclass;
	public KhanAcadmyDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickKhanAcadmyDashboardPageCourseButton()
	{
		CourseButton.click();
	}
	public void clickKhanAcadmyDashboardPageScienceIndia() 
	{
		ScienceIndia.click();
	}
	public void clickKhanAcadmyDashboardPageeleventhclass() 
	{
		eleventhclass.click();
	}

}
