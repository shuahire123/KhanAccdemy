package KhanAcadmyLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KhanAcadamyLoginPage 
{	@FindBy(xpath = "(//input[@class='_1azps1NaN'])[1]") private WebElement UserName;
	@FindBy(xpath = "//input[@type='password']") private WebElement Password;
	@FindBy(xpath = "//button[@class='_6n7s3pu']") private WebElement loginButton;
	@FindBy(xpath = "//a[text()='Forgot password?']") private WebElement forgotPassword;
	@FindBy(xpath = "//a[text()='Create an account']") private WebElement CreateNewAccount;
	public KhanAcadamyLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void inpKhanAcadamyLoginPageUserName(String UN) throws IOException 
	{
		UserName.sendKeys(UN);
	}
	public void inpKhanAcadamyLoginPagePassword(String PWD) 
	{
		Password.sendKeys(PWD);
	}
	public void clickKhanAcadamyLoginPageloginButton() 
	{
		loginButton.click();
	}
	public void clickKhanAcadamyLoginPageforgotPassword() 
	{
		forgotPassword.click();
	}
	public void clickKhanAcadamyLoginPageCreateNewAccount() 
	{
		CreateNewAccount.click();
	}
	
}
