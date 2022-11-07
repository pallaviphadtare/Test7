package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test4
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/class/Pallavi/Daily%20Notes/Daily%20Notes_Automation/Selenium/MultiselectableListbox%20(1).html");
	WebElement multiselectedlistbox=driver.findElement(By.xpath("//select[@id='1234']"));
	Select S1=new Select(multiselectedlistbox);
	S1.selectByVisibleText("Ind");
	S1.selectByIndex(3);
	S1.selectByIndex(1);
	S1.selectByIndex(2);
	List<WebElement> S2=S1.getAllSelectedOptions();
	for(WebElement S3:S2)
	{
		System.out.println(S3.getText());
	}
	
	
	
	
	
}
}
