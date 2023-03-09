package KhanAcadamyLoginModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KhanAcadmy11thPhysics.KhanAcadmy11thPhysicsPage;
import KhanAcadmy11thPhysicsUnitKineticEnergy.KhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPage;
import KhanAcadmy11thPhysicsUnitKineticEnergy.KhanAcadmy11thPhysicsUnitKineticEnergyPAge;
import KhanAcadmyDashboard.KhanAcadmyDashboardPage;
import KhanAcadmyLogin.KhanAcadamyLoginPage;
import KhanAcadmyScienceIndia.KhanAcadmyScienceIndiaPage;
import Liabrary.UtilityClass;
import Liabrary.baseClass;

public class KhanAcadamyLoginTest extends baseClass

{	int TCID;
	KhanAcadamyLoginPage login;
	KhanAcadmyDashboardPage dash;
	KhanAcadmyScienceIndiaPage sciencePage;
	KhanAcadmy11thPhysicsPage Physics;
	KhanAcadmy11thPhysicsUnitKineticEnergyPAge Unit;
	KhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPage Question;
	@BeforeClass
	public void OPenBrowser() throws IOException 
	{	TCID=0;
		Openbrowser();
	}
	
	
@BeforeMethod
public void LoginIntoKhanAcc() throws InterruptedException, IOException 
	{	TCID=1;
		login= new KhanAcadamyLoginPage(driver);
		dash = new KhanAcadmyDashboardPage(driver);
		sciencePage = new KhanAcadmyScienceIndiaPage(driver);
		Physics = new KhanAcadmy11thPhysicsPage(driver);
		Unit = new KhanAcadmy11thPhysicsUnitKineticEnergyPAge(driver);
		Question = new KhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPage(driver);
		login.inpKhanAcadamyLoginPageUserName(UtilityClass.GetPropertyFileData("UN"));
		login.inpKhanAcadamyLoginPagePassword(UtilityClass.GetPropertyFileData("PWD"));
		login.clickKhanAcadamyLoginPageloginButton();
	}
	
	@Test
	public void loginKhanAcadamy() throws IOException, InterruptedException 
	{	TCID=2;	
		Thread.sleep(3000);
		dash.clickKhanAcadmyDashboardPageCourseButton();
		Thread.sleep(3000);
		dash.clickKhanAcadmyDashboardPageScienceIndia();
		sciencePage.clickKhanAcadmyScienceIndiaPageClass11ThPhysics();
		Thread.sleep(3000);
		Physics.ClickKhanAcadmy11thPhysicsPageChaptKineticTheoryPhysics();
		Thread.sleep(3000);
		Unit.clickKhanAcadmy11thPhysicsUnitKineticEnergyPAgeCharlesLaw();
		
		Unit.clickKhanAcadmy11thPhysicsUnitKineticEnergyPAgePlayButton();
		Thread.sleep(3000);
		//String title = Unit.GetKhanAcadmy11thPhysicsUnitKineticEnergyPAgeVideoTitle();
		String title = driver.findElement(By.xpath("//div[@class='ytp-title-text']")).getText();
		System.out.println(title);
		driver.switchTo().defaultContent();
		//Assert.assertEquals(title, UtilityClass.GetTestData(0, 0));
		Unit.clickKhanAcadmy11thPhysicsUnitKineticEnergyPAgegasPhaseQuestion();
		Question.ClickKhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPageLetsGoButton();
		Question.ClickKhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPageQuestionAns1();
		Question.ClickKhanAcadmy11thPhysicsUnitKineticEnergyGasPhaseQuestionPageCheckButton();
		
	}
	@AfterMethod
	public void FailedTestCasess(ITestResult result) throws IOException 
	{
		System.out.println("result for test"+result.getStatus());
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver, TCID);
		}
	}
	@AfterClass
	public void CloseBrowser() 
	{
		driver.close();
	}
	
}

