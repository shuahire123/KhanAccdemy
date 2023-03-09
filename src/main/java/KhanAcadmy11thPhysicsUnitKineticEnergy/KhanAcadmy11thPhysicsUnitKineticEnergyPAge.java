package KhanAcadmy11thPhysicsUnitKineticEnergy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KhanAcadmy11thPhysicsUnitKineticEnergyPAge 
{	WebDriver driver1;
	@FindBy(xpath = "(//div[@class='_11igkdh'])[6]") private WebElement CharlesLaw;
	@FindBy(xpath = "//span[@class='_u4s6hq5']") private WebElement gasPhaseQuestion;

	@FindBy(xpath = "//button[@class='_1lwv0f3']") private WebElement Playbutton;
	@FindBy(xpath = "//button[@title='Full screen (f)']") private WebElement MaximizeVideo;
	@FindBy(xpath = "//a[@class='ytp-title-link yt-uix-sessionlink']") private WebElement VideoTitle;
	public KhanAcadmy11thPhysicsUnitKineticEnergyPAge(WebDriver driver) 
	{	driver1= driver;
		PageFactory.initElements(driver, this);
	}
	public void clickKhanAcadmy11thPhysicsUnitKineticEnergyPAgeCharlesLaw() 
	{
		CharlesLaw.click();
	}
	public void clickKhanAcadmy11thPhysicsUnitKineticEnergyPAgePlayButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Playbutton));
		Playbutton.click();
		driver1.switchTo().frame(driver1.findElement(By.id("video_o52BW3B4efc")));
		Thread.sleep(1000);
		MaximizeVideo.click();
		
	}
	public void clickKhanAcadmy11thPhysicsUnitKineticEnergyPAgegasPhaseQuestion() {
		gasPhaseQuestion.click();
	}
	/*public String GetKhanAcadmy11thPhysicsUnitKineticEnergyPAgeVideoTitle() 
	{
		String title = VideoTitle.getText();
		return title;
	}*/
}
