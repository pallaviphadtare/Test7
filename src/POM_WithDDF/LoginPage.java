package POM_WithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	// 1. web elements considered as a Data members/global variables declared globally and access level should be private by using @FindBy Annotation
		@FindBy(xpath="//input[@name='username']") private WebElement UN;
		@FindBy(xpath="//input[@name='password']") private WebElement PSW;
		@FindBy(xpath="//button[text()=' Login ']") private WebElement Login;
		
	// 2. Initialize constructor by access level public by using PageFactory class
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	// call the methods to perform actions on webelements
		public void EnterUN(String UserN)
		{
			UN.sendKeys(UserN);
		}
	
		public void EnterPSW(String PaaSW)
		{
			PSW.sendKeys(PaaSW);
		}
		
		public void ClickBtn()
		{
			Login.click();
		}
	
	
	
}
