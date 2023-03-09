package KhanAcadmy11thPhysicsUnitKineticEnergy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPage 
{
	@FindBy(xpath = "//button[@class='_1f0fvyce']") private WebElement LetsGoButton;
	@FindBy(xpath = "(//div[@class='_177sg8x'])[2]") private WebElement QuestionAns1;
	@FindBy(xpath = "//button[@class='_rz7ls7u']") private WebElement CheckButton;
	public KhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickKhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPageLetsGoButton()
	{
		LetsGoButton.click();
		
	}
	public void ClickKhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPageQuestionAns1() 
	{
		QuestionAns1.click();
	}
	public void ClickKhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPageCheckButton() 
	{
		CheckButton.click();
	}

}
