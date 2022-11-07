package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_2
{

	@FindBy(xpath="//li[@class='oxd-userdropdown']")private WebElement username;

	public POM_2(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}

	public void verifyUN(String expectedUN)
	{
	
	String actualUN=username.getText();
	if(actualUN.equals(expectedUN))
	{
	System.out.println("Pass");
	}
	else
	{
	System.out.println("Fail");
	}
	}

	
}
