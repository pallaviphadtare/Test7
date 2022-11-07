package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1 
{
	@FindBy(xpath="//input[@name='username']") private WebElement UN;
	@FindBy(xpath="//input[@name='password']") private WebElement PW;
	@FindBy(xpath="//button[text()=' Login ']") private WebElement loginbtn;

	public POM_1(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}

	public void enterUN(String username)
	{
	UN.sendKeys(username);
	}


	public void enterPW(String Password)
	{
	PW.sendKeys(Password);
	}

	public void clickloginbtn()
	{
	loginbtn.click();
	}

}
