package POM_WithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage
{

	// 1. web elements considered as a Data members/global variables declared globally and access level should be private by using @FindBy Annotation
		@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") private WebElement UserName;
	
	
	// 2. Initialize constructor by access level public by using PageFactory class
		public PIMPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	// call the methods to perform actions on webelements
		public void VerifyUN(String EUN)
		{
			String ActualUN=UserName.getText();
	
		if(EUN.equals(ActualUN))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		}	
}
